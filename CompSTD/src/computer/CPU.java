package computer;

import not_writed_method_error.NotWritedMethodException;

abstract class CPU {

	private double ggz;
	private int cores;
	private int powerConsuming;
	
	CPU(double ggz, int cores, int powerConsuming) {
		this.ggz = ggz;
		this.cores = cores;
		this.powerConsuming = powerConsuming;
	}

	public void load(LoadPercent cpuLoad) throws NotWritedMethodException {
		throw new NotWritedMethodException();
	}
	
}
