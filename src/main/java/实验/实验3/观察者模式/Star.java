package 实验.实验3.观察者模式;



//抽象主题
public interface Star {

    //添加粉丝
    public void addFans(Fans fans);

    //删除粉丝
    public void delFans(Fans fans);

    //告诉粉丝动态
    public void notify(String msg);
}
