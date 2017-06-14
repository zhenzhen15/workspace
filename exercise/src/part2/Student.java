package part2;

public class Student extends Person{
	public String school;
	public Student (){
		
	}

	public Student(String name,int age,String school) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.school = school;
	}
	public String talk(){
		
		return super.talk()+",我在"+this.school+"上学";
		
	}
	

}
