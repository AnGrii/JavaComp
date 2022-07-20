package computer;

import computer.coolingSystem.CoolingSystem;

public class Hardware {
	CPU cpu;
	GPU gpu;
	RAM ram;
	CoolingSystem coolingSystem;
	PowerSupply powerSulply;
	
	public void stockLoad(int cpuLoad, int gpuLoad, int ramLoad) {
		cpu.stockLoad(cpuLoad);
		gpu.stockLoad(gpuLoad);
		ram.stockLoad(ramLoad);
	}
}
