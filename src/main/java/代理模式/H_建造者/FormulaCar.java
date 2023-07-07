package 代理模式.H_建造者;

public class FormulaCar extends CarBuilder{
    @Override
    public void buildBody() {
        car.setBody("方程式赛车车身");
    }

    @Override
    public void buildEngine() {
        car.setEngine("方程式赛车发动机");
    }

    @Override
    public void buildTyre() {
        car.setTyre("方程式赛车轮胎");
    }

    @Override
    public void buildGearbox() {
        car.setGearbox("方程式赛车变速箱");
    }
}
