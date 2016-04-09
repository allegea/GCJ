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
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Allegea
 */
public class B1 {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {


        Scanner in = new Scanner(new File("B-small-attempt2.in"));
        FileWriter archivo = new FileWriter("B-small-attempt2.out");

        /*Scanner in = new Scanner(new File("B-large-practice.in"));
        FileWriter archivo = new FileWriter("B-large-practice.out");*/

        PrintWriter out = new PrintWriter(archivo);
        out.flush();

        int cases = in.nextInt();

        for(int c=1;c<=cases;c++)
        {
            
            int combination = in.nextInt();
            String combs[] = new String[combination];
            for(int w=0;w<combination;w++)
                combs[w] = in.next();

            int opposit = in.nextInt();
            String opps[] = new String[opposit];
            for(int w=0;w<opposit;w++)
                opps[w] = in.next();

            ArrayList<Character> lista = new ArrayList<Character>();
            String elements = in.next();

            for(int j=0;j<elements.length();j++)
            {
                
            }

            System.out.print("Case #"+c+": [");
            out.print("Case #"+c+": [");
                for(int j=0;j<lista.size()-1;j++)
                {
                    System.out.print(lista.get(j)+", ");
                    out.print(lista.get(j)+", ");
                }
            if(lista.size()>0)
            {
                System.out.print(lista.get(lista.size() - 1));
                out.print(lista.get(lista.size() - 1));
            }

            System.out.println("]");
            out.println("]");

        
        }
        out.close();
       
    }


}
