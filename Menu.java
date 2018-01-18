/*
 * Author: Nathan van der Velde
 * Date Created: 2018-01-17
 * Last Modified By: Nathan van der Velde
 * Date Last Modified: 2018-01-18
 * Description: This source code contains the main menu for the program as well as any other 
 *              menu that the program requires.
 */


//IMPORTS
import java.io.IOException;

import static java.lang.System.out;

public class Menu
{
    public static void firstPage()
    {
        /// DECLERATION OF VARIABLES
        int choice;
        boolean repeat = true;
        String prompt = "Please enter the name of the file that you would like to modify.\n";
        String fileName;
        LoadFile inFile;
        ModifyFile modFile;

        /// DEFINEMENT OF METHOD
        do
        {
            repeat = true;
            try
            {
                fileName = GetInput.getString(prompt);
                inFile = new LoadFile(fileName);
                modFile = new ModifyFile(inFile.getLoadedFile());
                modFile.modFile();
                repeat = false;
            }//END TRY
            catch(IOException ioex)
            {
                out.print("There was an error with file processing.\n");
                out.println(ioex.getMessage());
                ioex.printStackTrace();
            }//END CATCH
        }while(repeat);//END DO-WHILE
    }//END firstPage
}//END class Menu