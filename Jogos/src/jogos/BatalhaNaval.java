package jogos;
import java.util.Scanner;
public class BatalhaNaval {
	public static void main(String[] args) {
		char[][] inter = createInter();
		boolean[][] posFilled = createPosFilledArr();
		int line = 0, column = 0;
		int oldLine = 10, oldColumn = 10;

		printInter(inter);

		print("");
		print("A posição do porta-aviões (5 espaços) deve ser escolhida baseada nas linhas e colunas respectivamente");
		for (int i = 0; i < 5; i++) {
			do{
				print("Escolha um espaço:");
				line = setLinePortaAvioes(inter);
				while(line < 0 || line > 9) {
					print("Escolha uma linha de 0 a 9 apenas");
					line = checkLineValidity();
				}
				column = setColumnPortaAvioes(inter);
				while(column < 0 || column > 9) {
					print("Escolha uma coluna de 0 a 9 apenas");
					column = checkColumnValidity();
				}
				if(posFilled[line][column] == true){
					print("Posição já ocupada, escolha novamente");
				}
				oldLine = line;
				oldColumn = column;
			}while(posFilled[line][column] == true);
			posFilled = posFiller(posFilled, line, column);
		}
	}

	public static int setLinePortaAvioes(char[][] inter) {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		return line;
	}	

	public static int setColumnPortaAvioes(char[][] inter) {
		Scanner sc = new Scanner(System.in);
		int column = sc.nextInt();
		return column;
	}	

	public static int checkLineValidity() {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		return line;
	}

	public static int checkColumnValidity() {
		Scanner sc = new Scanner(System.in);
		int column = sc.nextInt();
		return column;
	}

	public static boolean[][] posFiller(boolean[][] posFilled, int line, int column){
		posFilled[line][column] = true;
		return posFilled;
	}

	public static boolean[][] createPosFilledArr() {
		boolean[][] posFilled = new boolean[10][10];
		for (int i = 0; i < posFilled.length; i++) {
			for (int j = 0; j < posFilled[i].length; j++) {
				posFilled[i][j] = false;
			}
		}
		return posFilled;
	}

	public static char[][] createInter() {
		char[][] inter = new char[10][10];
		for (int i = 0; i < inter.length; i++) {
			for (int j = 0; j < inter[i].length; j++) {
				inter[i][j] = ' ';
			}
		}
		return inter;
	}

	public static void printInter(char[][] arr) {
		System.out.println("     0   1   2   3   4   5   6   7   8   9");
		System.out.println("   -----------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(j == 0 && i == 0){
					System.out.print("0  ");
				}
				else if((j == 0 && i == 1) || (j == 0 && i == 2) || (j == 0 && i == 3) || (j == 0 && i == 4) || (j == 0 && i == 5) || 
						(j == 0 && i == 6) || (j == 0 && i == 7) || (j == 0 && i == 8) || (j == 0 && i == 9)) {
					System.out.println();
					System.out.println("   -----------------------------------------");
					switch (i) {
					case 1:
						System.out.print("1  ");
						break;

					case 2:
						System.out.print("2  ");
						break;

					case 3:
						System.out.print("3  ");
						break;

					case 4:
						System.out.print("4  ");
						break;

					case 5:
						System.out.print("5  ");
						break;

					case 6:
						System.out.print("6  ");
						break;

					case 7:
						System.out.print("7  ");
						break;

					case 8:
						System.out.print("8  ");
						break;

					case 9:
						System.out.print("9  ");
						break;
					}
				}
				System.out.print("|" + " " + arr[i][j] + " ");
			}
			System.out.print("|");
		}
		System.out.println();
		System.out.println("   -----------------------------------------");
	}

	public static void print(String str) {
		System.out.println(str);
	}
}