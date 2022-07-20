package computer;

import computer.software.Software;
import not_writed_method_error.NotWritedMethodException;

public class OperationSystem {

	private LoadPercent cpuLoad = LoadPercent.load2;
	private LoadPercent gpuLoad = LoadPercent.load1;
	private LoadPercent ramLoad = LoadPercent.load5;
	
	public static void work(Software software) throws NotWritedMethodException {
		throw new NotWritedMethodException();
	}
	
	
}
