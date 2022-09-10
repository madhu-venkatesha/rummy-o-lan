package network;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class FetchMyIPv4Address {

	public static String fetchMyIPv4Address() throws UnknownHostException {
		return Inet4Address.getLocalHost().getHostAddress();
	}

}
