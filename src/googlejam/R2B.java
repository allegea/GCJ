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
public class R2B {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {


      Scanner in = new Scanner(new File("B3.in"));
        //Scanner in = new Scanner(System.in);
        FileWriter archivo = new FileWriter("B3.out");

        PrintWriter out = new PrintWriter(archivo);
        out.flush();

        int cases = in.nextInt();

        for(int c=1;c<=cases;c++)
        {
            int sol = in.nextInt();
            double d = Double.parseDouble(in.next());
            double total=0;
            
            int[] posicio=new int[sol];
            int[] vende = new int[sol];
            for(int i=0;i<sol;i++)
            {

                posicio[i] = in.nextInt();
                //if(i==0) aux=posicio;
                vende[i] = in.nextInt();
                //if(vende>1)total+=(vende/d);

            }

            /*for(int i=0;i<sol-1;i++)
            {
               for(int j=i+1;j<sol;j++)
                {
                   if(posicio[i]>posicio[j])
                   {
                       int aux=posicio[i];
                       posicio[i]=posicio[j];
                       posicio[j]=aux;

                       aux=vende[i];
                       vende[i]=vende[j];
                       vende[j]=aux;
                   }

                }
            }*/

            for(int i=0;i<sol-1;i++)
            {
               if(vende[i]>1) total+=(d/vende[i]);
               double dista=Math.abs(posicio[i]-posicio[i+1]);
               if(dista<d) total+=(d-dista);

               //System.out.println(vende[i]+ " - "+posicio[i]);

            }

            if(vende[sol-1]>1) total+=(d/vende[sol-1]);



          System.out.println("Case #"+c+": "+total);
        out.println("Case #" + c + ": "+total);
        }
        
        out.close();


    }


}
