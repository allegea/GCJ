
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author allegea
 */
public class Template {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
    	String fileName = "FileName";
        BufferedReader in   = new BufferedReader(new FileReader(fileName + ".in"));
        PrintWriter out = new PrintWriter(new FileWriter(fileName + ".out"));
        
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(in.readLine());
        StringTokenizer st;
        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(in.readLine());
            int result = 0;
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(in.readLine());
            }
            String line = "Case #" + i + ": " + result;
            System.out.println(line);
            out.println(line);
        }
        in.close();
        out.close();
    }
}
