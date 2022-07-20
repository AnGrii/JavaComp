package computer.component;

import computer.LoadPercent;

public abstract class ComplexComponent extends SimpleComponent {

	public ComplexComponent(int powerConsuming, LoadPercent loadPercent) {
		super(powerConsuming, loadPercent);
	}

	public abstract int calcWorkPoints();
}
