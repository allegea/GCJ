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
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


/**
 *
 * @author Allegea
 */
public class VanishingNumbers {
     static ArrayList<Double> numbers = new ArrayList<Double>();

    public static void main(String[] args) throws FileNotFoundException, IOException
    {

        Scanner in = new Scanner(new File("SavingTheUniverse.in"));
        FileWriter archivo = new FileWriter("smallN.out");
        PrintWriter out = new PrintWriter(archivo);
        out.flush();

        int cases = in.nextInt();

        for(int i=1;i<cases;i++)
        {
            int size = in.nextInt();
             
            for(int j=0;j<size;j++)
                numbers.add(in.nextDouble());

            Collections.sort(numbers);

            double ls=2/3,li=1/3;

            System.out.println("Case #"+i+":");
            eliminar(li,ls);
            
            numbers.clear();
        }
        out.close();
       

       
    }
    
    static void eliminar(double li,double ls)
    {
        int cantidad = 0;
        for(int i=0;i<numbers.size();i++)
        {
            if(numbers.get(i)>=li && numbers.get(i)<=ls)
            {
                System.out.println(numbers.get(i));
                numbers.remove(i);
                cantidad++;
            }
        }

        if(cantidad == 0 || numbers.size() == 0)return;
        else
        {
            
        }

    }


}
