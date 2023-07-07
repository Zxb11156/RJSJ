package 代理模式.g_装饰者;
//动态拓展类的功能
//人走，超人会飞
interface Human {
    public void run();
}

class Man implements Human {

    @Override
    public void run() {
        System.out.println("一个真正的man");
    }
}

//抽象的装饰器接口
abstract class AbstractDecorator implements Human{

    public Human human;

    public AbstractDecorator(Human human) {
        this.human = human;
    }

    @Override
    public void run() {
        human.run();
    }
}

class Decorator extends AbstractDecorator{

    public Decorator(Human human) {
        super(human);
    }

    public void run(){
        super.run();
        fly();
    }

    public void fly(){
        System.out.println("飞");
    }
}

public class 装饰者 {
    public static void main(String[] args) {
        Human human=new Man();
        System.out.println("原来的功能:");
        human.run();

        Human superman = new Decorator(human);
        System.out.println("装饰后:");
        superman.run();
    }
}
