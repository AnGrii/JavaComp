package computer;

import computer.component.ComplexComponent;
import not_writed_method_error.NotWritedMethodException;

public abstract class GPU extends ComplexComponent {

	public GPU(int powerConsuming, LoadPercent loadPercent) throws NotWritedMethodException {
		super(powerConsuming, loadPercent);
		throw new NotWritedMethodException();
	}

	



}
