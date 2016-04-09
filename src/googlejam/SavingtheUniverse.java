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
public class SavingtheUniverse {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {

       Scanner in = new Scanner(new File("SavingTheUniverse.in"));
        FileWriter archivo = new FileWriter("smallN.out");
        PrintWriter out = new PrintWriter(archivo);
        out.flush();

        int cases = Integer.parseInt(in.nextLine());
        for(int i=1;i<=cases;i++)
        {
            int sizeS = Integer.parseInt(in.nextLine());
            String[] servers = new String[sizeS];
            int[] index = new int[sizeS];


            for(int j=0;j<sizeS;j++)
            {
                servers[j]=in.nextLine();

            }


            int sizeQ = Integer.parseInt(in.nextLine());
            String[] queries = new String[sizeQ];

            for(int j=0;j<sizeQ;j++)
                queries[j]=in.nextLine();

            int switches = 0;
            int position = 0;
            int positionNext =sizeQ ;
            Arrays.fill(index, -1);
            int j,h=0,llego = 0;
            while(position<sizeQ)
            {

                 int mayor = -1;
                for(j=0;j<sizeS;j++)
                {
                    for(h=position;h<positionNext;h++)
                    {
                        if(servers[j].equals(queries[h]))
                        {
                            index[j]= h;
                            //System.out.println(h);
                            break;
                        }
                    }
                    if(h==sizeQ) llego =h;
                }


                //int may = -10;
                 boolean finish = false;
                    for(j=0;j<sizeS;j++)
                    {
                        if(index[j]>mayor)
                        {
                            mayor=index[j];

                        }
                        if(index[j]==-1)
                        {
                            mayor=j;
                            if(llego==sizeQ)
                            {//System.out.println("dfddddd");
                            finish = true;
                            }
                            break;
                        }
                    }


                 if(finish)break;
                Arrays.fill(index, -1);
                //index[may]=-2;
                position = mayor+1;


                // System.out.println(" - "+position);

                boolean salir = true;
                for(j=position;j<sizeQ;j++)
                {
                    if(queries[mayor].equals(queries[j]))
                    {
                        positionNext=j+1;
                        salir = false;
                        break;
                    }
                }

                switches++;
                if(salir)break;







            }



            System.out.println("Case #"+i+": "+switches);

        }



       out.close();
    }


}
