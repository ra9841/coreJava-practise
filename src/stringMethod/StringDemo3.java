package stringMethod;

public class StringDemo3 {

	public static void main(String[] args) {
		String name = "Rabin";
		String[] text = name.split("");

		for (String str : text) {
			System.out.println(str);
		}

	}

}
