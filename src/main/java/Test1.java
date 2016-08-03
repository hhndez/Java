import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by hhndez on 29/07/15.
 */
public class Test1 {
	public static void main(String args[]) {
		System.out.println("Test");

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

		System.out.println(values.stream()
				.map(value -> value * 2)
				.reduce(0, (a, b) -> a + b));

		System.out.println(values.stream()
				.map(value -> value * 2)
				.reduce(0, Integer::sum));

		System.out.println(totalValues(values, number -> number % 2 == 0 ));


		String test = "hola,abc,tds";
		String vales[] = test.split(",");
		for (String value : vales) System.out.println("value:" + value + ".");



	}

	public static int totalValues(List<Integer> numbers, Predicate<Integer> selector) {
		return numbers.stream().filter(selector).findAny().get();
	}
}
