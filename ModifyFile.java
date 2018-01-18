/*
 * Author: Nathan van der Velde
 * Date Created: 2018-01-15
 * Last Modified By: Nathan van der Velde
 * Date Last Modified: 2018-01-18
 * Description: This source code is used to modify the file with the generated fields.
 */

//IMPORTS
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.io.File;

public class ModifyFile
{
    //CLASS FIELDS
    private File fileToModify;
    private boolean fileStatus;
    
    /*DEFAULT CONSTRUCTOR*/
    public ModifyFile() throws IOException
    {
        fileToModify = null;
        try
        {
            setFileStatus();
        }//END TRY
        catch(IOException ioex)
        {
            throw ioex;
        }//END CATCH
    }//END DEFAULT CONSTRUCTOR
    
    /**
     * ALTERNATE CONSTRUCTOR
     * IMPORTS: File inFileToModify
     */
    public ModifyFile(File inFileToModify) throws IOException
    {
        try
        {
            setFileToModify(inFileToModify);
            setFileStatus();    
        }//END TRY
        catch(IOException ioex)
        {
            throw ioex;
        }//END CATCH
    }//END ALTERNATE CONSTRUCTOR
    
    public void setFileToModify(File inFile)
    {
        fileToModify = inFile;
    }//END setFileToModify
    
    public File getFileToModify() throws IOException
    {
        File copyFile;
        copyFile = fileToModify;
        return copyFile;
    }//END getFileToModify
    
    private void setFileStatus() throws IOException
    {
        fileStatus = false;
        if(fileToModify != null)
        {
            fileStatus = true;
        }//END IF
    }//END setFileStatus
    
    public boolean getFileStatus()
    {
        return fileStatus;
    }//END getFileStatus
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    // PUBLIC DOING METHODS //
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

    public void modFile() throws IOException
    {
        /// DECLERATION OF VARIABLES
        int nameLength = 10;
        int surnameLength = 30;
        int numNames, numSurnames;
        String newFileName;
        String [] contentToModify;
        String [][] newContent;
        String [] names;
        String [] surnames;
        StringGenerator nameGen = new StringGenerator(nameLength, ThreadLocalRandom.current());
        StringGenerator surnameGen = new StringGenerator(surnameLength, ThreadLocalRandom.current());

        /// DEFINEMENT OF METHOD
        try
        {
            contentToModify = ReadFile.getContent(this.getFileToModify());
        }//END TRY
        catch(IOException ioex)
        {
            throw ioex;
        }//END CATCH
        numNames = contentToModify.length;
        numSurnames = contentToModify.length;
        names = new String[numNames];
        surnames = new String[numSurnames];
        newContent = new String[contentToModify.length][contentToModify[0].split(",").length];

        for(int ii=0;ii<=numNames -1;ii++)
        {
            names[ii] = nameGen.generateName(nameLength);
            surnames[ii] = surnameGen.generateName(surnameLength);
        }//END FOR

        for(int ii=0;ii<=contentToModify.length -1;ii++)
        {
            newContent[ii] = contentToModify[ii].split(",");
            newContent[ii][1] = surnames[ii];
            newContent[ii][2] = names[ii];
        }//END FOR
        WriteFile.write(fileToModify, newContent);
    }//END modFile
}//END class ModifyFile
