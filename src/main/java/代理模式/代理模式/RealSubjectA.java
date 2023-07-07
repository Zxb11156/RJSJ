package 代理模式.代理模式;

import 代理模式.代理模式.AbstractSubject;

public class RealSubjectA implements AbstractSubject
{	
	public void request()
	{
		System.out.println("A球队比赛");
	}
}