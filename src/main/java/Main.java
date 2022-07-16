public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        //демонстрация

        System.out.println(calc.mult(1, 10));
        System.out.println(calc.div(100, 10));
        System.out.println(calc.pow(2, 5));
        System.out.println(calc.sub(43, 1));
        System.out.println(calc.sum(15, 15));

    }
}