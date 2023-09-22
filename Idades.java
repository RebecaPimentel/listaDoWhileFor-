import java.util.Scanner;
public class Idades {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int usuario, nas, nAtual, maior=-1000, menor=1000, idade;
		
		System.out.println("Qual é o ano atual? ");
		nAtual = ler.nextInt();
		
		for (usuario=1;usuario<5;usuario++) {
			System.out.println("Escreva o seu ano de nascimento? ");
			nas = ler.nextInt();
			
			idade = nAtual-nas;
			
			if(idade>maior) {
				maior=idade;
			}else if(idade<menor){
				menor=idade;
			}
			
			System.out.println("Sua idade é "+idade);
			
		}
		System.out.println("A maior idade é "+maior);
		System.out.println("A menor idade é "+menor);
		
		ler.close();
	}
}
