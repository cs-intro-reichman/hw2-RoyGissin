// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int n=Integer.parseInt(args[0]);
		String str=args[1];
	    int seed=1;
		int sum=0;
        if(str.equals("c")){
         System.out.println("Every one of the first " +  n +  " hailstone sequences reached 1.");
	
		}
		else{

		for(int i=1;i<=n;i++){
			seed=i;
			sum=0;
		if(seed==1){
			System.out.print(seed + " ");
			seed=4;
			sum=1;
		}
		while (seed!=1) {
			System.out.print(seed + " ");
			if(seed%2==0){
					seed=seed/2;
				
			}
			else{
				seed=(seed*3)+1;
			}

			sum=sum+1;
		}
		System.out.print(1 + " ");
		sum=sum+1;
		System.out.println("(" + sum + ")");
	}
		
	
	System.out.println("Every one of the first " +  n +  " hailstone sequences reached 1.");

}
}

	
	

}

