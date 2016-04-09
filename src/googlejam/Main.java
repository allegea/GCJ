/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package googlejam;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Allegea
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("small.txt"));
        FileWriter archivo = new FileWriter("small.out");
        PrintWriter out = new PrintWriter(archivo);
        out.flush();

        int cases = in.nextInt();

        ArrayList<ArrayList<Long>> datos = new ArrayList<ArrayList<Long>>();
        ArrayList<Long> original = new ArrayList<Long>();
        ArrayList<Long> vuelta = new ArrayList<Long>();


        for(int i=1;i<=cases;i++)
        {
            long R = in.nextLong();
            long K = in.nextLong();
            long N = in.nextLong();
            long total = 0;

            for(int j=0;j<N;j++)
            {
                
                original.add(in.nextLong());
            }

            datos.add(original);

            for(int j=0;j<R;j++)
            {
                long pasajeros = 0;
                long pos = 0;
                for(int h=0;h<datos.size();h++)
                {
                    pos = original.get(0);
                    if((pos+pasajeros)<=K)
                    {   
                        pasajeros+=pos;
                        original.remove(0);
                        original.add(pos);

                    }
                    else
                        break;
                }

                vuelta.add(pasajeros);

                total+=pasajeros;
                int aux = iguales(datos,original);
                if(aux!=(-1))
                {
                    long intervalo = 0;
                    for(int p=aux;p<datos.size();p++)
                        intervalo+=vuelta.get(aux);

                    //System.out.println(total);
                    total+=((R-j)/(aux+1))*(intervalo);


                    for(int w=(int)((R-j)%(aux+1));w<(aux);w++)
                        total+=vuelta.get(w);

                    break;
                }
                else
                    datos.add(original);

                

            }

            System.out.println("Case #"+i+": "+total);



            datos.clear();
            original.clear();
            vuelta.clear();

        }

        out.close();
    }

    static int iguales(ArrayList<ArrayList<Long>> a,ArrayList<Long> b)
    {
        int posicion = -1;
        for(int j=0;j<a.size();j++)
        {
            if(a.get(j).size()!=b.size()) continue;
            else
            {
                int contador = 0;

                for(int i=0;i<b.size();i++)
                {
                    //System.out.println(a.size()+" - "+a.get(i)+ " - "+b.get(i));

                    if(a.get(j).get(i) != b.get(i)) break;
                    else {
                        contador++;
                        posicion = j;
                        }
                }

                if(contador == b.size())
                    return posicion;
                else posicion = -1;

                
            }
        }
        return posicion;

    }

}
