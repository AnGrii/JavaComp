package computer;

import computer.software.Software;
import not_writed_method_error.NotWritedMethodException;

public class OperationSystem {

	private final int cpuLoad = 2;
	private final int gpuLoad = 1;
	private final int ramLoad = 5;
	
	public static void work(Software software) throws NotWritedMethodException {
		throw new NotWritedMethodException();
	}
	
	private void stockLoad(Hardware hardware) {
		hardware.stockLoad(cpuLoad, gpuLoad, ramLoad);
	}
	
}
