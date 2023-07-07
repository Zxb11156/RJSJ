package 实验.实验2.test;

//抽象的主题角色，即抽象的被观察者，在其中声明方法（添加、移除观察者，通知观察者）
public interface Watched {
    public void addLooker(Look look);
    public void removeLooker(Look look);
    public void NotifyLooker();
}
