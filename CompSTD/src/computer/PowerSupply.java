package computer;

import computer.component.SimpleComponent;
import not_writed_method_error.NotWritedMethodException;

public abstract class PowerSupply extends SimpleComponent {

	public PowerSupply(int powerConsuming, LoadPercent loadPercent) throws NotWritedMethodException {
		super(powerConsuming, loadPercent);
		throw new NotWritedMethodException();
	}

}
