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
 *import java.util.*;

public class T9Spelling {
    public static void main(String[] args) {
        String letters = "abcdefghijklmnopqrstuvwxyz ";
        String numbers = "222333444555666777788899990";
        Scanner in = new Scanner(System.in);

        int N = Integer.parseInt(in.nextLine());

        for (int n = 1; n <= N; ++n) {
            String msg = in.nextLine();
            String res = "";
            char num = '#';
            for (int i = 0; i < msg.length(); ++i) {
                int ind = letters.indexOf(msg.charAt(i));
                if (numbers.charAt(ind) == num) res += ' ';
                num = numbers.charAt(ind);
                while (ind >= 0 && numbers.charAt(ind) == num)
                    res += numbers.charAt(ind--);

            }
            System.out.println("Case #" + n + ": " + res);
        }
    }
}

 * @author Allegea
 */
public class T9Spelling {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) throws FileNotFoundException, IOException {
         
          funcion();
          /*Scanner in = new Scanner(new File("C-small-practice.in"));
         FileWriter archivo = new FileWriter("small.out");
         PrintWriter out = new PrintWriter(archivo);
         out.flush();

         int cases = in.nextInt();
         in.nextLine();
         //System.out.println(cases);

         for(int i=1;i<=cases;i++)
         {   int anterior = -1;
             String salida = "Case #"+i+": ";
             String entrada = in.nextLine().toLowerCase();
             entrada = entrada.replace(' ', ')');
             out.print(salida);

             for(int j=0;j<entrada.length();j++)
             {
                 int repeticiones=-1;
                 int caracter = -3;
                 int p=entrada.charAt(j);
                 if(p==41)
                 { caracter = 0;
                 //System.out.println("fdsfsdf");
                 }
                 else

                 {caracter = entrada.charAt(j);

                 if(caracter >= 115)
                 {

                     if(caracter == 115 || caracter == 122)
                         repeticiones = 4;
                     else
                     repeticiones = (entrada.charAt(j)-98)%3+1;



                     if(caracter == 115)
                         caracter = 7;
                     else
                     caracter = (caracter-97)/3+2;

                 }
                 else
                 {

                     caracter = (caracter-97)/3+2;
                      repeticiones = (entrada.charAt(j)-97)%3+1;
                 }
                 }






                 if(anterior == caracter) out.print(" ");//salida=salida+" ";


                 anterior = caracter;

                 if(caracter == 10) caracter = 9;


                 for(int k=0;k<repeticiones;k++)
                 {
                    /* if(caracter==0)
                         System.out.print("0");//salida=salida+"0";
                     else*/
                     /*out.print(caracter);//salida=salida+caracter;
                 }
                 if(caracter==0)out.print("0");
             }

             out.println();


         }

         out.close();*/
    }

      static void funcion() throws FileNotFoundException, IOException
      {
          String letras = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ)");
          int valor[] = new int[]{2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9,0};
          int repeticion[] = new int[]{1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,4,1,2,3,1,2,3,4,1};

          Scanner in = new Scanner(new File("C-large-practice.in"));
         FileWriter archivo = new FileWriter("small.out");
         PrintWriter out = new PrintWriter(archivo);
         out.flush();

         int cases = in.nextInt();
         in.nextLine();
         //System.out.println(cases);

         for(int i=1;i<=cases;i++)
         {
             String entrada = in.nextLine().toUpperCase();
             entrada = entrada.replace(' ',')');
             out.print("Case #"+i+": ");
             int anterior = -1;
             for(int j=0;j<entrada.length();j++)
             {
                 int posicion = letras.indexOf(entrada.substring(j,j+1));
                 //System.out.println("ff "+posicion+" - "+entrada.substring(j,j+1));
                 int caracter = valor[posicion];

                 if(caracter == anterior ) out.print(" ");
                 for(int k=0;k<repeticion[posicion];k++)
                 out.print(caracter);

                 anterior = caracter;



             }
             
             out.println();

         }

          out.close();
      }
    

}
