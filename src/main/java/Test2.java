import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.DoubleStream;

/**
 * Created by hhndez on 30/03/16.
 */
public class Test2 {

	public static void main(String ...args) {

/*		final Collection<? extends Number> foo = new ArrayList<Number>();

		foo.add(new Integer(4));
		foo.add(new Object());
		foo.add(null);
		foo = null;
*/
		double[] list = new double[]{1,2,2,3};

		double x = DoubleStream.of(list).sum();
		System.out.println("double:" + x);

	}
}
