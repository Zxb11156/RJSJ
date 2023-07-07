package 实验.实验2.适配器模式.对象适配器;

public class ROGAdapter implements Computer {

    private ROG rog;

    public ROGAdapter(ROG rog) {
        this.rog = rog;
    }

    @Override
    public void Msg() {
        rog.msg();
        System.out.println("败家之眼！");
    }
}
