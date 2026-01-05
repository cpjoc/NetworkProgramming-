import java.net.*;
public class InterfaceListner {
    public static void main(String[] args) {
        try{
            InetAddress local=InetAddress.getByName("103.129.134.40");
            NetworkInterface ni=NetworkInterface.getByInetAddress(local);
            if(ni==null){
                System.out.println("Thats weird. No local loopback address.");
            }
            System.out.println(ni);
        } catch (SocketException ex){
            System.out.println("could not list network interface .");
        }catch (UnknownHostException ex){
            System.out.println("Thats weird. could not loopup 103.129.134.40");
        }
    }
}