// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	  String x=args[0];
          x=x.toUpperCase();
          int number=Integer.parseInt(args[1]);
          for(int i=0; i<x.length();i++){
                if (x.charAt(i)=='A'|| x.charAt(i)=='E' || x.charAt(i)=='F' 
                || x.charAt(i)=='H' || x.charAt(i)=='I' || x.charAt(i)=='L'
                || x.charAt(i)=='M' || x.charAt(i)=='N' || x.charAt(i)=='O'
                || x.charAt(i)=='R' || x.charAt(i)=='S' || x.charAt(i)=='X' ) {
                    System.out.println("Give me an " + x.charAt(i) + ": " + x.charAt(i) + "!");    
                        
                }
                else{
                     System.out.println("Give me a  " + x.charAt(i) + ": " + x.charAt(i) + "!");   
                }
        }
        System.out.println("What does that spell?");
        for(int i=0;i<number;i++){
           System.out.println(x + "!!!");
        }



        }
}
