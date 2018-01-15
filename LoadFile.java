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

public class LoadFile
{
    private File loadedFile;
    private boolean status;
    
    /*DEFAULT CONSTRUCTOR */
    public LoadFile()
    {
        loadedFile = null;
        setStatus();
    }//END DEFAULT CONSTRUCTOR
    
    /**
     * ALTERNATE CONSTRUCTOR
     * IMPORTS: File inFile
     */
    public LoadFile(String inFileName)
    {
        setLoadedFile(inFileName);
        setStatus();
    }//END ALTERNATE CONSTRUCTOR
    
    public void setLoadedFile(String inFileName) throws IOException
    {
        try
        {
            loadedFile = new File(inFileName);
        }//END TRY
        catch(IOException ioex)
        {
            throw ioex;
        }//END CATCH
    }//END setLoadedFile
    
    public File getLoadedFile() throws IOException
    {
        File outFile;
        try
        {
            outFile = loadedFile;
        }//END TRY
        catch(IOException ioex)
        {
            throw ioex;
        }//END CATCH
        return outFile;
    }//END getLoadedFile
    
    private void setStatus() throws IOException
    {
        File file;
        status = false;
        try
        {
            file = getLoadedFile();
            if(file==null)
            {
               status = true; 
            }//ENDIF
        }//END TRY
        catch(IOException ioex)
        {
            throw ioex;
        }//END CATCH
    }//END setStatus
    
    public boolean getStatus()
    {
        return status;
    }//END getStatus    
}//END class LoadFile
