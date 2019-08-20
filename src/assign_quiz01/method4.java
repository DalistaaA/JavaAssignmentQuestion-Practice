package assign_quiz01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class method4 {

	public static void main(String args[]) {

		String[] typesOfInsurance = { "Life Insurance", "Car Insurance", "Health Insurance" };
		System.out.println("array before reverse: " + Arrays.toString(typesOfInsurance));
		List<String> listOfProducts = Arrays.asList(typesOfInsurance);
		Collections.reverse(listOfProducts);
		String[] reversed = listOfProducts.toArray(typesOfInsurance);
		System.out.println("array after reverse: " + Arrays.toString(reversed));
	}
}
