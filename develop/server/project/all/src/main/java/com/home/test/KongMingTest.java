package com.home.test;

import com.home.shine.ctrl.Ctrl;
import com.home.shine.support.collection.SList;

public class KongMingTest
{
	public static void main(String[] args)
	{
		new KongMingTest().init();
	}
	
	private static int getIndex(int x,int y)
	{
		return x<<3 | y;
	}
	
	/** 是否棋盘内 */
	private static boolean isEnable(int x,int y)
	{
		return !((x<=1 || x>=5) && (y<=1 || y>=5));
	}
	
	private class One
	{
		public int x;
		
		public int y;
		
		public boolean isOn;
	}
	
	private class Step
	{
		public Step parent;
		
		public int deep;
		
		public int x;
		public int y;
		public int dir;
		
		public SList<Step> list=new SList<>(Step[]::new);
		
		public int currentIndex=-1;
		
		public boolean isDone;
		
		public Step(Step parent,int x,int y,int dir)
		{
			this.parent=parent;
			this.deep=parent==null ? 0 : parent.deep+1;
			this.x=x;
			this.y=y;
			this.dir=dir;
		}
	}
	
	private One[] _dic=new One[64];
	
	private int _onNum;
	
	private Step _rootStep=new Step(null,3,3,4);
	
	private Step _currentStep;
	
	private boolean _isOver=false;
	
	public void init()
	{
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(isEnable(i,j))
				{
					One one=new One();
					one.x=i;
					one.y=j;
					one.isOn=!(i==3 && j==3);
					_dic[getIndex(i,j)]=one;
				}
			}
		}
		
		_onNum=32;
		
		findStepsFromHole(_rootStep,3,3);
		
		_rootStep.currentIndex=0;
		_currentStep=_rootStep.list.get(0);
		
		while(!_isOver)
		{
			doLoop();
		}
	}
	
	private void doLoop()
	{
		if(_currentStep.isDone)
		{
			executeStep(_currentStep,true);
			Step parent=_currentStep.parent;
			parent.currentIndex++;
			if(parent.currentIndex<parent.list.size())
			{
				_currentStep=parent.list.get(parent.currentIndex);
			}
			else
			{
				_currentStep=parent;
				_currentStep.isDone=true;
			}
		}
		else
		{
			executeStep(_currentStep,false);
			findStepsFromAll(_currentStep);
			
			//尽头
			if(_currentStep.list.isEmpty())
			{
				_currentStep.isDone=true;
				
				if(_onNum==1)
				{
					_isOver=true;
					Ctrl.print("完成!");
				}
			}
			else
			{
				_currentStep.currentIndex=0;
				_currentStep=_currentStep.list.get(0);
			}
		}
	}
	
	/** isTurn:是否逆执行 */
	private void executeStep(Step step,boolean isTurn)
	{
		Ctrl.print("step:",step.deep,isTurn,step.x,step.y,step.dir);
		
		One one=getOne(step.x,step.y);
		one.isOn=!isTurn;
		_onNum+=(isTurn ? 1 : -1);
		
		switch(step.dir)
		{
			case 0:
			{
				getOne(step.x-1,step.y).isOn=isTurn;
				getOne(step.x-2,step.y).isOn=isTurn;
			}
				break;
			case 1:
			{
				getOne(step.x,step.y+1).isOn=isTurn;
				getOne(step.x,step.y+2).isOn=isTurn;
			}
				break;
			case 2:
			{
				getOne(step.x+1,step.y).isOn=isTurn;
				getOne(step.x+2,step.y).isOn=isTurn;
			}
				break;
			case 3:
			{
				getOne(step.x,step.y-1).isOn=isTurn;
				getOne(step.x,step.y-2).isOn=isTurn;
			}
			
				break;
		}
	}
	
	private One getOne(int x,int y)
	{
		int index=getIndex(x,y);
		
		if(index<0 || index>=64)
			return null;
		
		return _dic[index];
	}
	
	private void findStepsFromAll(Step step)
	{
		One one;
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				if((one=getOne(i,j))!=null)
				{
					if(!one.isOn)
					{
						findStepsFromHole(step,i,j);
					}
				}
			}
		}
	}
	
	private void findStepsFromHole(Step step,int x,int y)
	{
		One o0;
		One o1;
		//0
		if((o0=getOne(x-1,y))!=null && o0.isOn && (o1=getOne(x-2,y))!=null && o1.isOn)
		{
			step.list.add(new Step(step,x,y,0));
		}
		
		//1
		if((o0=getOne(x,y+1))!=null && o0.isOn && (o1=getOne(x,y+2))!=null && o1.isOn)
		{
			step.list.add(new Step(step,x,y,1));
		}
		
		//2
		if((o0=getOne(x+1,y))!=null && o0.isOn && (o1=getOne(x+2,y))!=null && o1.isOn)
		{
			step.list.add(new Step(step,x,y,2));
		}
		
		//3
		if((o0=getOne(x,y-1))!=null && o0.isOn && (o1=getOne(x,y-2))!=null && o1.isOn)
		{
			step.list.add(new Step(step,x,y,3));
		}
	}
}
