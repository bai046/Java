package LinkedList;
//基础类，数据
public class Student {
	private int id;
	private String name;
	private char gender;
	private int age;
	private String nativeplace;
	private Object Student;
	
	public Student() {
		
	}
	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNativeplace() {
		return nativeplace;
	}
	public void setNativeplace(String nativeplace) {
		this.nativeplace = nativeplace;
	}
	
	//重载返回输出格式内容，不写输出地址
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}

