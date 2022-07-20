package computer.component;

import computer.LoadPercent;

public abstract class SimpleComponent {
	
	@SuppressWarnings("unused")
	private int powerConsuming;
	
	@SuppressWarnings("unused")
	private LoadPercent loadPercent;
	
	public SimpleComponent(int powerConsuming, LoadPercent loadPercent) {
		this.powerConsuming = powerConsuming;
		this.loadPercent = loadPercent;
	}
	
	public abstract void load(LoadPercent loadPercent);
	
	public abstract int calcPowerConsuming();
}
