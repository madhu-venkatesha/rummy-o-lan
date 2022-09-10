package network;

import static org.junit.jupiter.api.Assertions.*;

import java.net.UnknownHostException;

import org.junit.jupiter.api.Test;

class FetchMyIPv4AddressTest {

	@Test
	void fetchMyIPv4Address() throws UnknownHostException {
		assertNotNull(FetchMyIPv4Address.fetchMyIPv4Address());
	}

}
