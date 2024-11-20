
public class Collatz {

    public static void main(String args[]) {
        int seeds = Integer.parseInt(args[0]);
        String printway = args[1];
        final String VERBOSE = "v";
        int num ;
		
        for (int i = 1; i <= seeds; i++) {
			int counter=1;
            num = i;
            do {
				if(printway.equals(VERBOSE)){

					System.out.print(num + " ");
				}
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = num * 3 + 1;
                }
				counter++;
            } while (num != 1);
			if(printway.equals(VERBOSE)){

				System.out.println("1 ("+counter+")");
			}
			
			
        }
		System.out.println("Every one of the first "+seeds+" hailstone sequences reached 1.");
    }
}
