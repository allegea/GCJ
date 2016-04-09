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
public class B2 {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {


        //Scanner in = new Scanner(new File("A-small-practice.in"));
        //FileWriter archivo = new FileWriter("A-small-practice.out");

        Scanner in = new Scanner(new File("B-small-attempt1.in"));
        FileWriter archivo = new FileWriter("B-small-attempt1.out");

        PrintWriter out = new PrintWriter(archivo);
        out.flush();

        int cases = in.nextInt();

        for(int c=1;c<=cases;c++)
        {
            int word = in.nextInt();
            int list = in.nextInt();

            String[] words = new String[word];
            String[] finals = new String[word];
            int[] diff = new int[word];
            Arrays.fill(diff, 0);
            int maxi = 0;
            for(int i=0;i<word;i++)
            {
                words[i] = in.next();
                diff[i]=diffe(words[i]);
                if(maxi<diff[i]) maxi=diff[i];
                
            }

            int index=0;
            for(int i=0;i<word;i++)
            {
                if(diff[i]==maxi)
                {
                    finals[index]=words[i];
                    index++;
                }

            }

            
            String[] lists = new String[list];
            for(int i=0;i<list;i++)
                lists[i] = in.next();


            if(index==1)
            {
            System.out.println("Case #"+c+": "+finals[0]);
            out.println("Case #"+c+": "+finals[0]);
            }
            else
            {
                int[] points=new int[index];
                Arrays.fill(points, 0);
                for(int i=0;i<index;i++)
                {
                    for(int j=0;j<list;j++)
                    {   int po = lists[j].indexOf(finals[i].substring(0, 1));
                        if(points[i]<po) points[i]=po;
                        
                    }
                }
                int pod=0;
                String res = "";
                for(int i=0;i<index-1;i++)
                {
                    for(int j=i+1;j<index;j++)
                    {
                        if(points[i]<points[j])
                        {
                            int aux = points[i];
                            points[i]=points[j];
                            points[j]=aux;
                            String au = finals[i];
                            finals[i] = finals[j];
                            finals[j]=au;
                        }
                    }

                 if(i==0)
                 {  pod=points[0];}

                    if(points[i]<pod) break;

                    res+=" "+finals[i];
                    

                }
                res+=" "+finals[index-1];
                System.out.println("Case #"+c+":"+res);
                    out.println("Case #"+c+":"+res);
                
                
            }
        }

        out.close();
       
    }

    static int diffe(String word)
    {
        String voi = "";
        for(int i=0;i<word.length();i++)
        {
            String sub = word.substring(i, i+1);
            if(voi.lastIndexOf(sub)==-1)voi+=sub;
        }
        return voi.length();
    }


}
