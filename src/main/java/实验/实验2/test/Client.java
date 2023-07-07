package 实验.实验2.test;

public class Client {
    public static void main(String[] args) {
        Watched watcher=new Shop();

        Look look1=new Guard();
        Look look2=new Camera();

        watcher.addLooker(look1);
        watcher.addLooker(look2);

        watcher.NotifyLooker();
    }



}
