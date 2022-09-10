package network;

import java.io.IOException;
import java.net.ServerSocket;

public class ListenOnAPort {

	public static ServerSocket listenOnAPort() throws IOException {
		return new ServerSocket(0);
	}

}
