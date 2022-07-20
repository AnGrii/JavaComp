package computer.software;

import computer.LoadPercent;

public class Software {
	
	long cpuPoints;
	long gpuPoints;
	long ramPoints;
	LoadPercent loadPercent;
	
	public Software(
			long cpuPoints,
			long gpuPoints,
			long ramPoints,
			LoadPercent loadPercent) {
		this.cpuPoints = cpuPoints;
		this.gpuPoints = gpuPoints;
		this.ramPoints = ramPoints;
		this.loadPercent = loadPercent;
	}
	
}








