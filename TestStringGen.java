import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.System.out;


public class TestStringGen
{
    public static void main(String[] args) 
    {
        int length = 12;
        int lastLength = 30;
        String [] list = new String[150];
        String [] lastList = new String [150];
        StringGenerator stringGen = new StringGenerator(length, ThreadLocalRandom.current());
        StringGenerator surnameGen = new StringGenerator(lastLength, ThreadLocalRandom.current());


        for(int ii = 0; ii <= list.length-1;ii++)
        {
            list[ii] = stringGen.generateName(length);
            lastList[ii] = surnameGen.generateName(lastLength);
            out.println(list[ii]+" "+lastList[ii]);
        }//ENDFOR
    }//END main

}//END class TestStringGen