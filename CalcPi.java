// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int x=Integer.parseInt(args[0]);
		double n=1;
		double sum=0;
		for(int i=0;i<x;i++){
			if (i%2==1) {
				sum=sum+(1/n)*(-1);
			}
		else{
			sum=sum+(1/n);
		}
		n=n+2;
	
		}
		 double pi=sum*4;
		 System.out.println("pi according to Java: 3.141592653589793");
		 System.out.println("pi, approximated:     " + pi);
	}
}
