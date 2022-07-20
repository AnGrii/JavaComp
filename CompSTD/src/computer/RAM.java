package computer;

import computer.component.ComplexComponent;
import not_writed_method_error.NotWritedMethodException;

public abstract class RAM extends ComplexComponent {

	public RAM(int powerConsuming, LoadPercent loadPercent) throws NotWritedMethodException {
		super(powerConsuming, loadPercent);
		throw new NotWritedMethodException();
	}

	

}
