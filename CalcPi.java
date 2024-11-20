// Computes an approximation of PI.

public class CalcPi {

    public static void main(String[] args) {
        int numbers = 10;
        double pi = 1;
        double den = 3;
		
        for (int i = 0; i < numbers-1; i++) {
			double d = (1.0 / den);
            if (i % 2 == 0) {
                pi = pi - d;
            } else {
                pi = pi + d;
            }
            den += 2;
        }
        System.out.println("pi according to Java: " + Math.PI + "\n"
                + "pi, approximated:     " + pi * 4);

    }
}
