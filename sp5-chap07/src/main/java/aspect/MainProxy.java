package aspect;

public class MainProxy {
    public static void main(String[] args) {
        ExeTimeCalculator ttCal1 = new ExeTimeCalculator(new ImpleCalculator());
        System.out.println(ttCal1.factorial(200));

        ExeTimeCalculator ttCal2 = new ExeTimeCalculator((new RecCalculator()));
        System.out.println(ttCal2.factorial(200));
    }
}
