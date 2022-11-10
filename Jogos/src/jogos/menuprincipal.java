package jogos;
import java.util.Scanner;
public class menuprincipal {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		print("Seja bem vindo! Digite o n�mero equivalente para selecionar um dos jogos para jogar!\n1) Jogo da Forca\n2) Jogo da Velha\n3) Batalha Naval");
		int jogo = ent.nextInt();
		if (jogo==1||jogo==2||jogo==3) {
			switch (jogo) {
			case 1:
				print("Jogo escolhido: Jogo da Forca.");
				JogoDaForcaFunc.main(args);
				print("Jogar novamente? (Responda com 'sim' ou 'n�o')");
				String resposta = ent.next();
				if (resposta.equalsIgnoreCase("Sim")||resposta.equalsIgnoreCase("N�o")||resposta.equalsIgnoreCase("S")||resposta.equalsIgnoreCase("N")||resposta.equalsIgnoreCase("Nao")) {
					if (resposta.equalsIgnoreCase("Sim")||resposta.equalsIgnoreCase("S")) {
						menuprincipal.main(args);
					} else {
						print("Obrigado por jogar!");
					}
				} else { 
					do {
						print("Resposta inserida de forma incorreta, responda com sim ou n�o.");
						resposta = ent.next();
					} while (!resposta.equalsIgnoreCase("Sim")||!resposta.equalsIgnoreCase("N�o")||!resposta.equalsIgnoreCase("S")||!resposta.equalsIgnoreCase("N")||!resposta.equalsIgnoreCase("Nao"));
				} break;
			case 2:
				print("Jogo escolhido: Jogo da Velha.");
				JogoDaVelha.main(args);
				print("Jogar novamente? (Responda com 'sim' ou 'n�o')");
				resposta = ent.next();
				if (resposta.equalsIgnoreCase("Sim")||resposta.equalsIgnoreCase("N�o")||resposta.equalsIgnoreCase("S")||resposta.equalsIgnoreCase("N")||resposta.equalsIgnoreCase("Nao")) {
					if (resposta.equalsIgnoreCase("Sim")||resposta.equalsIgnoreCase("S")) {
						menuprincipal.main(args);
					} else {
						print("Obrigado por jogar!");
					}
				} else { 
					do {
						print("Resposta inserida de forma incorreta, responda com sim ou n�o.");
						resposta = ent.next();
					} while (!resposta.equalsIgnoreCase("Sim")||!resposta.equalsIgnoreCase("N�o")||!resposta.equalsIgnoreCase("S")||!resposta.equalsIgnoreCase("N")||!resposta.equalsIgnoreCase("Nao"));
				} break;
			case 3:
				print("Jogo escolhido: Batalha Naval.");
				BatalhaNaval.main(args);
				print("Jogar novamente? (Responda com 'sim' ou 'n�o')");
				resposta = ent.next();
				if (resposta.equalsIgnoreCase("Sim")||resposta.equalsIgnoreCase("N�o")||resposta.equalsIgnoreCase("S")||resposta.equalsIgnoreCase("N")||resposta.equalsIgnoreCase("Nao")) {
					if (resposta.equalsIgnoreCase("Sim")||resposta.equalsIgnoreCase("S")) {
						menuprincipal.main(args);
					} else {
						print("Obrigado por jogar!");
					}
				} else { 
					do {
						print("Resposta inserida de forma incorreta, responda com sim ou n�o.");
						resposta = ent.next();
					} while (!resposta.equalsIgnoreCase("Sim")||!resposta.equalsIgnoreCase("N�o")||!resposta.equalsIgnoreCase("S")||!resposta.equalsIgnoreCase("N")||!resposta.equalsIgnoreCase("Nao"));
				} break;
			}
		} else {
			do {
				print("N�mero inserido de forma incorreta, insira um n�mero de 1 a 3 para sele��o do jogo.");
				jogo = ent.nextInt();
			} while (jogo!=1||jogo!=2||jogo!=3);
		}
	} public static void print(String txt) {
		System.out.println(txt);
	}
}
