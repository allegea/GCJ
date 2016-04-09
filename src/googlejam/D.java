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
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Allegea
 */
public class D {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {


        Scanner in = new Scanner(new File("D-large.in"));
        FileWriter archivo = new FileWriter("D-large.out");
        //DecimalFormat format = new DecimalFormat(".000000");

        /*Scanner in = new Scanner(new File("D-small-attempt0.in"));
        FileWriter archivo = new FileWriter("D-small-attempt0.out");*/

        PrintWriter out = new PrintWriter(archivo);
        out.flush();

        int cases = in.nextInt();

        for(int c=1;c<=cases;c++)
        {

            int size = in.nextInt();
            int ori[] = new int[size];
            int ord[] = new int[size];
            for(int i=0;i<size;i++)
            {
                ori[i]=in.nextInt();
                ord[i]=ori[i];
            }

            Arrays.sort(ord);

            int hits=0;
            for(int i=0;i<size;i++)
            {
                if(ori[i]!=ord[i])hits++;
            }

            System.out.format(Locale.ENGLISH, "Case #%d: %d.000000\n",c, hits);
            //System.out.format("Case #"+c+": "+format.format(hits));
            out.format(Locale.ENGLISH, "Case #%d: %d.000000\n",c, hits);
        }

        out.close();
       
    }


}
