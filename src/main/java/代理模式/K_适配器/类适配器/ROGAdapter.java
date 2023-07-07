package 代理模式.K_适配器.类适配器;

public class ROGAdapter extends ROG implements Computer {

    @Override
    public void Msg() {
        msg();
        System.out.println("败家之眼！");
    }
}
