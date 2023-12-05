
public class Triangle {

    public static void main(String[] args) {
        int a = 4; //底辺
        int b = 5; //右斜辺
        int c = 6; //左斜辺
            if (a == b && b==c && c==a) {
                System.out.println("正三角形");
            }else if (a == b || b == c || c == a) {
                System.out.println("二等辺三角形");
            }else {
                System.out.println("不等辺三角形");
            }




    }

}
