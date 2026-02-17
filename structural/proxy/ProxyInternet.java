package structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{

    private final Internet realInternet;

    public ProxyInternet(){
        this.realInternet = new RealInternet();
    }

    private static final List<String> bannedList= new ArrayList<>();

    static{
        bannedList.add("abc.com");
        bannedList.add("def.com");
        bannedList.add("ijk.com");
        bannedList.add("lnm.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if(bannedList.contains(serverHost)){
            throw new Exception("Access Denied to " + serverHost);
        }
        realInternet.connectTo(serverHost);
    }

}
