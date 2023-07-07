package 代理模式.代理模式;

import 代理模式.代理模式.AbstractSubject;

public class RealSubjectB implements AbstractSubject
{	
	public void request()
	{
		System.out.println("B球队比赛");
	}
}