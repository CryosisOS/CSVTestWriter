/*
 * Author: Nathan van der Velde
 * Date Created: 2018-01-15
 * Last Modified By: Nathan van der Velde
 * Date Last Modified: 2018-01-15
 * Description: This source code is used to modify the file with the generated fields.
 */

public class ModifyFile
{
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
}//END class ModifyFile
