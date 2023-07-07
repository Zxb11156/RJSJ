package 代理模式.c_抽象工厂;

public class LinuxFactory implements AbstractFactory{
    @Override
    public QQ produceQQ() {
       return new LinuxQQ();
    }

    @Override
    public Wechat produceWechat() {
       return new LinuxWechat();
    }
}
