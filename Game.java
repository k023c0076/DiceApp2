package DiceApp2;

public class Game {
    Player p1,p2;
    Dice d1,d2;

    Game(){
        p1 = new Player();
        p2 = new Player();
        d1 = new Dice();
        d2 = new Dice();
    }

    void start(){
        p1.turn(d1);
        p2.turn(d2);
        System.out.println("プレイヤー1の目:" + d1.me);
        System.out.println("プレイヤー2の目:" + d2.me);
    }

    void judge(){
        if(d1.me == d2.me){
            System.out.println("あいこ");
        }
        else if(d1.me < d2.me){
            System.out.println("プレイヤー2の勝ち");
        }
        else{
            System.out.println("プレイヤー1の勝ち");
        }
    }

}
