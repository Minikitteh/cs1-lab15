public class Houses{
	private String HomeOwner;
	private int SquareFeet;
	private int Rooms;
	
	public Houses(){
	}
	public Houses (String ho, int sf, int r){
		HomeOwner = ho;
		SquareFeet = sf;
		Rooms = r;
	}
	
	public Houses (String ho) {
		HomeOwner = ho;
	}
	public String getHomeOwner(){
		return HomeOwner;
	}
	public int getSquareFeet(){
		return SquareFeet;
	}
	public int getRooms(){
		return Rooms;
	}
	
	public void setHomeOwner(String ho){
		HomeOwner = ho;
	}
	public void setSquareFeet(int sf){
		SquareFeet = sf;
	}
	public void setRooms (int r){
		Rooms = r;
	}
	
	public void print(){
		System.out.println("homeOwner: " + HomeOwner);
		System.out.println("SquareFeet: " + SquareFeet);
		System.out.println("Rooms: " + Rooms);
		System.out.println(" ");
		
	}
	
}