public class ForLoop {
    static boolean isTOL = false;
    public static void main(String[] args) {
     turnOnOffL();
        for (int i = 1; i < 10; i++) {
            printSOS();
        }
    }
    public static void printSOS(){
        System.out.println("... _ _ _ ...");
    }
    public static boolean turnOnOffL(){
        //operador terniario
        isTOL = (isTOL)?false:true;
        /*if (isTOL){
            isTOL = false;
        }else {
            isTOL = true;
        }*/
        return isTOL;
    }
}
