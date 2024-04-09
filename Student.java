package que_7;

public class Student {
	
	private String prn;
	private String name;
	
	public String getPrn() {
		return prn;
	}
	public void setPrn(String prn) {
		this.prn = prn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(String prn, String name) {
		super();
		this.prn = prn;
		this.name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [prn=" + prn + ", name=" + name + "]";
	}
	
}
