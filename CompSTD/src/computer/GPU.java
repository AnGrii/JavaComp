package computer;

import not_writed_method_error.NotWritedMethodException;

public abstract class GPU {

	protected abstract void stockLoad(int gpuLoad);

	public void load(LoadPercent gpuLoad) throws NotWritedMethodException {
		throw new NotWritedMethodException();	
	}

}
