// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numbers= Integer.parseInt(args[0]);
		double pi=1;
		double den=3;
	
		for (int i = 0; i < numbers; i++) {
			if(i%2==0){
				pi-=1/den;
			}
			else{
				pi+=1/den;
			}
			den+=2;
		}
		System.out.println("pi according to Java: "+Math.PI+"\n"+
		"pi, approximated:     "+pi*4);
		
	}
}
