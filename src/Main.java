public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 55; //кг
        int height = (int) 1.70; //м
        int bmi = service.calculate(weight, height);

        System.out.println("Индекс массы тела" + bmi);
    }
}