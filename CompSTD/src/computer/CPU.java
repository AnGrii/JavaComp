package computer;

import computer.component.ComplexComponent;
import not_writed_method_error.NotWritedMethodException;

abstract class CPU extends ComplexComponent {

	public CPU(int powerConsuming, LoadPercent loadPercent) throws NotWritedMethodException {
		super(powerConsuming, loadPercent);
		throw new NotWritedMethodException();
	}
	private double ggz;
	private int cores;
	
	

	
	
	
}
