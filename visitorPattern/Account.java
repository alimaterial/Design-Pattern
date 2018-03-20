package visitorPattern;

public abstract class Account {
	protected IUI ui;

	public void setUi(IUI ui) {
		this.ui = ui;
	}

	public abstract void DoJob();
}
