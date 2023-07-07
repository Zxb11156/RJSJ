package 代理模式.d_工厂方法;

//测试

public  class FactoryTest {

    public static void main(String[] args) {

        VehicleFactory vehicleFactory = null;
        Vehicle vehicle;
        //公交车测试
        vehicleFactory = new ByBus();
        vehicle = vehicleFactory.getVehicle();
        vehicle.workBy();


        //开小汽车测试
        vehicleFactory = new ByCar();
        vehicle = vehicleFactory.getVehicle();
        vehicle.workBy();

    }
}
