package projetoSeparaCaracteres;

import java.util.Scanner;

public class Separador {

	public static void main(String[] args) {
		String txt = input();
		String num = separadorNum(txt);
		String letras = separadorLetra(txt, num);
		print("As letras e símbolos do texto são: " + letras);
		print("Os números do texto são: " + num);
	}
	
	public static String input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um texto para ser tratado: ");
		String txt = sc.nextLine();
		System.out.println();
		return txt;
	}
	
	public static String separadorLetra(String txt, String num) {
		for (int i = 0; i < num.length(); i++) {
			for (int j = 0; j < txt.length(); j++) {
				if(txt.charAt(j) == num.charAt(i)) {
					txt = txt.replaceAll(String.valueOf(num.charAt(i)), "");
				}
			}
		}
		return txt;
	}

	public static String separadorNum(String txt) {
		String num = "";
		for (int i = 0; i < txt.length(); i++) {
			if(Character.isDigit(txt.charAt(i))) {
				num += txt.charAt(i);
			}
		}
		return num;
	}
	
	public static void print(String txt) {
		System.out.println(txt);
	}

}
