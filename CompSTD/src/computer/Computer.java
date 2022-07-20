package computer;

import computer.software.Software;
import not_writed_method_error.NotWritedMethodException;

public class Computer {
	
	private Hardware hardware;
	private WorkStatus workStatus;
	private OperationSystem operationSystem;
		
	
	public void on() {
		System.err.println("Computer On not writed!");
	}
	
	public void off() {
		System.err.println("Computer Off not writed!");
	}
	
	public void sleep() {
		System.err.println("Computer Sleep not writed!");
	}
	
	public void startSoftware(Software software) {
		try {
			OperationSystem.work(software);
		} catch (NotWritedMethodException e) {
			e.printStackTrace();
		}
	}
	
}













