import java.net.*;
public class Myaddress{
    public static void main(String[] args){
      try{
        // InetAddress address =InetAddress.getByName("www.facebook.com");
        // System.out.println(address);

        InetAddress machine= InetAddress.getLocalHost();
        System.out.println(machine.getHostName());
        

        System.out.println(machine.getHostAddress());

       }catch(UnknownHostException ex){
        System.out.println("could not find www.javapoint.com");

     }
   }
}