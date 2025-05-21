class Student{
	private String name;
	private int rollNo;
	private String course;
	
	//constructor
	Student(String name,int rollNo,String course){
		this.name=name;
		this .rollNo=rollNo;
		this.course=course;
	}
	
	//Getters and Setters
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getRollNo(){
		return rollNo;
	}
	public void setRollNo(int rollNo){
		this.rollNo=rollNo;
	}
	public String getCourse(){
		return course;
	}
	public void setCourse(String course){
		this.course=course;
	}
	
	public void display(){
		System.out.println("Student Details");
		System.out.println("Name:"+name);
		System.out.println("Roll No:2025/ICT/"+rollNo);
		System.out.println("Course:"+course);
	}
	
}