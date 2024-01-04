package oops;

class Course{
	public int cid;
	public String cname;
	public String duration;
	public Course(int cid, String cname, String duration) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.duration = duration;
	}
	
}
class Student{
	public int sid;
	public String sname;
	public Course course;
	public Student(int sid, String sname, Course course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.course = course;
	}
	
}

public class AssociationDemo {

	public static void main(String[] args) {
		Course c1 = new Course(100, "Java", "120 Hours");
		Student s1 = new Student(1, "Vinay", c1);
		System.out.println("Student Id: "+s1.sid);
		System.out.println("Student Name: "+s1.sname);
		System.out.println("Course Name: "+s1.course.cname);
		System.out.println("Course duration: "+s1.course.duration);

	}

}
