package network;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.net.ServerSocket;

import org.junit.jupiter.api.Test;

class ListenOnAPortTest {

	@Test
	void listenOnAPort() throws IOException {
		ServerSocket serverSocket = ListenOnAPort.listenOnAPort();
		assertTrue(serverSocket.getLocalPort() > 0);
	}

}
