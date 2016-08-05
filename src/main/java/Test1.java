import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static java.lang.System.out;

/**
 * Created by hhndez on 29/07/15.
 */
public class Test1 {
	public static void main(String args[]) {
		out.println("Test.1");
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

		System.out.println(values.stream()
				.map(value -> value * 2) //2,4,6,8,10
				.reduce(0, (a, b) -> a + b));

		out.println("Test.2");
		System.out.println(values.stream()
				.map(value -> value * 2) //2,4,6,8,10
				.reduce(0, Integer::sum));

		out.println("Test.3");
		System.out.println(totalValues(values, number -> number % 2 == 0 ));


		out.println("Test.4");
		String test = "hola,abc,tds";
		String vales[] = test.split(",");
		for (String value : vales) System.out.println("value:" + value + ".");
		Arrays.stream(vales).forEachOrdered(out::println);



	}

	public static int totalValues(List<Integer> numbers, Predicate<Integer> selector) {
		return numbers.stream().filter(selector).findAny().get();
	}
}
