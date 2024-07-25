package contructorforEaxample;

public class Student {

		private String name;
		public Student()
		{
			this.name = "Unkonwn";
		}
		
		
		public Student(String name) {
			super();
			this.name = name;
		}
		
		
		@Override
		public String toString() {
			return "Student [name=" + name + "]";
		}


		public static void main(String args[])
		{
			Student s = new Student();
			Student s1 = new Student("Daksh");
			System.out.println(s);
			System.out.println(s1);
		}
}
