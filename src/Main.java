public class Main {

    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(5, 7));
        System.out.println(intsCalc.sum(12, 32));
        System.out.println(intsCalc.pow(2, 8));
        System.out.println(intsCalc.mult(4, 5));
    }
}
