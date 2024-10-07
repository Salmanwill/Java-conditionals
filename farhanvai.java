import java.util.Scanner;
public class farhanvai {

    public static void main(String[] args) { Scanner scan = new Scanner(System.in);

        System.out.println("enter 1st number:");
        Double nmb = scan.nextDouble();
       
  
        
  
        System.out.println("Enter 2nd number:");
        Double nmbr = scan.nextDouble();
        
        
  
        System.out.print("what operation you want to use?");
        String dmb = scan.nextLine();
        
        
        if(dmb.equals( "sum")){
          System.out.printf( "%f + %f = %f", nmb , nmbr , nmb + nmbr);
        }
          
      
  
  scan.close();
}


}