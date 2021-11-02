public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 67.6;                                    // масса тела человека в килограммах
        double height = 1.76;                                    // рост человека в метрах
        double index = service.calculate(weight, height);        // индекс массы тела человека
        String indexFormat = String.format("%.2f", index);       // индекс массы тела человека, округленный до 2-го знака после запятой
        System.out.println(indexFormat);
    }
}
