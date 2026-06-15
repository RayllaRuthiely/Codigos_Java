package cadastrodecombustivel;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int codigo;
		int alcool = 0;
		int Gasolina = 0;
		int Diesel = 0;
		String op;
		
			System.out.println("--- MENU ---");
			System.out.println("[1] - Alcool");
			System.out.println("[2] - Gasolina");
			System.out.println("[3] - Diesel");
			System.out.println("[4] - Saida");
			
			System.out.print("Digite o codigo do combustivel: ");
			codigo = teclado.nextInt();
			while(codigo != 4) {
				if(codigo == 1) {
					alcool++;
				}else if(codigo == 2) {
					Gasolina++;
				}else if(codigo == 3) {
					Diesel++;
				}
				System.out.print("Digite o codigo do combustivel: ");
	            codigo = teclado.nextInt();
			}
			System.out.println("MUITO OBRIGADO!");
			System.out.println("Alcool: " + alcool);
			System.out.println("Gasolina: " + Gasolina);
			System.out.println("Diesel: " + Diesel);
			System.out.println("---------------------------------------------------");

	}

}
