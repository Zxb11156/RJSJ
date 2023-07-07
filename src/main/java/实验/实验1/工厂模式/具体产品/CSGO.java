package 实验.实验1.工厂模式.具体产品;

import 实验.实验1.工厂模式.抽象产品.Game;

public class CSGO implements Game {
    @Override
    public void outMessage() {
        System.out.println("CSGO是一款国际化的射击游戏");
    }
}
