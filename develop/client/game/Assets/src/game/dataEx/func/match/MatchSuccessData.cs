
namespace ShineEngine
{
	public class MatchSuccessData
	{
		/** 功能id */
		public int funcID;

		/**  */
		public int index;

		/** 匹配数据 */
		public PlayerMatchData[] matcheDatas;

		/** 清空 */
		public void clear()
		{
			funcID=0;
			index=0;
			matcheDatas=null;
		}
	}
}