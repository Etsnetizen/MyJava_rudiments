interface People
{
	public static final int YEAR = 2019;
	public abstract int GetOld();
}
interface HeighSchoolStudent extends People
{
	public abstract int GetStuId();
}
interface HeighSchoolOfficer extends HeighSchoolStudent,People
{
	public abstract void GetStuCourse();
}
class Student implements HeighSchoolStudent
{
	public final int SCHOOL_YEAR = 19;
	protected int Stu_Birthday;
	protected int Stu_Course;
	protected int Stu_id;
	public Student(int id,int birthday,int course){
		this.Stu_Birthday = birthday;
		this.Stu_Course = course;
		this.Stu_id = id;
	}
	public int GetStuId(){
		return this.Stu_id;
	}
	public int GetOld(){
		return	People.YEAR - this.Stu_Birthday;
	} 
}
public class Practice27
{
	public static void main(String[] argv){
		Student s1 = new Student(1800502108,1999,87);
		System.out.println(s1.GetStuId());
		System.out.println(s1.GetOld());
		System.out.println(People.YEAR);
		//因为接口里面全部都是public static final，所以可以直接用接口名来访问其常量

	}
}