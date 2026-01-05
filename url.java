import java.net.URL;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class url{
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                // Always include protocol (http/https) in URL
                URL u = new URL("https://www.oracle.com");


                // Open stream from the URL
                InputStream in = u.openStream();
                Reader r = new InputStreamReader(in);

                int c;
                while ((c = r.read()) != -1) {
                    System.out.print((char) c);
                }

                r.close();
                in.close();
            } catch (java.net.MalformedURLException ex) {
                System.err.println(args[0] + " is not a parsable URL");
            } catch (java.io.IOException ex) {
                System.err.println(ex);
            }
        } else {
            System.out.println("Usage: java UrlReader <url>");
        }
    }
}
