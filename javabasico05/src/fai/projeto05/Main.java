package fai.projeto05;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Main app = new Main();
	app.menu();

	}
     private void menu() {
	 
     int valor;
     Scanner ler = new Scanner(System.in);
     int i;
     

	 
     for (i=0;i<=5;i++) {
         System.out.println("Digite opcao");
         valor = ler.nextInt();
     
     switch(valor) {
     
     case 1:System.out.println("Primeira condi��o");
     break;
     case 4: System.out.println("Segunda condi��o");
     break;
    	 default:System.out.println("N�o encontrou uma condi��o");
     }
 }
}
}
