package assignmentss10;
interface Functionable
{
	void func();
}
interface Functionable1
{
	String func();
}
class Student {
	static int id;
	String name;
	public Student() {
         this.id=1;
         this.name="Hardik";
	}
	public static void getId() {
		System.out.println(id);
	}
		public String getName() {
		return name;
	}
}
class MethodReference{
	public static void main(String[] args) {
		Student s=new Student();
		//constructor calling
		Functionable f=Student::new;
		//instance method calling using reference
		Functionable1 f1=s::getName;
		System.out.println(f1.func());
		//static method calling
		Functionable f2=Student::getId;
		f2.func();
	}
}
