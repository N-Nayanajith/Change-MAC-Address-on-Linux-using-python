import java.util.*;

class Course{
	private String courseName;
	private int credits;
	private String inCharge;
	private int totalHourse;
	
	Course(){
		
	}
	
	Course(String courseName,int credits,String inCharge,int totalHourse){
		this.courseName=courseName;
		this.credits=credits;
		this.inCharge=inCharge;
		this.totalHourse=totalHourse;
	}
	
	boolean checkCourse(String courseName){
		if(courseName=="OOP Concepts" || courseName=="Database Design"){
			return true;
		}
		else{
			return false;
		}
	}
	
	void checkDurtation(){
		if(totalHourse>15){
			System.out.println("The duration exceeds the limit.");
		}
		else{
			System.out.println("Duration is limited.");
		}
	}
	
	void printCourseDetails(){
		System.out.println("Course Name: "+courseName);
		System.out.println("Credits: "+credits);
		System.out.println("In-Charge: "+inCharge);
		System.out.println("Total Hours: "+totalHourse);
	}
	
	double calculateCourseGPA(double gpa){
		double courseGPA;
		courseGPA=credits*gpa;
		return courseGPA;
	}
}

class NonCredit extends Course{
	private int minMarks;
	
	public int getMinMarks(){
		return minMarks;
	}
	
	public void setMinMarks(int minMarks){
		this.minMarks=minMarks;
	}
	
	public double calculateCourseGPA(){
		System.out.println("Non credit Subject");
		return 0;
	}
}

class Student{
	private String name;
	private char gender;
	private String regNum;
	private int academicYear;
	
	Student(String name,char gender,String regNum,int acYear){
		this.name=name;
		this.gender=gender;
		this.regNum=regNum;
		this.academicYear=acYear;
	}
	
	Student(){
		
	}
	
	public Student(int academicYear){
		this.academicYear=academicYear;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public String getGender(){
		if(gender=='M'){
			return "Male";
		}
		else{
			return "Female";
		}
	}
	public void setGender(char gender){
		this.gender=gender;
	}
	
	public String getRegNum(){
		return regNum;
	}
	public void setRegNum(String regNum){
		this.regNum=regNum;
	}
	
	public int getAcademicYear(){
		return academicYear;
	}
}

class Academy{
	public static void main(String arg[]){
		Scanner sc1=new Scanner(System.in);
		
		Student st01=new Student(2017);
		st01.setName("Jhon");
		st01.setGender('M');
		st01.setRegNum("2017/ICT/009");
		
		System.out.println("-------------The Techzie Academy------------");
		System.out.println("Name: "+st01.getName());
		System.out.println("Gender: "+st01.getGender());
		System.out.println("Registration Number: "+st01.getRegNum());
				
		
		System.out.println("Academic Year: "+st01.getAcademicYear());
		System.out.println("---------------------------------------------");
		
		Course crs1=new Course("OOP Concepts",2,"Mrs.A.Harish",30);
		Course crs2=new Course("Database Design",2,"Mrs.A.D.Bandara",15);
		
		System.out.println("Enter the course you want to find: ");
		String crsName=sc1.nextLine();
		
		if(crs1.checkCourse(crsName)){
			System.out.println("The Course is Available.");
		}
		else{
			System.out.println("The course is unavailable.");
		}
		System.out.println("---------------------------------------------");
		System.out.println("*****");
		
		crs1.printCourseDetails();
		System.out.println("*****");
		
		crs2.checkDurtation();
		System.out.println("---------------------------------------------");

		
		NonCredit nc01=new NonCredit();
		nc01.setMinMarks(30);
		nc01.calculateCourseGPA();

	}
}