package 代理模式.f_观察者;

public class Cat extends MySubject
{
	public void cry()
	{
		System.out.println("è�У�");
		System.out.println("----------------------------");		
		
		for(Object obs:observers)
		{
			((MyObserver)obs).response();
		}
		
	}	   	
}