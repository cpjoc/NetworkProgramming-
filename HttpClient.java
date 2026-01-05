import java.net.*;
import java.io.*;

public class HttpClient {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",8000);
        BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out= new PrintWriter(socket.getOutputStream(), true);
        out.println("GET /index.html HTTP/1.0");

        out.println();
        out.flush();
        String line;
        while((line=in.readLine())!=null){
        System.out.println(line);
        }
    in.close();
    out.close();
    }

}
