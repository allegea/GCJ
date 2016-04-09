/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package googlejam;

/**
 *
 * @author Allegea
 */
public class utiles {

    public static void main(String[] args)
    {

        System.out.println(exp_rapida((3+Math.sqrt(5)),2,1000));
    }

    static int exp_rapida(double a, long n, long m)
    {
        double r = 1;
        while(n>0)
        {
            if((n&1)==1)r=(r*a)%m;
            a=(a*a)%m;
            n=n>>1;

        }
        int res = (int) r;
        return res;
    }

}
