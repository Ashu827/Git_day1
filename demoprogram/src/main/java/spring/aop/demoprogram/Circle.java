package spring.aop.demoprogram;

public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Circle [name=" + name + "]";
	}
	
}
