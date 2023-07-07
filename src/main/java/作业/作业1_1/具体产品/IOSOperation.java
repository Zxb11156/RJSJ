package 作业.作业1_1.具体产品;

import 作业.作业1_1.产品接口.OperationControl;

public class IOSOperation implements OperationControl {
    @Override
    public void operationControl() {
        System.out.println("IOS游戏界面控制");
    }
}
