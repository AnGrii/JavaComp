package computer_test.computer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import computer.Computer;
import computer.LoadPercent;
import computer.software.Software;

class ComputertTest {

	@Test
	void on() {
		fail("Not yet implemented");
	}

	@Test
	void off() {
		fail("Not yet implemented");
	}
	
	@Test
	void lauchSoftware() {
		
		Computer computer = new Computer();

		computer.on();

		Software renderPhoto = new Software(1000, 2500, 1500, LoadPercent.load5);

		computer.lauchSoftware(renderPhoto);

		computer.off();
	}
	
}



