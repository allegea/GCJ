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
public class OldMagician {


    public static void main(String[] args) throws FileNotFoundException, IOException
    {

        Scanner in = new Scanner(new File("OldMagician.in"));
        FileWriter archivo = new FileWriter("smallN.out");
        PrintWriter out = new PrintWriter(archivo);
        out.flush();

        int cases = in.nextInt();
        String salida[] = new String[]{"WHITE","BLACK"};
        for(int i=1;i<=cases;i++)
        {
            int w = in.nextInt();
            int b = in.nextInt();

            out.println("Case #"+i+": "+salida[b%2]);
        }
        
        out.close();
       

       
    }


}
