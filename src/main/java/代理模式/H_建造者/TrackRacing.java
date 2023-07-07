package 代理模式.H_建造者;

public class TrackRacing extends CarBuilder{
    @Override
    public void buildBody() {
        car.setBody("场地越野赛车车身");
    }

    @Override
    public void buildEngine() {
        car.setEngine("场地越野赛车发动机");
    }

    @Override
    public void buildTyre() {
        car.setTyre("场地越野赛车轮胎");
    }

    @Override
    public void buildGearbox() {
        car.setGearbox("场地越野赛车变速箱");
    }
}
