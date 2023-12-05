
public class IfElseSmaple {

    public static void main(String[] args) {
        int scoreSansuu = 100;
        int scoreKokugo = 79;

        if (scoreSansuu == 100 && scoreKokugo == 100) {System.out.println("主席です");
        }
        else if (scoreSansuu >= 80 && scoreKokugo >= 80) {
            System.out.println("合格です");}
        else if(scoreSansuu > 80 || scoreKokugo >80) {
            System.out.println("いずれかがオシイです");}
        else {System.out.println("やりなおしましょう");}
    }

}
