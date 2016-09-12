package day03;

public class Emp {
	private String name;
	private int age;
	private String sex;
	private int salary;
	public Emp(String name, int age, String sex, int salary) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.salary = salary;
	}
	public String toString(){
		return "("+name+","+age+","+sex+","+salary+")";
	}
	public void setName(String string) {
	}
}
