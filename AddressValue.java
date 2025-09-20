import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressValue {
    public static int getVersion(InetAddress ia) {
        byte[] address=ia.getAddress();
        if(address.length==4) return 4;
        else if (address.length==16) return 6;
        else return -1;
            
    
    }
}
public static void main(String[] args){
    try{
    InetAddress ip = InetAddress.getByName("192.168.1.1");
    int result = getVersion(ip);
    System.out.println(result);
 } catch (UnknownHostException e) {
   e.printStackTrace();
 }
    
}
