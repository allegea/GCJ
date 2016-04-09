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
import java.util.StringTokenizer;

/**
 *
 * @author Allegea
 */
public class Elrecolector {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {


        //Scanner in = new Scanner(new File("A-small-practice.in"));
        //FileWriter archivo = new FileWriter("A-small-practice.out");

        Scanner in = new Scanner(new File("in.txt"));
        //Scanner in = new Scanner(System.in);
        FileWriter archivo = new FileWriter("out.txt");

        PrintWriter out = new PrintWriter(archivo);
        out.flush();

        int cases = Integer.parseInt(in.next());

        for(int c=1;c<=cases;c++)
        {
            in.next();

             int colums = Integer.parseInt(in.next());
             int rows =   Integer.parseInt(in.next());

             int[][] matriz = new int[rows][colums];

             char[][] path = new char[rows][colums];

             /*for(int i=0;i<rows;i++)
                 for(int j=0;j<colums;j++)
                    matriz[i][j]=0;*/


             for(int i=0;i<rows;i++)
                path[i] = in.next().toCharArray();


             for(int i=0;i<rows;i++)
             {
                 for(int j=0;j<colums;j++)
                 {

                     if(path[i][j]=='#')
                         matriz[i][j] = -1;
                     else if(path[i][j]=='X')
                             matriz[i][j]+=1;


                         if((i+1)<rows)
                         {
                             //if(path[i][j]=='X')
                             if(matriz[i][j]!=-1)
                                matriz[i+1][j]=Math.max(matriz[i][j],matriz[i+1][j]);
                           else
                                matriz[i+1][j]=matriz[i][j];
                             //else if(matriz[i][j]==-1)matriz[i+1][j]=matriz[i][j];
                            // else matriz[i+1][j]=Math.max(matriz[i+1][j], matriz[i][j]);
                         }
                         if((j+1)<colums)
                         {
                             //if(path[i][j]=='X')
                             if(matriz[i][j]!=-1)
                                 matriz[i][j+1]=Math.max(matriz[i][j],matriz[i][j+1]);
                            else
                             matriz[i][j+1]=matriz[i][j];
                             //else if(matriz[i][j]==-1)matriz[i][j+1]=matriz[i][j];
                             //else matriz[i][j+1]=Math.max(matriz[i][j],matriz[i][j+1]);
                         }

                 }


            }

             for(int i=0;i<rows;i++)
             {
                 for(int j=0;j<colums;j++)
                     System.out.print(matriz[i][j] +"\t");

                 System.out.println();

            }

             
             System.out.println(matriz[rows-1][colums-1]+"\n***************");
             out.println(matriz[rows-1][colums-1]);


        }



        out.close();

    }


}
