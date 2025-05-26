import java.util.*;
import java.lang.*;
import java.net.*;
public class getRemoteIP
{
    public static void main(String args[])
    {
        try
        {
            InetAddress IPO=InetAddress.getByName(args[1]);
            System.out.println("IP OF THIS SYSTEM="+IPO);
        }
        catch(Exception e)
        {
            System.out.println("Exception caugh="+e.getMessage());
        }
    }
}
