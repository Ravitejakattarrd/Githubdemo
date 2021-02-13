
public class Testcase1 {

	public static void main(String[] args) {

		String string = "The best of both worlds";
		int count = 0;

		// To count each char except space

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ')
				count++;
		}
System.out.println(count);
	}

	}


