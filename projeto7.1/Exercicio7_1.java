import java.util.*;
public class Exercicio7_1 {

	public static void main(String[] args) {
		// 1 - variaveis
		String nomeCidades[] = new String[20];
		int distancias[] = new int[20];
		byte cont;
		byte x;
		String cidadeDestino;
		boolean encontrou;
		float precoPassagem;
		int tempoVoo;
		byte numEscalas;
		Scanner leia = new Scanner(System.in);
		
		// 2 - Entrada de dados
		
		for (cont = 0; cont <= 19; cont++) {
			do {
				System.out.print("Digite o nome da cidade " + (cont+1) + "(FIM p encerrar): ");
				nomeCidades[cont] = leia.nextLine();
				if (nomeCidades[cont].equals("")) {
					System.out.println("Eh obrigatorio a digitacao do nome da cidade");
				}
			}while(nomeCidades[cont].equals(""));
			
			if (nomeCidades[cont].equalsIgnoreCase("fim")) {
				break;
			}
			
			do {
				System.out.print("Digite a distancia em km ate Belo Horizonte: ");
				distancias[cont] = leia.nextInt();
				if (distancias[cont] < 500) {
					System.out.println("Distancia invalida, digite 500 km ou maior");
				}
			}while(distancias[cont] < 500);
			
			leia.nextLine();
		} // fim do for
		
		// pesquisas
		do {
			System.out.println("Pesquisa de passagens");
			System.out.println("Digite a cidade de destino (SAIR p/ finalizar): ");
			cidadeDestino = leia.nextLine();
			
			if (cidadeDestino.equalsIgnoreCase("sair")) {
				break;
			}
			
			encontrou = false;
			for (x = 0; x < cont; x++) {
				if (cidadeDestino.equalsIgnoreCase(nomeCidades[x])) {
					encontrou = true;
					break;
				}
			}
			if (encontrou) { // if (encontrou == true){
				precoPassagem = 0.25f * distancias[x];
				tempoVoo = (int) ((float)distancias[x] / 800 * 60);
				numEscalas = (byte) (tempoVoo / 180);
				System.out.println("Preco da passagem: " + precoPassagem);
				System.out.println("Tempo de voo em minutos: " + tempoVoo);
				System.out.println("Numero de escalas: " + numEscalas);
			} else {
				System.out.println("Nao ha voos para esta cidade");
			}
			
			
		}while( ! cidadeDestino.equalsIgnoreCase("sair") );
		
		
	}

}
