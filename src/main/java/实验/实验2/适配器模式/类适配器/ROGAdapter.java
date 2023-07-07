package 实验.实验2.适配器模式.类适配器;

public class ROGAdapter extends ROG implements Computer{

    @Override
    public void Msg() {
        msg();
        System.out.println("败家之眼！");
    }
}
