package computer;

import computer.software.Software;
import not_writed_method_error.NotWritedMethodException;

public class Computer {
	
	private Hardware hardware;
	private WorkStatus workStatus;
	private OperationSystem operationSystem;
		
	
	public void on() throws NotWritedMethodException {
		throw new NotWritedMethodException();
	}
	
	public void off() throws NotWritedMethodException {
		throw new NotWritedMethodException();
	}
	
	public void sleep() throws NotWritedMethodException {
		throw new NotWritedMethodException();
	}
	
	public void lauchSoftware(Software software) {
		try {
			OperationSystem.work(software);
		} catch (NotWritedMethodException e) {
			e.printStackTrace();
		}
	}
	
}













