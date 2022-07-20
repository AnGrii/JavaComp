package computer_test.computer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import computer.Computer;
import computer.LoadPercent;
import computer.software.Software;

class ComputertTest {

	@Test
	void on() {
		Computer computer = new Computer();

		computer.on();
	}
	
	@Test
	void onAndOff() {
		Computer computer = new Computer();

		computer.on();
		computer.off();
	}
	
	@Test
	void off() {
		Computer computer = new Computer();

		computer.off();
	}
	
	@Test
	void onAndSleep() {
		Computer computer = new Computer();

		computer.on();
		
		computer.sleep();
	}
	
	@Test
	void sleep() {
		Computer computer = new Computer();

		computer.sleep();
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



