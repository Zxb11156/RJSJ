package 实验.实验1.工厂模式.具体产品;

import 实验.实验1.工厂模式.抽象产品.Game;

public class CF implements Game {
    @Override
    public void outMessage() {
        System.out.println("穿越火线是最好玩的FPS游戏");
    }
}
