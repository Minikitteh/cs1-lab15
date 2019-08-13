public class StudentRecord {

	private String name;
	private double gpa;
	private int utepID;
	private String major;
	private String address;

	
	public StudentRecord() {
		
	}
	
	public StudentRecord(String n,int id, String m){
		name = n;
		utepID = id;
		major = m;
	}
	public StudentRecord(String n, double gpa){
		name = n;
		this.gpa = gpa; 
	}
	
	
	public String getName(){
		return name;
	}
	public double getGpa(){
		return gpa;
	}
	public int getUtepID(){
		return utepID;
	}
	public String getMajor(){
		return major;
	}
	public String getAddress(){
		return address;
	}
	
	
	public void setName(String n){
		name = n;
	}
	public void setGpa(int gp){
		gpa = gp;
	}
	public void setUtepID(int id){
		utepID = id;
	}
	public void setMajor(String m){
		major = m;
	}
	public void setAddress(String a){
		address = a;
	}	
	
	
	public void print(){
		System.out.println("Student name: " + name);
		System.out.println("Student GPA: " + gpa);
		System.out.println("Student ID: " + utepID);
		System.out.println("Student major: " + major);
		System.out.println("Student address: " + address);
	}
}