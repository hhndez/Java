package predicateExample;

/**
 * Created by hhernandez on 24/06/15.
 */
public class Employee {
	public Employee(Integer id, Integer age, String gender, String fName, String lName) {
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.fName = fName;
		this.lName = lName;
	}

	private Integer id;

	private Integer age;

	private String gender;

	private String fName;

	private String lName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return this.id.toString() + " -" + this.age.toString();
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
}
