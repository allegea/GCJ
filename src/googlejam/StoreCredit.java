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
public class StoreCredit {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) throws FileNotFoundException, IOException {
         Scanner in = new Scanner(new File("store-small.in"));
         FileWriter archivo = new FileWriter("store-small.out");
         PrintWriter out = new PrintWriter(archivo);
         out.flush();


         int cases = in.nextInt();
         System.out.println(cases);

         for(int i=1;i<=cases;i++)
         {
             boolean salir = false;
             int credit = in.nextInt();
             System.out.println(credit);
             int items = in.nextInt();
             System.out.println(items);
             int[] item=new int[items];
             for(int j=0;j<items;j++)
             {
                 item[j]=in.nextInt();
                 System.out.print(item[j]+" ");
             }
             System.out.println();

             for(int j=0;j<items;j++)
             {
                 for(int k=0;k<items;k++)
                 {
                     if((item[j]+item[k])==credit && j!=k)
                     {
                        out.println("Case #"+i+": "+(j+1)+" "+(k+1));
                        salir = true;
                        break;
                     }
                 }
                 if(salir) break;
             }
         }

         out.close();
    }

}
