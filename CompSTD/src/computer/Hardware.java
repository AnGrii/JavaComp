package computer;

import computer.coolingSystem.CoolingSystem;
import not_writed_method_error.NotWritedMethodException;

public class Hardware {
	CPU cpu;
	GPU gpu;
	RAM ram;
	CoolingSystem coolingSystem;
	PowerSupply powerSulply;
	
	public void start(LoadPercent cpuLoad, LoadPercent gpuLoad, LoadPercent ramLoad) throws NotWritedMethodException {
		cpu.load(cpuLoad);
		gpu.load(gpuLoad);
		ram.load(ramLoad);
	}
	
}
