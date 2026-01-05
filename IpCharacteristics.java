import java.net.*;
public class IpCharacteristics {
    public static void main(String[] args) {
            
    try{
        InetAddress address=InetAddress.getByName("235.255.1.1");
        if(address.isAnyLocalAddress()){
            System.out.println(address+"is a window address");

        }
        if(address.isLoopbackAddress()){
            System.out.println(address+ "is loopback address");

        }
        if(address.isLinkLocalAddress()){
            System.out.println(address+ "is a link local addrerss");
        }
        if(address.isSiteLocalAddress()){
            System.out.println(address+"is a site localaddress");
        }
        else{
            System.out.println(address+"is global address");
        }
        if(address.isMulticastAddress()){
            if(address.isMCGlobal()){
                System.out.println(address+"is global multi cast Address");
            }
            if(address.isMCLinkLocal()){
                System.out.println(address+"is subnet wide multicast address");
            }
            if(address.isMCNodeLocal()){
                System.out.println(address+"is an interface local multicast address");
            }
            if (address.isMCSiteLocal()) {
                System.out.println(address+"is site wide multicast");
            }
        }
        else{
            System.out.println("is uni-cast ip address");
        }
    }    
    catch (UnknownHostException e) {
       System.err.println("could not release"+args[0]);
    }
  }
}
