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
public class A1 {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {


        //Scanner in = new Scanner(new File("A-small-practice.in"));
        //FileWriter archivo = new FileWriter("A-small-practice.out");

        Scanner in = new Scanner(new File("A-large.in"));
        //Scanner in = new Scanner(System.in);
        FileWriter archivo = new FileWriter("A-large.out");

        PrintWriter out = new PrintWriter(archivo);
        out.flush();

        int cases = in.nextInt();

        for(int c=1;c<=cases;c++)
        {
            long n = in.nextLong();
            double pd = Double.parseDouble(in.next());
            double pg = Double.parseDouble(in.next());
            int i;
            if(pd>0&&pg==0)
            {
                System.out.println("Case #" + c + ": Broken");
                     out.println("Case #" + c + ": Broken");
                     continue;
            }
            for(i=1; i<=n;i++)
            {
                double porcentaje = (pd*i)/100;
                String porc = String.valueOf(porcentaje);
                if(Integer.parseInt(porc.substring(porc.indexOf(".")+1, porc.length()))==0)break;
            }
            
            if(i<=n){
                int perdi = (int) ((i * (100 - pd)) / 100);
                if(perdi>0 && pg == 100)
                {
                    System.out.println("Case #" + c + ": Broken");
                     out.println("Case #" + c + ": Broken");
                }
                else
                {
                    System.out.println("Case #" + c + ": Possible");
                    out.println("Case #" + c + ": Possible");
                }


            }
            else
            {
            System.out.println("Case #"+c+": Broken");
             out.println("Case #" + c + ": Broken");
            }
            
        }

        out.close();
       
    }


}
