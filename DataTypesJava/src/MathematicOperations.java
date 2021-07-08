public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        System.out.println(Math.PI);
        System.out.println(Math.ceil(x)); //entero hacia arriba
        System.out.println(Math.floor(x));// hacia abajo
        System.out.println(Math.pow(x,y));//numero elevado al otro
        System.out.println(Math.max(x,y));//max
        System.out.println(Math.sqrt(y));// raiz cuadrada
        System.out.println(Math.PI * Math.pow(y,2));// Area del circulo
        System.out.println(4*Math.PI*Math.pow(y,2));// area esfera
        System.out.println((4/3)*Math.PI*Math.pow(y,3)); //vol esfera
    }
}
