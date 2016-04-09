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
import java.util.StringTokenizer;

/**
 *
 * @author Allegea
 */
public class ReverseWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
         Scanner in = new Scanner(new File("B-large-practice.in"));
         FileWriter archivo = new FileWriter("small.out");
         PrintWriter out = new PrintWriter(archivo);
         out.flush();

         int cases = in.nextInt();
         //System.out.println(cases);
         in.nextLine();
         for(int i=1;i<=cases;i++)
         {
             String entrada = in.nextLine();

             StringTokenizer stk = new StringTokenizer(entrada);
            // System.out.println(entrada);
			String fin = "";
			while (stk.hasMoreTokens()) {
				fin =" "+ stk.nextToken() + fin;
			}
            out.println("Case #"+i+":"+fin);
         }

         out.close();
    }
    

}
