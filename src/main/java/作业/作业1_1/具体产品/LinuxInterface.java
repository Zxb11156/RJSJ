package 作业.作业1_1.具体产品;

import 作业.作业1_1.产品接口.InterfaceControl;

public class LinuxInterface implements InterfaceControl {
    @Override
    public void interfaceControl() {
        System.out.println("Linux游戏操作控制");
    }
}
