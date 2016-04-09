/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package googlejam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Allegea
 */
public class C {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {


        /*Scanner in = new Scanner(new File("C-small-attempt0.in"));
        FileWriter archivo = new FileWriter("C-small-attempt0.out");*/

        Scanner in = new Scanner(new File("C-large.in"));
        FileWriter archivo = new FileWriter("C-large.out");

        PrintWriter out = new PrintWriter(archivo);
        out.flush();

        int cases = in.nextInt();

        for(int c=1;c<=cases;c++)
        {

            int size = in.nextInt();
            int[] candies=new int[size];

            for(int i=0;i<size;i++)
                candies[i]=in.nextInt();

            Arrays.sort(candies);

            int resultado=candies[0]^candies[1];
            int suma = candies[1];
            for(int i=2;i<size;i++)
            {
                resultado = resultado ^ candies[i];
                suma+=candies[i];

            }

            if(resultado==0)
            {
                System.out.println("Case #" + c + ": " + suma);
                out.println("Case #" + c + ": " + suma);
            }
                else
            {
                System.out.println("Case #" + c + ": NO");
                out.println("Case #" + c + ": NO");
            }
        }

        out.close();
       
    }


}
