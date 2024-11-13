public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutestoAdd= Integer.parseInt(args[1]);
        int totalminuts= (60*hours)+minutes+minutestoAdd;
        int totalhours=totalminuts/60;
        int newhours=totalhours%24;
        int newminutes=(totalminuts-(totalhours*60));
        if(newhours<10 && newminutes<10){
            System.out.println("0" + newhours + ":0" + newminutes);
        }
        else if (newminutes<10) {
            System.out.println(newhours + ":0" + newminutes );
            
        }
        else if (newhours<10) {
            System.out.println("0" + newhours +  ":" + newminutes);
            
        }
        else{
          System.out.println(newhours + ":" + newminutes);
        }
      


        // Replace this comment with your code
    }
}
