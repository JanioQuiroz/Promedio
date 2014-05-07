package programing;
import java.util.*;
public class programing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner e= new Scanner (System.in);
boolean operador_valido=false;
char operador='0';

System.out.print("ingrese un numero: ");
int num1=e.nextInt();

while (!operador_valido){
System.out.print("ingrese un operador: ");
 operador=e.next().charAt(0);
if(operador=='+')
	operador_valido=true;
if(operador=='-')
	operador_valido=true;
if(operador=='*')
	operador_valido=true;
if(operador=='/')
	operador_valido=true;

}

System.out.print("ingrese un numero2: ");
int num2=e.nextInt();

switch(operador){
case '+':
	int suma=num1+num2;
	System.out.print(suma);
	break;
	case '-':
		
	int resta=num1-num2;
	System.out.print(resta);
	break;
	case '*':
	
		int multi=num1*num2;
		System.out.print(multi);
		break;
	case '/':
		int divi=num1/num2;
		System.out.print(divi);
		break;
		default: 
			System.out.print("ingrese un operador: / * - +");
	
}


	}


}