import java.util.Scanner;

public class Concatenacao {

	public static void main(String[] args) {
	
				String alunos[]= {"Matheus","Eduardo","Diego","Livia","Aline","Jessica"};
				int nota1[] = {5,2,5,10,8,9};
				int nota2[] = {10,3,8,10,7,6};
				float media;
		
				int analise=0;
				while(analise>1);				
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
							}else if(media==5){
								    conceito="Recuperacao";
							}else
								    conceito="Aprovação";
														
							System.out.println(alunos[ra]+ " N1 -"+nota1[ra]+" N2 -"+nota2[ra]+" Média: "+media+" "+conceito);
							analise++;
							break;
						case 2:
							for(int contador=0; contador<alunos.length;contador++) {
								media=(nota1[contador]+nota2[contador])/2;
								String conceito1;
								if(media<=4) {
									conceito1="Reprovado";
								}else if(media==5){
									    conceito1="Recuperacao";
								}else
									    conceito1="Aprovação";
								System.out.println(alunos[contador]+ " N1 -"+nota1[contador]+" N2 -"+nota2[contador]+" Média: "+media+" "+conceito1);
							analise++;
							}
							break;
						case 3:
		                    System.out.println("Fim do sistema...");
		                    analise++;
							break;
							default:
							System.out.println("Opção Inválida execute Novamente");
							analise=0;
							break;
						}
						
	}
}
						
						
						
						
						