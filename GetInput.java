/*
 * Author: Nathan van der Velde
 * Date Created: 2018-01-17
 * Last Modified By: Nathan van der Velde
 * Date Last Modified: 2018-01-17
 * Description: This source code handles the responsibility of getting input from the keyboard.
 */

//IMPORTS
import java.util.Scanner;
import java.lang.IllegalStateException;

import static java.lang.System.out;

public class GetInput
{
    public static String getString(String prompt)
    {
        /// DECLERATION OF VARIABLES
        boolean repeat = true;
        String input = null;
        Scanner sc = new Scanner(System.in);

        /// DEFINEMENT OF METHOD
        do
        {
            try
            {
                repeat = true;
                out.print(prompt);
                input = sc.nextLine();
                repeat = false;
            }//END TRY
            catch(IllegalStateException isex)
            {
                out.print("An error occured with the String scanner.\n");
                out.println(isex.getMessage());
                isex.printStackTrace();
                sc.reset();
                sc.next();
            }//END CATCH
        }while(repeat);//END DO-WHILE
        return input;
    }//END getInteger
}//END class GetInput