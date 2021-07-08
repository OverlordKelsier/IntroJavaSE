public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        salary = salary + 200;
        System.out.println(salary);

        salary +=300;
        System.out.println(salary);

        String employeeName = "Anahí ";
        employeeName = employeeName + "Salgado ";
        System.out.println(salary);

        employeeName += "Díaz de la Vega ";
        System.out.println(employeeName);

        employeeName = "Irene " + employeeName;
        System.out.println(employeeName);
    }
}
