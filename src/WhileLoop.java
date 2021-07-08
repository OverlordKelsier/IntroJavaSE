public class WhileLoop {
    static boolean isTOL = false;
    public static void main(String[] args) {
        turnOnOffL();
        int i=1;
         while(isTOL&&i<=10){
            printSOS();
            i++;
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
