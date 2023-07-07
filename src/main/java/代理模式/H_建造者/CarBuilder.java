package 代理模式.H_建造者;

public abstract class CarBuilder{
    protected Car car = new Car();
    public abstract void buildBody();
    public abstract void buildEngine();
    public abstract void buildTyre();
    public abstract void buildGearbox();

    public Car getCar(){
        return car;
    }
}
