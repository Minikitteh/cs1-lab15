public class VideoGames {
	public String name;
	public int hoursPlayed;
	public String characterType;

	public VideoGames(){
	}
	
	public VideoGames(String n, int h, String c) {
		name = n;
		hoursPlayed = h;
		characterType = c;
	}
	
	public VideoGames (String n){
		name = n; 
	}
	public String getName(){
		return name;
	}
	public int getHoursPlayed(){
		return hoursPlayed;
	}
	public String getcharacterType(){
		return characterType;
	}
	
	
	public void setName(String n){
		name = n;
	}
	public void setHoursPlayed(int h){
		hoursPlayed = h;
	}
	public void setCharacterType(String c){
		characterType = c;
	}
	public void print(){
		System.out.println("name: " + name);
		System.out.println("hoursPlayed: " + hoursPlayed);
		System.out.println("characterType: " + characterType);
	}	
}

