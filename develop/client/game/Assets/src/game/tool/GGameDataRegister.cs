public class GGameDataRegister:GameDataRegister
{
	public override void regist()
	{
		base.regist();

		add(new GBaseDataMaker());

		add(new GPlayerPartDataMaker());
		add(new GPlayerListDataMaker());
	}
}