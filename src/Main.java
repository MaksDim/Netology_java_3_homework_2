public class Main {
    public static void main(String[] args) {
        IMT service = new IMT();
        int weight = 60;
        double height = 1.70;
        double imt = service.calculate(weight, height);
        System.out.println(imt);
    }
}
