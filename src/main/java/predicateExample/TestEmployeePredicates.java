package predicateExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static predicateExample.EmployeePredicates.*;

/**
 * Created by hhernandez on 24/06/15.
 */
public class TestEmployeePredicates {
	public static void main(String args[]) {
		Employee e1 = new Employee(1, 23, "M", "Rick", "Beethovan");
		Employee e2 = new Employee(2, 13, "F", "Martina", "Hengis");
		Employee e3 = new Employee(3, 43, "M", "Ricky", "Martin");
		Employee e4 = new Employee(4, 26, "M", "Jon", "Lowman");
		Employee e5 = new Employee(5, 19, "F", "Cristine", "Maria");

		List<Employee> employees = new ArrayList<Employee>();
		employees.addAll(Arrays.asList(new Employee[]{e1, e2, e3, e4, e5}));

		System.out.println(filterEmployees(employees, isAdultMale()));
		System.out.println(filterEmployees(employees, isAdultFemale()));
		System.out.println(filterEmployees(employees, isAgeMoreThan(35)));
		System.out.println(filterEmployees(employees, isAgeMoreThan(35).negate()));
	}
}
