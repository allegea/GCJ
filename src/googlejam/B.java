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
import java.util.Scanner;

/**
 *
 * @author Allegea
 */
public class B {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {


        Scanner in = new Scanner(new File("B-small-attempt2.in"));
        FileWriter archivo = new FileWriter("B-small-attempt2.out");

        /*Scanner in = new Scanner(new File("B-large-practice.in"));
        FileWriter archivo = new FileWriter("B-large-practice.out");*/

        PrintWriter out = new PrintWriter(archivo);
        out.flush();

        int cases = in.nextInt();

        for(int c=1;c<=cases;c++)
        {
            int combin = in.nextInt();
            char[] combi = null;
            char[] clear = null;
            if(combin>0)
            {
                combi = in.next().toCharArray();
            }

            

            int cle = in.nextInt();
            if(cle>0)
            {
                clear = in.next().toCharArray();
            }

            int lis = in.nextInt();

            ArrayList<Character> lista = new ArrayList<Character>();
            int posC[] ={-2,-2};
            int posD[] ={-2,-2};
            int anterior = -1;
            int ant1, ant2;
            ant1=ant2=-2;
            
            String total = in.next();
            for(int i=0;i<lis;i++)
            {

                lista.add(total.charAt(i));
                int posicion = lista.size()-1;


                if(combin!=0)
                {

                    if(anterior!=-1)
                    {
                        if(anterior==0)
                            if(lista.get(posicion) == combi[1])posC[1] = posicion;
                            else
                            {
                            anterior=-1;
                            posC[0]=posC[1]=-2;
                            //continue;
                            }

                        if(anterior==1)
                            if(lista.get(posicion) == combi[0])posC[0] = posicion;
                            else
                            {
                            anterior=-1;
                            posC[0]=posC[1]=-2;
                            //continue;
                            }

                    }
                    
                    
                    if(combi[0]==combi[1])
                    {
                        if(posC[1] == -2 && lista.get(posicion) == combi[1])
                        {
                        posC[1] = posicion;
                        anterior = 1;
                        }
                        else if(lista.get(posicion) == combi[0])
                        {
                            posC[0] = posicion;
                            anterior = 0;
                        }
                        //System.out.println(posC[0]+" --- "+posC[1]);
                        
                    }
                    else
                    {
                    if(lista.get(posicion)==combi[0]){
                        posC[0]=posicion;
                        anterior=0;
                    }

                    if(lista.get(posicion)==combi[1]){
                        posC[1]=posicion;
                        anterior=1;
                    }
                    }

                    if(Math.abs(posC[0]-posC[1])==1)
                    {
                      //  if(lista.size()>Math.min(posC[0],posC[1]))
                        
                            lista.remove(Math.min(posC[0], posC[1]));
                            lista.remove(Math.min(posC[0],posC[1]));
                            lista.add(combi[2]);
                            if(posC[0]==posD[0] || posC[1]==posD[0]){
                                posD[0]=ant1;
                            }
                            if(posC[0]==posD[1] || posC[1]==posD[1])posD[1]=ant2;

                            posC[0]=posC[1]=-2;
                            anterior=-1;
                            continue;
                    }
                }

                if(cle!=0)
                {

                    if(clear[0]==clear[1])
                    {
                        if(posD[1] == (-2) && lista.get(posicion) == clear[1])
                        {
                            if(ant2==-1) ant2=posicion;
                            else ant2 =posD[1];
                            
                            posD[1] = posicion;

                        }
                        else if(lista.get(posicion) == clear[0])
                        {
                            if(ant1==-1) ant1=posicion;
                            else ant1 =posD[0];
                            posD[0] = posicion;

                        }

                    }
                    else
                    {
                    if(lista.get(posicion)==clear[0]){
                        if(ant1==-1) ant1=posicion;
                            else ant1 =posD[0];
                        posD[0]=posicion;
                    }
                    if(lista.get(posicion)==clear[1]){
                        if(ant2==-1) ant2=posicion;
                            else ant2 =posD[1];
                        posD[1]=posicion;
                    }
                    }

                    if(posD[0]>-1 && posD[1]>-1)
                    {

                        posD[0]=posD[1]=posC[0]=posC[1]=-2;

                        lista.clear();

                        
                    }

                }

                
                
            }
       

        System.out.print("Case #"+c+": [");
        out.print("Case #"+c+": [");
            for(int j=0;j<lista.size()-1;j++)
            {
                System.out.print(lista.get(j)+", ");
                out.print(lista.get(j)+", ");
            }
        if(lista.size()>0)
        {
            System.out.print(lista.get(lista.size() - 1));
            out.print(lista.get(lista.size() - 1));
        }

        System.out.println("]");
        out.println("]");

        
        }
        out.close();
       
    }


}
