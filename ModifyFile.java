/*
 * Author: Nathan van der Velde
 * Date Created: 2018-01-15
 * Last Modified By: Nathan van der Velde
 * Date Last Modified: 2018-01-15
 * Description: This source code is used to modify the file with the generated fields.
 */

//IMPORTS
import java.io.IOException;

public class ModifyFile
{
    //CLASS FIELDS
    private File fileToModify;
    private File modifiedFile;
    private boolean fileStatus;
    private boolean modifiedStatus;
    
    /*DEFAULT CONSTRUCTOR*/
    public ModifyFile()
    {
        fileToModify = null;
        modifiedFile = null;
        setFileStatus();
        setModifiedStatus();
    }//END DEFAULT CONSTRUCTOR
    
    /**
     * ALTERNATE CONSTRUCTOR
     * IMPORTS: File inFileToModify
     */
    public ModifiyFile(File inFileToModify) throws IOException
    {
        try
        {
            setFileToModify(inFileToModify);
            modifiedFile = null;
        }//END TRY
        catch(IOException ioex)
        {
            throw ioex
        }//END CATCH
        setFileStatus();
        setModifiedStatus();
    }//END ALTERNATE CONSTRUCTOR
    
    public void setFileToModify(File inFile) throws IOException
    {
        try
        {
            fileToModify = inFile;
        }//END TRY
        catch(IOException ioex)
        {
            throw ioex;
        }//END CATCH
    }//END setFileToModify
    
    public File getFileToModify() throws IOException
    {
        File copyFile;
        try
        {
            copyFile = fileToModify;
        }//END TRY
        catch(IOException ioex)
        {
            throw ioex;
        }//END CATCH
        return copyFile;
    }//END getFileToModify
    
    public void setModifiedFile(File inFile) throws IOException
    {
        try
        {
            modifedFile = inFile;
        }//END TRY
        catch(IOException ioex)
        {
            throw ioex;
        }//END CATCH
    }//END setModifiedFile
    
    public File getModifiedFile() throws IOException
    {
        File outFile;
        try
        {
            outFile = modifiedFile;
        }//END TRY
        catch(IOException ioex)
        {
            throw ioex;
        }//END CATCH
        return outFile;
    }//END getModifiedFile
    
    private void setFileStatus() throws IOException
    {
        fileStatus = false;
        try
        {
            if(fileToModify != null)
            {
                fileStatus = true;
            }//END IF
        }//END TRY
        catch(IOException ioex)
        {
            throw ioex;
        }//END CATCH
    }//END setFileStatus
    
    public boolean getFileStatus()
    {
        return fileStatus;
    }//END getFileStatus
    
    private void setModifiedStatus()
    {
        modifiedStatus = false;
        try
        {
            if(modifiedFile != null)
            {
                modifiedStatus = true;
            }//END IF
        }//END TRY
        catch(IOException ioex)
        {
            throw ioex;
        }//END CATCH
    }//END setModifiedStatus
    
    public boolean getModifiedStatus()
    {
        return modifiedStatus;
    }//END getModifiedStatus
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    // PUBLIC DOING METHODS //
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

    public static modFile()
    {
        /// DECLERATION OF VARIABLES
        String [] contentToModify;


        /// DEFINEMENT OF METHOD
        contentToModify = ReadFile.getContent();

    }//END modFile
}//END class ModifyFile
