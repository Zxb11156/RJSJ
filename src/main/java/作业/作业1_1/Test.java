package 作业.作业1_1;

import 作业.作业1_1.具体工厂.IOSFactory;
import 作业.作业1_1.具体工厂.LinuxFactory;
import 作业.作业1_1.抽象工厂.AbstractFactory;
import 作业.作业1_1.产品接口.InterfaceControl;
import 作业.作业1_1.产品接口.OperationControl;

public class Test {
    public static void main(String[] args) {
        AbstractFactory factory = null;
        InterfaceControl interfaceControl = null;
        OperationControl operationControl = null;

        factory = new LinuxFactory();
        interfaceControl = factory.produceInterfaceControl();
        operationControl = factory.produceOperationControl();
        interfaceControl.interfaceControl();
        operationControl.operationControl();
        System.out.println("-------------------------------------");
        factory = new IOSFactory();
        interfaceControl = factory.produceInterfaceControl();
        operationControl = factory.produceOperationControl();
        interfaceControl.interfaceControl();
        operationControl.operationControl();
    }
}
