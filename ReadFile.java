/*
 * Author: Nathan van der Velde
 * Date Created: 2018-01-17
 * Last Modified By: Nathan van der Velde
 * Date Last Modified: 2018-01-17
 * Description: This sourc code reads the file contents and prepares them to be modified.
 */

//IMPORTS
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import static java.lang.System.out;

public class ReadFile
{
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    // PUBLIC DOING METHODS //
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    public static String [] getContent(FIle inFile)
    {
        /// DECLERATION OF VARIABLES
        int arrSze;
        String line;
        String [] contentArr;
        FileInputStream fileStream = null;
        InputStreamReader rdr;
        BufferedReader bufRdr;

        /// DEFINEMENT OF METHOD
        try
        {
            fileStream = new FileInputStream(inFile);
            rdr = new InputStreamReader(fileStream);
            bufRdr = new BufferedReader(rdr);

            arrSze = getNumLines(inFile);
            contentArr = new String [arrSze -1];

            for(int ii = 0;ii<=contentArr.length()-1;ii++)
            {
                line = bufRdr.readLine();
                contentArr[ii] = line;
            }//END FOR
            fileStream.close();
        }//END TRY
        catch(IOException ioex)
        {
            if(fileStream != null)
            {
                try
                {
                    fileStream.close();
                }//END TRY
                catch(IOException ioex2)
                {
                    //Can't do anything more here.
                }//END CATCH
            }//ENDIF
            out.print("An error has occured during file processing.\n");
            out.println(ioex.getMessage());
            ioex.printStackTrace();
        }//END CATCH
        return contentArr;
    }//END getContent


    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    // PRIVATE DOING METHODS //
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    private static int getNumLines(File inFile)
    {
        /// DECLERATION OF VARIABLES
        int numLines;
        String line;
        FileInputStream fileStream = null;
        InputStreamReader rdr;
        BufferedReader bufRdr;

        /// DEFINEMENT OF METHOD
        try
        {
            fileStream = new FileInputStream(inFile);
            rdr = new InputStreamReader(fileStream);
            bufRdr = new BufferedReader(rdr);

            numLines = 0;
            line = bufRdr.readLine();
            while(line != null)
            {
                numLines++;
                line = bufRdr.readLine();
            }//END WHILE
            fileStream.close();
        }//END TRY
        catch(IOException ioex)
        {
            if(fileStream != null)
            {
                try
                {
                    fileStream.close();
                }//END TRY
                catch(IOException ioex2)
                {
                    //Can't do anything more
                }//END CATCH
            }//ENDIF
            out.print("An error occured with reading the file.\n");
            out.println(ioex.getMessage());
            ioex.printStackTrace();
        }//END CATCH
        return numLines;
    }//END getContent
}//END class ReadFile