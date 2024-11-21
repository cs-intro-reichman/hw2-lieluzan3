
public  class  TestRandom {
	public static void main(String[]  args) {
		//num is input how many times to get a random number
		int num= Integer.parseInt(args[0]);
		//up and down are counters
		double up=0;
		double under=0;
		for (int i = 0; i <num; i++) {
			double a = Math.random(); 
			if(a<=0.5)
				under++;
			else
				up++;
		}
		if(up==0||under==0){
		System.out.println("> 0.5 : "+(int)up+" times"+" ; <=0.5 : "+(int)under+" times");
		}
		else if(up>under){
			double ratio=under/up;
		System.out.println("> 0.5 : "+(int)up+" times"+" ; <=0.5 : "+(int)under+" times "+" Ratio : "+ratio );
		}
		else if(up==under){
			System.out.println("> 0.5 : "+(int)up+" times"+" ; <=0.5 : "+(int)under+" times "+" Ratio : "+1);
		}
		else{
		double ratio=up/under;
		System.out.println("> 0.5 : "+(int)up+" times"+" ; <=0.5 : "+(int)under+" times "+" Ratio : "+ratio );
			}
		}
	     
	}

