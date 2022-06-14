
public class ContinueExample {

	public static void main(String[] args) {
		int first = 5, second = 20;

		do {

		if (first++ > --second) { 

		Continue ; } //14>11, 15>10

		} while (first < 15);

		System.out.println("first = " + first + " and second = " + second);

	}

}
