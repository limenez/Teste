import java.util.Scanner;

public class PlacaVeiculos {

	public static void main(String[] args) {
		String placa;
		String fim_placa;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma placa válida\n");
		placa = teclado.next();
		fim_placa = placa.substring(placa.length() - 1 , placa.length());
		System.out.println(fim_placa);
		if(fim_placa.equals("1") || fim_placa.equals("2")) {
			System.out.println("Segunda-feira");
		}
			else if(fim_placa.equals("3") || fim_placa.equals("4")) {
				System.out.println("Terça-feira");
			}
			else if(fim_placa.equals("5") || fim_placa.equals("6")) {
				System.out.println("Quarta-feira");
			}
			else if(fim_placa.equals("7") || fim_placa.equals("8")) {
			System.out.println("Quinta-feira");
			}
			else if(fim_placa.equals("9") || fim_placa.equals("0")) {
				System.out.println("Sexta-feira");
			}			
				System.out.println("==================================");
		}

}


