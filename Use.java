public class Use{
	public static void main (String args []){
		BankAccount A = new BankAccount("Ed", 23.7, 50.4);
		BankAccount B = new BankAccount("Bianca", 100.3, 500.8);
		BankAccount C = new BankAccount("Bob", 28.9, 67.0);
		BankAccount D = new BankAccount("Paul", 36.8, 88.3);
		BankAccount E = new BankAccount("James", 64.6, 99.0);
		E.print();
		
		BankAccount[] arr = {A,B,C,D,E};
		BAccountSort(arr);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i].getName());
		}
		
		System.out.println(" ");
		
		Houses w = new Houses("Ed", 500, 5);
		Houses x = new Houses("Bianca", 20, 2);
		Houses y = new Houses("Bob", 258, 4);
		Houses z = new Houses("Paul", 10, 1);
		
		w.print();
		
		System.out.println(" ");
		
		Houses[] array = {w,x,y,z};
		HouseSort(array);
		for(int i=0; i<array.length; i++){
			System.out.println(array[i].getHomeOwner());
		}
		
		System.out.println(" ");
		
		VideoGames h1 = new VideoGames("Ed", 112, "elf" );
		VideoGames h2 = new VideoGames("Bianca", 302, "human");
		VideoGames h3 = new VideoGames("Bob", 1000, "human");
		VideoGames h4 = new VideoGames("Paul", 332, "gorilla");
		
		h2.print();
		
		System.out.println(" ");
		
		VideoGames[] array3 = {h1,h2,h3,h4};
		VideoGamesSort(array3);
		for(int i=0; i<array3.length; i++){
			System.out.println(array3[i].getName());
		}
		
		System.out.println(" ");
	
	
		StudentRecord s1 = new StudentRecord("Ed", 1.02 );
		StudentRecord s2 = new StudentRecord("Bianca", 3.8);
		StudentRecord s3 = new StudentRecord("Bob", 0.0);
		StudentRecord s4 = new StudentRecord("Paul", 3.5);
		
		s3.print();
		
		System.out.println(" ");
		
		StudentRecord[] array2 = {s1,s2,s3,s4};
		 studentRecordsSort(array2);
		for(int i=0; i<array2.length; i++){
			System.out.println(array2[i].getName());
		}
		
		System.out.println(" ");
	}
	
	
	
	
	
	
	public static BankAccount[] BAccountSort(BankAccount[]arr){
		for(int j=0; j<arr.length; j++){
			for (int i = 0; i < arr.length-1; i++){
				BankAccount t = arr[i];
				if(arr[i].getChecking()>arr[i+1].getChecking()){
					arr[i] = arr[i+1];
					arr[i+1] = t;
				}
			} 	
		}
		return arr;
	}
	
		public static Houses[] HouseSort(Houses[]arr){
			for(int j = 0; j < arr.length; j++)
			for(int i=0; i<arr.length-1; i++){
				Houses t = arr[i];
				if(arr[i].getRooms()>arr[i+1].getRooms()){
					arr[i] = arr[i+1];
					arr[i+1] = t;
					
				} 	
			}
		return arr;
	}
	
	public static VideoGames[] VideoGamesSort(VideoGames[]arr1){
		for(int j=0; j<arr1.length; j++){
			for (int i = 0; i < arr1.length-1; i++){
				VideoGames t = arr1[i];
				if(arr1[i].getHoursPlayed()>arr1[i+1].getHoursPlayed()){
					arr1[i] = arr1[i+1];
					arr1[i+1] = t;
				}
			} 	
		}
		return arr1;
	}
	
	public static StudentRecord[] studentRecordsSort(StudentRecord[]arr){
		for(int j=0; j<arr.length; j++){
			for (int i = 0; i < arr.length-1; i++){
				StudentRecord t = arr[i];
				if(arr[i].getGpa()>arr[i+1].getGpa()){
					arr[i] = arr[i+1];
					arr[i+1] = t;
				}
			} 	
		}
		return arr;
	}

	
	
	
	
	}





