package org.arivuaata.rummyolan.console.rmi;

import static org.junit.jupiter.api.Assertions.*;

import org.arivuaata.rummy.console.ConsolePlayer;
import org.junit.jupiter.api.Test;

class ConsoleRMIPlayerTest {

	@Test
	void consoleRMIPlayerExtendsConsolePlayer() {
		ConsoleRMIPlayer consoleRMIPlayer = new ConsoleRMIPlayer();
		
		assertTrue(consoleRMIPlayer instanceof ConsolePlayer);
	}

}
