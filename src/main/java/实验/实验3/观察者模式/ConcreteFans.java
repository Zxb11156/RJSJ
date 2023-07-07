package 实验.实验3.观察者模式;


//具体观察者
public class ConcreteFans implements Fans{
    private String fansName;

    public ConcreteFans(String fansName) {
        this.fansName = fansName;
    }

    @Override
    public void update(String msg) {
        System.out.println(fansName + "收到了：" + msg +"  这条消息");
    }
}
