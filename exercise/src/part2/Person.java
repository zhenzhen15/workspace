package part2;

public class Person {

	String name; 
	 int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}
	public String talk() {
		// TODO Auto-generated method stub
		return "我是："+name+",今年："+age+"岁";
	}
	
		
	

		
		



}
