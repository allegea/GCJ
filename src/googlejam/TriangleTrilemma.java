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
public class TriangleTrilemma {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {

        Scanner in = new Scanner(new File("TriangleTrilemma.in"));
        FileWriter archivo = new FileWriter("smallN.out");
        PrintWriter out = new PrintWriter(archivo);
        out.flush();

         
        int cases = in.nextInt();
        double novent = 1.5707963267948968;

        for(int i=1;i<=cases;i++)
        {
            int[] x = new int[]{in.nextInt(),in.nextInt()};
            int[] y = new int[]{in.nextInt(),in.nextInt()};
            int[] z = new int[]{in.nextInt(),in.nextInt()};

            if(((x[0]==y[0])&&(x[0]==z[0])&&(z[0]==y[0]))||((x[1]==y[1])&&(x[1]==z[1])&&(z[1]==y[1])))
            out.println("Case #"+i+": not a triangle");
            else
            {
                double d1 =0;
                        for(int j=0;j<2;j++)
                            d1+=Math.sqrt(Math.pow(x[j]-y[j],2));
                

                double d2 =0;
                        for(int j=0;j<2;j++)
                            d2+=Math.sqrt(Math.pow(z[j]-y[j],2));
                

                double d3 =0;
                        for(int j=0;j<2;j++)
                            d3+=Math.sqrt(Math.pow(x[j]-z[j],2));
             

                if(d1==d2||d1==d3||d2==d3)
                    out.print("Case #"+i+": isosceles");
                else
                    out.print("Case #"+i+": scalene");

                double arr[] = new double[]{d1,d2,d3};
                Arrays.sort(args);

                    if(arr[2]>arr[0]+arr[1])
                {
                    out.println(" obtuse triangle");
                }
                else{
                    if(arr[2]==(arr[0]+arr[1]))
                        out.println(" right triangle");
                    else
                        out.println(" acute triangle");
                }

               /* double a1 = Math.acos((Math.pow(d2,2)+Math.pow(d3,2)-Math.pow(d1,2))/(2*d2*d3));
                double a2 = Math.acos((Math.pow(d1,2)+Math.pow(d3,2)-Math.pow(d2,2))/(2*d1*d3));
                double a3 = Math.acos((Math.pow(d2,2)+Math.pow(d1,2)-Math.pow(d3,2))/(2*d2*d1));

                if(a1==novent||a2==novent||a3==novent)
                {
                    out.println(" right triangle");
                }
                else{
                    if(a1<novent&&a2<novent&&a3<novent)
                        out.println(" acute triangle");
                    else
                        out.println(" obtuse triangle");
                }*/

                
            }




        }
        out.close();
       

       
    }


}
