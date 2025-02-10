import java.util.Scanner;

public class Main {
	
	public static int enunciado(Scanner input){
		System.out.println("Bem vindo ao MathHelper!");
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Próximo número");
		System.out.println("2 - Juntar nome e apelido");
		System.out.println("3 - Maior número");
		System.out.println("4 - Soma dos números");
		System.out.println("5 - Média dos números");
		System.out.println("0 - Sair do MathHelper");
		System.out.print("Introduza a sua opção: ");
		int opcao = input.nextInt();
		return opcao;
	}
	
	public static int[] pedirNumeros(Scanner input, int quantidade){
		int[] numeros = new int[quantidade];
		System.out.println("Insira os" + quantidade + " números: ");
		for (int i = 0; i < quantidade; i++) {
			numeros[i] = input.nextInt();
		}
		return numeros;
	}
	
	public static double[] pedirNumerosDouble(Scanner input, int quantidadeSoma){
		double[] numerosV = new double[quantidadeSoma];
		System.out.println("Insira os" + quantidadeSoma + " números: ");
		for (int i = 0; i < quantidadeSoma; i++) {
			numerosV[i] = input.nextInt();
		}
		return numerosV;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MathHelper math = new MathHelper();
		int opcao;
		
		do {
			opcao = enunciado(input);
			input.nextLine(); // Tive de adicionar pois estava a dar erro porque pulava o pedido do nome
			switch (opcao) {
				case 0:
					System.out.println("Obrigado por utilizar o MathHelper");
					System.out.println("Saindo...");
					break;
				case 1:
					System.out.println("Insira o número: ");
					int numero = input.nextInt();
					System.out.println("O número que vem depois do " + numero + " é o " + math.numeroSeguinte(numero));
					break;
				case 2:
					System.out.println("Insira o seu nome: ");
					String nome = input.nextLine();
					System.out.println("Insira o seu apelido: ");
					String apelido = input.nextLine();
					System.out.println("O teu nome inteiro é " + math.juntarNome(nome, apelido));
					break;
				case 3:
					System.out.println("Quantos números deseja inserir: ");
					int quantidade = input.nextInt();
					int[] numeros = pedirNumeros(input, quantidade);
					System.out.println("O maior número é o " + math.maior(numeros));
					break;
				case 4:
					System.out.println("Quantos números deseja inserir: ");
					int quantidadeSoma = input.nextInt();
					numeros = pedirNumeros(input, quantidadeSoma);
					System.out.println("A soma total dos números é " + math.soma(numeros));
					break;
				case 5:
					System.out.println("Quantos números deseja inserir: ");
					int quantidadeMedia = input.nextInt();
					double[] numerosV = pedirNumerosDouble(input, quantidadeMedia);
					System.out.println("A média dos números inseridos foi: " + math.media(numerosV));
					break;
				default:
					System.out.println("Erro, insira uma opção válida!");
					break;
			}
		} while (opcao != 0);
		input.close();
	}
}