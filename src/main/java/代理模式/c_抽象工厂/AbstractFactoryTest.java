package 代理模式.c_抽象工厂;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory factory = null;
        QQ qq;
        Wechat wechat;

        System.out.println("Windows下：");
        factory=new WindowsFactory();
        qq=factory.produceQQ();
        wechat=factory.produceWechat();
        qq.Chat();
        wechat.Pay();

        System.out.println("Linux下：");
        factory=new LinuxFactory();
        qq=factory.produceQQ();
        wechat=factory.produceWechat();
        qq.Chat();
        wechat.Pay();

    }
}
