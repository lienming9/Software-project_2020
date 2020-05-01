import java.util.Random;

public class Exercise7 {
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		Exercise7 m = new Exercise7();

		System.out.println("First value: " + numbers[0]);
		System.out.println("Last value: " + numbers[9]);
		System.out.println();

		System.out.println("Reorganized array: ");
		System.out.println();
		numbers = m.reorganize(numbers);
		System.out.println();
		Index.main(null);
	}

	int[] reorganize(int[] numbers) {
			Random rnd = new Random();
		for (int i = numbers.length - 1; i >= 0; i--) {
			int index = rnd.nextInt(i + 1);
			int a = numbers[index];
			numbers[index] = numbers[i];
			numbers[i] = a;
			System.out.println(numbers[i]);
		}
		return numbers;
	}

}
