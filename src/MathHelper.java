import java.util.Arrays;
import java.util.Scanner;

public class MathHelper {
	public int numeroSeguinte(int numero){
		return numero + 1;
	}
	public String juntarNome(String nome, String apelido){
		// return nome.concat(apelido);
		return nome + " " + apelido;
	}
	public int maior(int[] numeros){
		Arrays.sort(numeros);
		return numeros[numeros.length - 1];
	}
	
	public int soma(int[] numeros, Scanner input){
		int somaTotal = 0;
		for (int num : numeros){
			somaTotal += num;
		}
		return somaTotal;
	}
	
	public double media(double[] numerosV){
		double somaTotal = 0;
		for (double num : numerosV){
			somaTotal += num;
		}
		return somaTotal / numerosV.length;
	}
	
}
