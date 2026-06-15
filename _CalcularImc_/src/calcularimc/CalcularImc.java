package calcularimc;

import java.util.Scanner;

public class CalcularImc {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float peso, altura, imc;
		
		System.out.print("Digite seu peso: ");
		peso = teclado.nextFloat();
		System.out.print("Digite sua altura: ");
		altura = teclado.nextFloat();
		
		imc = peso / (altura * altura);
		System.out.printf("Seu IMC e: %.2f \n", imc);
		
		if(imc <= 18.5) {
			System.out.print("Classificacao: Abaixo do peso! ");
		}else if(imc < 25) {
			System.out.print("Classificacao: Peso normal! ");
		}else if(imc < 30) {
			System.out.print("Classificacao: Sobrepeso! ");
		}else if(imc < 35) {
			System.out.print("Classificacao: Obsidade grau 1! ");
		}else if(imc < 40) {
			System.out.print("Classificacao: Obsidade grau 2! ");
		}else {
			System.out.print("Classificacao: Obsidade grau 3! ");
		}
		teclado.close();
	}

}
