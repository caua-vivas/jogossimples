package jogos;

public class JogoDaForcaInt {

	public static void main(String[] args) {
		visual1();
		visual2();
		visual3();
		visual4();
		visual5();
		visual6();
		visual7();
	}
	
	public static void visual1() {
		print("_____"
			+ "\n|   |"
			+ "\n|"
			+ "\n|");
	}
	
	public static void visual2() {
		print("_____"
			+ "\n|   |"
			+ "\n|   O"
			+ "\n|");
	}
	
	public static void visual3() {
		print("_____"
			+ "\n|   |"
			+ "\n|   O"
			+ "\n|   |"
			+ "\n|    "
			+ "\n|");
	}
	
	public static void visual4() {
		print("_____"
			+ "\n|   |"
			+ "\n|   O"
			+ "\n|   |"
			+ "\n|    \\"
			+ "\n|");
	}
	
	public static void visual5() {
		print("_____"
			+ "\n|   |"
			+ "\n|   O"
			+ "\n|   |"
			+ "\n|  / \\"
			+ "\n|");
	}
	
	public static void visual6() {
		print("_____"
			+ "\n|   |"
			+ "\n|   O"
			+ "\n|  /|"
			+ "\n|  / \\"
			+ "\n|");
	}
	
	public static void visual7() {
		print("_____"
			+ "\n|   |"
			+ "\n|   O"
			+ "\n|  /|\\"
			+ "\n|  / \\"
			+ "\n|");
	}
	
	public static void print(String str) {
		System.out.println(str);
	}

}