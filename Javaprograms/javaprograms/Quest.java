package javaprograms;

public class Quest {

	public static void main(String[] args) {
		String word = "QUEST";
		for (int i = 0; i <= word.length(); i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(word.charAt(j) + " ");
			}
			System.out.println(" ");

		}

	}

}
