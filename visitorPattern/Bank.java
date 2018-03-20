package visitorPattern;

public class Bank {
	
public void DoBusiness(IUI ui)
{
	Savings savings=new Savings();
	savings.setUi(ui);
	savings.DoJob();
	
	Current curr=new Current();
	curr.setUi(ui);
	curr.DoJob();
	
	Dmat dm=new Dmat();
	dm.setUi(ui);
	dm.DoJob();
	
}
}
