public class DataTypes {
    public static void main(String[] args) {
        int nI = 1234567890;
        long nL = 454655454656L;
        double nD = 123.456;
        float nF = 123.456F;
        char nC = '@';
        boolean nB = true;
        var salary = 1000;
        var pension = salary*0.03;
        var tot = salary -pension;
        System.out.println(tot);

        int lives = 5;
        lives = lives - 1;
        lives--;
        System.out.println(lives);
        lives++;
        int gift = 100 + lives++;
        System.out.println(gift);
        System.out.println(lives);


    }
}
