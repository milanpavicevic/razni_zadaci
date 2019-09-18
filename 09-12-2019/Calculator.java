package calculator2;
import static jdk.nashorn.internal.objects.Global.Infinity;

public class Calculator {

    public static void main(String[] args) {
        CalcMetode calc = new CalcMetode();
        double result = calc.add(12).div(0).sub(2).mul(20.5).add(-5).value();
        if (result == Infinity) {
            System.out.println("Nije dozvoljeno deljenje nulom!");
        } else {
            System.out.println(result);
        }
    }

}
