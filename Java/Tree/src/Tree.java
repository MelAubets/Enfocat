import java.util.Scanner;

public class Tree {
	
	//public static int max_size = 22;
	//public static int trunk_size = 4;
	

	public static void main(String[] args) {
		
		Scanner tree_things = new Scanner(System.in);

		int max_size = scantree(tree_things);
		int trunk_size = scantrunk(tree_things, max_size);
		
		tree_things.close();

		for(int i = 0; i < max_size; i = i+2) {
			int j = (max_size-i)/2;
			System.out.println("\033[38;2;50;250;50m"+tree(j-1, i)+"\033[0m");
		}
		
		for(int i = 0; i<trunk_size; i++) {
			System.out.println("\033[38;2;128;64;0m"+" ".repeat(((max_size-2)/2)-(trunk_size/2))+"#".repeat(trunk_size)+"\033[0m");
		}

	}
	
	public static String tree(int j, int i) {
		return " ".repeat(j)+"#".repeat(i);
	}
	
	public static int scantree(Scanner tree_size) {
		System.out.println("Introduce un numero par para el tamaño del àrbol:");
		int size_tree = tree_size.nextInt();
		if(size_tree % 2 == 0) {
			return size_tree;
		}else {
			System.out.println("Numero incorrecto!");
			scantree(tree_size);
		}
		return 0;
	}
	
	public static int scantrunk(Scanner trunk_size, int size_tree) {
		System.out.println("Introduce un numero par para el tamaño del tronco:");
		int size_trunk = trunk_size.nextInt();
		if(size_trunk % 2 == 0 && size_trunk < size_tree) {
			return size_trunk;
		}else {
			System.out.println("Numero incorrecto!");
			scantrunk(trunk_size, size_tree);
		}
		return 0;
	}

}
