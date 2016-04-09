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
public class Numbers {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {

        Scanner in = new Scanner(new File("C-small-practiceN.in"));
        FileWriter archivo = new FileWriter("smallN.out");
        PrintWriter out = new PrintWriter(archivo);
        out.flush();

        int cases = in.nextInt();

        for(int i=1; i<=cases;i++)
        {
            int root = in.nextInt();

            int result = exp_rapida((9+Math.sqrt(5)),root,1000);
            if(result<100)
                out.println("Case #"+i+": 0"+result);
            else
                out.println("Case #"+i+": "+result);
        }

       out.close();
    }

    static int exp_rapida(double a, long n, long m)
    {
        double r = 1;
        while(n>0)
        {
            if((n&1)==1)r=(r*a)%m;
            a=(a*a)%m;
            n=n>>1;

        }
        int res = (int) r;
        return res;
    }

}
