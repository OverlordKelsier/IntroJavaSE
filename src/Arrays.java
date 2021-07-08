public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String days[] = new String[7];
        String[][] cities = new String[4][2];
        int [][][] numbers = new int[2][2][2];
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";
        for (String androidVersion:androidVersions) {
            System.out.println(androidVersion);
        }
        /*for (int i = 0; i < 4; i++) {
            System.out.println(androidVersions[i]);
        }*/
        System.out.println("");
        System.out.println("");
        cities[0][0] = "Colombia";
        cities[0][1] = "a";
        cities[1][0] = "b";
        cities[1][1] = "c";
        cities[2][0] = "d";
        cities[2][1] = "e";
        cities[3][0] = "f";
        cities[3][1] = "g";

        for (String[] pair:cities) {
            for (String name:pair) {
                System.out.println(name);
            }

        }

        /*for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }*/
        /*System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);
        System.out.println(cities[1][1]);*/



    }
}
