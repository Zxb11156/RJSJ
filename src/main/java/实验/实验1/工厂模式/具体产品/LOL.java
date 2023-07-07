package 实验.实验1.工厂模式.具体产品;

import 实验.实验1.工厂模式.抽象产品.Game;

public class LOL implements Game {
    @Override
    public void outMessage() {
        System.out.println("英雄联盟是最好玩的MOBA游戏");
    }
}
