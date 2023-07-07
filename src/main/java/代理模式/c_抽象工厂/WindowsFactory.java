package 代理模式.c_抽象工厂;

public class WindowsFactory implements AbstractFactory{
    @Override
    public QQ produceQQ() {
        return new WindowsQQ();
    }

    @Override
    public Wechat produceWechat() {
        return new WindowsWechat();
    }
}
