package computer.coolingSystem;

import computer.LoadPercent;
import computer.component.SimpleComponent;
import not_writed_method_error.NotWritedMethodException;

public abstract class CoolingSystem extends SimpleComponent {

	public CoolingSystem(int powerConsuming, LoadPercent loadPercent) throws NotWritedMethodException {
		super(powerConsuming, loadPercent);
		throw new NotWritedMethodException();
	}

}
