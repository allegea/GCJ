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
public class SquareTiles {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {


        //Scanner in = new Scanner(new File("A-small-practice.in"));
        //FileWriter archivo = new FileWriter("A-small-practice.out");

        Scanner in = new Scanner(new File("AAA.in"));
        //Scanner in = new Scanner(System.in);
        FileWriter archivo = new FileWriter("AAA.out");

        PrintWriter out = new PrintWriter(archivo);
        out.flush();

        int cases = in.nextInt();
        char aa='\\';
        System.out.println(aa);
        for(int c=1;c<=cases;c++)
        {
            int rows = in.nextInt();
            int colums = in.nextInt();
            String[] picture = new String[rows];
            boolean salida = true;
            for(int i=0;i<rows;i++)
            {
                picture[i]=in.next();
            }

            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<picture[i].length()-1;j++)
                {
                String aux=picture[i].substring(j,j+1);
                if(aux.equals("#"))
                {
                    if(i==(rows-1))
                    {
                        salida=false;
                        break;
                    }
                    if(j==(picture[i].length()-2))
                    {
                        salida=false;
                        break;
                    }

                    if(picture[i].substring(j+1,j+2).equals("#") && picture[i+1].substring(j,j+1).equals("#") && picture[i+1].substring(j+1,j+2).equals("#"))
                    {
                        picture[i]=picture[i].replaceFirst("#", "/");
                        
                        picture[i]=picture[i].replaceFirst("#", String.valueOf(aa));
                        System.out.println(picture[i]);
                        picture[i+1]=picture[i+1].replaceFirst("#", "'\\'");
                        picture[i+1]=picture[i+1].replaceFirst("#", "/");
                        picture[i].
                        
                    }
                    else
                    {
                        salida=false;
                        break;
                    }
                }
                }
            }


          System.out.println("Case #"+c+":");
        out.println("Case #" + c + ":");

        if(salida==false)
        {
            System.out.println("Impossible");
                out.println("Impossible");
        }
 else{
            for(int i=0;i<rows;i++)
            {
                System.out.println(picture[i]);
                out.println(picture[i]);
            }
            }


        }



        out.close();

    }


}
