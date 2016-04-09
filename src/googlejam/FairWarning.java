/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package googlejam;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Allegea
 */
public class FairWarning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("small.txt"));
        FileWriter archivo = new FileWriter("small.out");
        PrintWriter out = new PrintWriter(archivo);
        out.flush();
        int cases = in.nextInt();
        
        for(int i=1;i<=cases;i++)
        {
            int N = in.nextInt();
            BigInteger[] datos = new BigInteger[N];
            for(int j=0;j<N;j++)
                datos[j] = new BigInteger(in.next());

            Arrays.sort(datos);
            BigInteger y = datos[0].subtract(BigInteger.valueOf(1));

            

            while(y.equals(new BigInteger("0")))
            {
                BigInteger one = datos[0].add(y);
                BigInteger two = datos[1].add(y);
                BigInteger gcm = one.gcd(two);
                boolean salir = true;
                for(int j=2;j<N;j++)
                {
                    BigInteger tre = datos[j].add(y);
                    if(!gcm.equals(two.gcd(tre)))
                    {
                        salir = false;
                        break;
                    }
                }
                
                if(salir)break;
                else
                    y.add(new BigInteger("-1"));

            }


            System.out.println("Case #"+i+": "+y.toString());
        

        }

        out.close();
    }

}
