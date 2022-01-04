public class Teste {

	public static void main(String[]args) {
		
		System.out.println("Somar dois números"); //Título
			
		Scanner in = new Scanner(System.in); //Abrir caminho
			
		System.out.println("Escreva o primeiro número: "); //Pedido
		int primeiroNumero = in.nextInt(); //Como vou ler/guardar
		
		System.out.println("Escreva o segundo número: ");
		int segundoNumero = in.nextInt();
		
		int resultado = soma(primeiroNumero, segundoNumero);
		
		
		System.out.println("A soma é: " + resultado);
		
		in.close();
		
		int carlota=0;
		
		
		public static int soma(int aPrimeiroNumer, int aSegundoNumero) {

			int resultado = aPrimeiroNumero + aSegundoNumero;

			}
			;

			return resultado;
		
	}
		
}

