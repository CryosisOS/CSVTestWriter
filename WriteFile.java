/*
 * Author: Nathan van der Velde
 * Date Created: 2018-01-18
 * Last Modified By: Nathan van der Velde
 * Date Last Modified: 2018-01-18
 * Description: This source code is used to modify the file with the generated fields.
 */

//IMPORTS
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

import static java.lang.System.out;

public class WriteFile
{
    public static void write(File outFile, String [][] inArray)
    {
        /// DECLERATION OF VARIABLES
        FileOutputStream fileStream = null;
        PrintWriter pw = null;

        /// DEFINEMENT OF METHOD
        try
        {
            fileStream = new FileOutputStream(outFile);
            pw = new PrintWriter(fileStream);
            System.out.println("Writing the file now.");
            for(int ii = 0;ii<inArray.length;ii++)
            {
                System.out.println("Writing to file: "+String.join(",",inArray[ii]));
                pw.println(String.join(",",inArray[ii]));
            }//ENDFOR
            pw.close();
        }//END TRY
        catch(IOException ioex)
        {
            out.print("An error occured with writing the file.\n");
            out.println(ioex.getMessage());
            ioex.printStackTrace();
        }//END CATCH


    }//END write
}//END class WriteFile