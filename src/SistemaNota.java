import java.util.Scanner;

public class SistemaNota {

	public static void main(String[] args) {
		
				String alunos[]= {"Givanildo","Tarciano","Adroaldo"};
				int nota1[] = {1,2,5};
				int nota2[] = {1,3,5};
				float media;
		
				System.out.println("========================");
				System.out.println("1 - Consulta Registro");
				System.out.println("2 - Consulta tudo");
				System.out.println("3 - Sair do Programa");
				System.out.println("========================");	
				System.out.println("Escolha a opção desejada:");
						Scanner teclado = new Scanner(System.in);
						int opcao;
						opcao=teclado.nextInt();
						switch(opcao) {
						case 1:
							
							System.out.println("Digite o RA do aluno a ser pesquisado: ");
							int ra;
							ra=teclado.nextInt();
							media=(nota1[ra]+nota2[ra])/2;
							String conceito;
							if(media<=4) {
								conceito="Reprovado";
								
							}else if(media==5) {
								conceito="Recuperação";
							}else
								conceito="Aprovado";
							
							System.out.println(alunos[ra]+ " N1 -"+nota1[ra]+" N2 -"+nota2[ra]+" Média: "+media+ " "+conceito);
							break;
						case 2:
							for(int contador=0; contador<alunos.length;contador++) {
								media=(nota1[contador]+nota2[contador])/2;
								if(media<=4) {
									conceito="Reprovado";
									
								}else if(media==5) {
									conceito="Recuperação";
								}else
									conceito="Aprovado";
								
								System.out.println(alunos[contador]+ " N1 -"+nota1[contador]+" N2 -"+nota2[contador]+" Média: "+media+ " "+conceito);							
							}
							break;
						case 3:
							System.out.println("Fim do sistema");
							break;
						default:
							System.out.println("Opção Inválida execute Novamente");
							break;
						}						

	}
	}