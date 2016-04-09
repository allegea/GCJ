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
public class A {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {


        Scanner in = new Scanner(new File("A-large.in"));
        FileWriter archivo = new FileWriter("A-large.out");

        /*Scanner in = new Scanner(new File("A-small-attempt0.in"));
        FileWriter archivo = new FileWriter("A-small-attempt0.out");*/

        PrintWriter out = new PrintWriter(archivo);
        out.flush();

        int cases = in.nextInt();

        for(int c=1;c<=cases;c++)
        {

            int ca = in.nextInt();
            int result = 0;
            int movA = 0;
            int movB = 0;
            int actuA = 1;
            int actuB = 1;
            int anterior = -1;
            int paraA = 0;
            int paraB = 0;
            String robot="";
            for(int i=0;i<ca;i++)
            {
                robot = in.next();
                //System.out.println(robot);
                if(robot.equals("O"))
                {
                    if(anterior==(-1))anterior=0;
                    
                   
                        if(anterior==0)
                        {
                            
                            movA = in.nextInt();
                            paraA+=Math.abs(movA-actuA)+1;
                            result+=Math.abs(movA-actuA)+1;
                            actuA=movA;
                        }
                        else
                        {


                            movA = in.nextInt();
                            int aux = Math.abs(movA-actuA)-paraB;
                            //System.out.println("O - "+aux);
                            if(aux<0)
                            {
                                result+=1;
                                paraA=1;
                            }
                            else
                            {
                                result+= aux + 1;
                                paraA=aux + 1;
                            }
                            actuA=movA;
                        }
                    
                    anterior=0;

                }
                else
                {
                    if(anterior==(-1))anterior=1;
                    
                    movB = in.nextInt();
                        if(anterior==1)
                        {
                            
                            
                            
                            paraB+=Math.abs(movB-actuB)+1;
                            result+=Math.abs(movB-actuB)+1;
                            actuB=movB;
                        }
                        else
                        {
                            int aux = Math.abs(movB-actuB)-paraA;
                            //System.out.println("B - "+aux);
                            if(aux<0)
                            {
                                result+= 1;
                                paraB=1;
                            }
                            else
                            {
                                result+= aux + 1;
                                paraB=aux + 1;
                            }
                            actuB=movB;

                        }
                    anterior=1;

                }

                //System.out.println(result);
            }
        
        
       

        System.out.println("Case #"+c+": "+result);
        out.println("Case #"+c+": "+result);
        }

        out.close();
       
    }


}
