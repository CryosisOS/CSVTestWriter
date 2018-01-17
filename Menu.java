/*
 * Author: Nathan van der Velde
 * Date Created: 2018-01-17
 * Last Modified By: Nathan van der Velde
 * Date Last Modified: 2018-01-17
 * Description: This source code contains the main menu for the program as well as any other 
 *              menu that the program requires.
 */

public class Menu
{
    public static void firstPage()
    {
        /// DECLERATION OF VARIABLES
        int choice;
        boolean repeat = true;
        String prompt = "Please enter the name of the file that you would like to modify.\n";
        String fileName;

        /// DEFINEMTN OF METHOD
        do
        {
            repeat = true;
            try
            {
                fileName = GetInput.getString(prompt);
            }//END TRY

        }while(repeat);//END DO-WHILE
    }//END firstPage
}//END class Menu