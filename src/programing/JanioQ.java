package programing;
import java.util.Scanner;
public class JanioQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner s=new Scanner (System.in);
		
		System.out.print("ingrese nota1:");
        int nota1= s.nextInt();
        
        System.out.print("ingrese nota2:");
        int nota2= s.nextInt();
        
        System.out.print("ingrese nota3:");
        int nota3= s.nextInt();
        
       
        System.out.print("resultado:"+((nota1+nota2+nota3)/3));
	}

}
