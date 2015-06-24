/**
 * @(#)Seguridad.java
 *
 *
 * @author FELIX ALBERTO ARIZA NI�O.
 * @version 1.00 2008/7/31
 */

package co.edu.ufps.parking.util;

import java.util.*;
import java.security.*;
import javax.crypto.*;
import java.security.AlgorithmParameters;
import javax.crypto.spec.*;

import java.text.*;
import java.io.*;

public class Seguridad
{			
	public PBEKeySpec pbeKeySpec;
	public PBEParameterSpec pbeParamSpec;
	public SecretKeyFactory keyFac;
	public Cipher pbeCipher;
	public SecretKey pbeKey;
				
	public byte[] salt = {
								(byte)0xc7, (byte)0x73, (byte)0x21, (byte)0x8c,
								(byte)0x7e, (byte)0xc8, (byte)0xee, (byte)0x99
								};
				
	public Seguridad(char[] clave,int count)
	{
		try
		{
			// Crear el par�metro PBE con los valores de los par�metros de encriptaci�n
			// clave y count
			pbeParamSpec = new PBEParameterSpec(salt, count);
			pbeKeySpec = new PBEKeySpec(clave);
			keyFac = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
			pbeKey = keyFac.generateSecret(pbeKeySpec);
			
			// Crear el objeto PBE Cipher
			pbeCipher = Cipher.getInstance("PBEWithMD5AndDES");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public String encriptar(String pass)
	{
		String cadena="";
		try
		{
			// Inicializar el objeto PBE Cipher con la llave y los par�metros
			pbeCipher.init(Cipher.ENCRYPT_MODE, pbeKey, pbeParamSpec);

			String password= pass;  
			byte[] texto_normal = password.getBytes();
			
			int size=8;
			if (password.length()>8) size=16;
			
			// Encriptar el password
			byte[] texto_cifrado = pbeCipher.doFinal(texto_normal);
			
			//Convertir en la cadena a guardar en la base de datos
			int temp;
			for(int i=0;i<texto_cifrado.length;i++) 
			{
				temp=(int)texto_cifrado[i];
				if (temp<0)
					if (temp>-16)
						cadena=cadena+"0"+Integer.toString(temp,16);
					else
						cadena=cadena+Integer.toString(temp,16);
				else
					if (temp<16)
						cadena=cadena+"00"+Integer.toString(temp,16);
					else
						cadena=cadena+"0"+Integer.toString(temp,16);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//Retornar el password encriptado
		return cadena;
	}

	public boolean verificar_password(String pass_true,String pass_user)
	{
		boolean verif = true;
		try
		{
			byte[] texto_normal;
			
			//Password almacenado en la base de datos
			String guardada=pass_true.trim();
			int cont=0;
			String[] temp3=new String[guardada.length()/3];
			byte[] temp2=new byte[guardada.length()/3];
	
			//Convertir a byte
			for(int i=0;i<guardada.length();i=i+3) 
			{
				temp3[cont]=guardada.substring(i,i+3);
				if (!temp3[cont].equals("000"))
				{
				while(temp3[cont].charAt(0)=='0')
					temp3[cont]=temp3[cont].substring(1,temp3[cont].length());
				}
				temp2[cont]=(byte)Integer.valueOf(temp3[cont], 16).intValue();
				cont++;
			}
			
			pbeCipher.init(Cipher.DECRYPT_MODE, pbeKey, pbeParamSpec);
			byte[] texto_normal2 = pbeCipher.doFinal(temp2);
			
			//Comparar
			String leida=pass_user;
			//leida es la que el usuario introduce
			texto_normal = leida.getBytes();
			byte b;
			int longitud=texto_normal.length;
			if (leida.length()!=texto_normal2.length) verif=false;
			else
			{
			for (int i=0;i<texto_normal.length;i++)
				{
				b = (byte)(texto_normal[i]^texto_normal2[i]); 
				if (b!=0) verif=false;
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			verif=false;
		}
		return verif;
	}
	
	public String clave_aleatoria()
	{
		String nuevo_password="";
		try
		{
			Random aleatorio = new Random();
			int suma = aleatorio.nextInt(8);
			int posicion,num;
			
			for (int i=0;i<(8+suma);i++)
			{
				num=aleatorio.nextInt(26);
				posicion=aleatorio.nextInt(2);
				if (posicion==0)
					nuevo_password=nuevo_password+(char)(65+num);
				else
					nuevo_password=nuevo_password+(char)(97+num);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return nuevo_password;
	}
}