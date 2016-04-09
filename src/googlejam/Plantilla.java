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
import java.util.Scanner;

/**
 *
 * @author Allegea
 */
public class Plantilla {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {


        //Scanner in = new Scanner(new File("A-small-practice.in"));
        //FileWriter archivo = new FileWriter("A-small-practice.out");

        Scanner in = new Scanner(new File("AAA.in"));
        //Scanner in = new Scanner(System.in);
        FileWriter archivo = new FileWriter("AAA.out");

        PrintWriter out = new PrintWriter(archivo);
        out.flush();

        int cases = in.nextInt();

        for(int c=1;c<=cases;c++)
        {
            int cantidad = in.nextInt();
            int min = in.nextInt();
            int max = in.nextInt();
            int[] fre = new int[cantidad];
            boolean salida = true;

            for(int i=0;i<cantidad;i++)
            {
                fre[i]=in.nextInt();
            }

        }



        out.close();

    }


}
