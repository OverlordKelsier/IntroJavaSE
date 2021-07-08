public class Funciones {
    public static void main(String[] args) {
    int y =5;
        System.out.println(circleArea(y));
        System.out.println(sphereArea(y));
        System.out.println(sphereVol(y));
        System.out.println("Pesos a Dolares: "+convToDolar(1000, "MXN"));
    }
    public static double circleArea(double r){
        return  Math.PI * Math.pow(r,2);
    }
    public static double sphereArea(double r){
        return  4 * Math.PI * Math.pow(r,2);
    }
    public static double sphereVol(double r){
        return  (4/3) * Math.PI * Math.pow(r,3);
    }
    /**
     * Descripción: Función que especificando la monedad convierte su cantidad de dinero a dolares.
     *
     * @param quantity Cantidad de dinero.
     * @param currency Tipo de moneda: solo en (MXN o COP).
     * @return Devuelve la cantidad en dolares.
     * */
    public static double convToDolar(double quantity, String currency){
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }

}
