/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package googlejam;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Allegea
 */
public class SnapperChain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("A-large-practice.in"));
        FileWriter archivo = new FileWriter("small.out");
        PrintWriter out = new PrintWriter(archivo);
        out.flush();
        int cases = in.nextInt();
        
        for(int i=1;i<=cases;i++)
        {
            int N = in.nextInt();
            int K = in.nextInt();
        
        
            if ((K % (1 << N)) == (1 << N) - 1)
                out.println("Case #"+i+": "+"ON");
            else
                out.println("Case #"+i+": "+"OFF");
        }

        out.close();
    }

}
