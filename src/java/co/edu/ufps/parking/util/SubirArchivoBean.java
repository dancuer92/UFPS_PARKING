/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.ufps.parking.util;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.upload.*;
import java.util.Hashtable;
import javax.servlet.http.HttpServletRequest;
/**
 *
 * @author madarme
 */
public class SubirArchivoBean {


    private UploadBean upBean=new UploadBean();
    private HttpServletRequest request;
    UploadFile file=null;
    private String nombreCampoFile="";

    
    public SubirArchivoBean(HttpServletRequest request, String ruta, String campo) {
        this.request = request;
        this.nombreCampoFile=campo;
        try {
            this.upBean.setFolderstore(ruta);
        } catch (UploadException ex) {
            Logger.getLogger(SubirArchivoBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean subirFile()
    {
       try {
            if (!MultipartFormDataRequest.isMultipartFormData(this.request))
               return(false);
            MultipartFormDataRequest mrequest = new MultipartFormDataRequest(this.request);
            Hashtable files = mrequest.getFiles();
                if ( (files != null) && (!files.isEmpty()) )
                {
                    this.file = (UploadFile) files.get(this.nombreCampoFile);
                    if (this.file == null)
                        return(false);
                    upBean.store(mrequest, this.nombreCampoFile);
                    return(true);
                }
                else
                   return(false);
        } catch (UploadException ex) {
            Logger.getLogger(SubirArchivoBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SubirArchivoBean.class.getName()).log(Level.SEVERE, null, ex);
        }
     return(false);
    }


public String getNombreCampoFile() {
        return nombreCampoFile;
    }

    public void setNombreCampoFile(String nombreCampoFile) {
        this.nombreCampoFile = nombreCampoFile;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public UploadBean getUpBean() {
        return upBean;
    }

    public String getTipoArchivo()
    {
            if(this.file==null)
                return ("Error no hay archivo subido");
            return (this.file.getContentType());
    }

    public String getNombreArchivo()
    {
        if(this.file==null)
                return ("Error no hay archivo subido");
            return (this.file.getFileName());

    }

    public String getSizeArchivo()
    {
        if(this.file==null)
                return ("Error no hay archivo subido");
            return (this.file.getFileSize()+" Bytes");
    }

}
