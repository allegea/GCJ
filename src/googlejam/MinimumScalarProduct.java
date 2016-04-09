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
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Allegea
 */
public class MinimumScalarProduct {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {

        Scanner in = new Scanner(new File("MinimumScalarProduct.in"));
        FileWriter archivo = new FileWriter("MinimumScalarProduct.out");
        PrintWriter out = new PrintWriter(archivo);
        out.flush();

       int cases = in.nextInt();
       for(int i=1;i<=cases;i++)
       {
           int size = in.nextInt();
           ArrayList<Long> a = new ArrayList<Long>();
           ArrayList<Long> b = new ArrayList<Long>();
           for(int j=0;j<size;j++)
                a.add(in.nextLong());

           for(int j=0;j<size;j++)
                b.add(in.nextLong());

           Collections.sort(a);
           Collections.sort(b);
           Collections.reverse(a);

           long total = 0;
           for(int j=0;j<a.size();j++)
           total+=a.get(j)*b.get(j);
           /*for(int j=0;j<a.size();j++)
           {
               long men = a.get(j)*b.get(0);
               int pos = 0;
               for(int k=0;k<b.size();k++)
               {
                   if(men>a.get(j)*b.get(k))
                   {
                       men=a.get(j)*b.get(k);
                       pos = k;
                   }
               }
               total+=men;
               a.remove(0);
               b.remove(pos);
               j--;


           }*/

           System.out.println("Case #"+i+": "+total);
           out.println("Case #"+i+": "+total);

       }
        
        out.close();
       

       
    }


}
