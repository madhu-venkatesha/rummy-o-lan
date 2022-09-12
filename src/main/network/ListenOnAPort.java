package network;

import java.io.IOException;
import java.net.ServerSocket;

public class ListenOnAPort {

	public static ServerSocket listenOnAPort() throws IOException {
		try (ServerSocket serverSocket = new ServerSocket(0)) {
			return serverSocket;
		}
	}

}
