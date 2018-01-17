/*
 * Author: Nathan van der Velde
 * Date Created: 2018-01-17
 * Last Modified By: Nathan van der Velde
 * Date Last Modified: 2018-01-17
 * Description: This class contains all the string generators that the program will need.
 */

//IMPORTS
import java.security.SecureRandom;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;

public class StringGenerator
{
    //CLASS CONSTANTS
    private static final String lower = "abcdefghijklmnopqrstuvwxys";
    private final Random random;
    private final char[] symbols;
    private final char[] buf;

    /**
     * ALTERNATE CONTSTRUCTOR #1
     * IMPORTS: int length, Random random, String symbols
     */
    public StringGenerator(int length, Random random, String symbols) throws IllegalArgumentException
    {
        if(length<1)
        {
            throw new IllegalArgumentException();

        }//ENDIF
        if(symbols.length() < 2)
        {
            throw new IllegalArgumentException();
        }//ENDIF
        this.random = Objects.requireNonNull(random);
        this.symbols = symbols.toCharArray();
        this.buf = new char[length];
    }//END ALTERNATE CONSTRUCTOR #1

    /**
     * ALTERNATE CONTSTRUCTOR #2
     * IMPORTS: int length, Random random
     * PURPOSE: Create an alphanumeric string generator.
     */
    public StringGenerator(int length, Random random)
    {
        this(length, random, lower);
    }//END ALTERNATE CONSTRUCTOR #2 

    /**
     * SUBMODULE generateNames
     * DESRIPTION: This method is used to generate a string at a time.
     */
    public String generateName(int size)
    {
        for(int ii = 0;ii<buf.length;++ii)
        {
            buf[ii] = symbols[random.nextInt(symbols.length)];
        }//END FOR
        return new String(buf);
    }//END generateNames
}//END class StringGenerator