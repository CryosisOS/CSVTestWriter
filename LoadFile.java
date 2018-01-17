/*
 * Author: Nathan van der Velde
 * Date Created: 2018-01-15
 * Last Modified By: Nathan van der Velde
 * Date Last Modified: 2018-01-15
 * Description: This source code is for the loading the file into the system that is going to be
 * modified.
 */

//IMPORTS
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class LoadFile
{
    private File loadedFile;
    private boolean status;
    
    /*DEFAULT CONSTRUCTOR */
    public LoadFile() throws IOException
    {
        loadedFile = null;
        setStatus();
    }//END DEFAULT CONSTRUCTOR
    
    /**
     * ALTERNATE CONSTRUCTOR
     * IMPORTS: File inFile
     */
    public LoadFile(String inFileName) throws IOException
    {
        setLoadedFile(inFileName);
        setStatus();
    }//END ALTERNATE CONSTRUCTOR
    
    public void setLoadedFile(String inFileName)
    {
        loadedFile = new File(inFileName);
    }//END setLoadedFile
    
    public File getLoadedFile()
    {
        File outFile;
        outFile = loadedFile;
        return outFile;
    }//END getLoadedFile
    
    private void setStatus()
    {
        File file;
        status = false;
        file = getLoadedFile();
        if(file==null)
        {
            status = true; 
        }//ENDIF
    }//END setStatus
    
    public boolean getStatus()
    {
        return status;
    }//END getStatus
}//END class LoadFile
