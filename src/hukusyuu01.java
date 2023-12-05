

public class hukusyuu01 {

    public static void main(String[] args) {
        int score = 59;

        int rank = ranking(score);

        switch (rank) {
        case 0 :
        case 1 :
        case 2 :
        case 3 :
        case 4 :
        case 5 :
            System.out.println("赤点です");
            break;
        case 6 :
        case 7 :
        case 8 :
            System.out.println("合格です");
            break;
        case 9 :
        case 10 :
            System.out.println("優秀です");
           break;
        default:
            System.out.println("無効な値です");
            break;
        }

    }


    public static int ranking(int score){
        if (score < 0) {
            return -1;
        }else if (score > 100) {
            return 11;
        }else {
            return score / 10;
        }



    }


}
