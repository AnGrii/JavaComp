package computer;

import not_writed_method_error.NotWritedMethodException;

public abstract class RAM {

	protected abstract void stockLoad(int ramLoad);

	public void load(LoadPercent ramLoad) throws NotWritedMethodException {
		throw new NotWritedMethodException();
	}

}
