package codingAssignments;

public class Week3Assignment {

	public static void main(String[] args) {
		
		int[] ages = new int[8];
		
		ages[0] = 3; 
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		
		int len = (ages.length - 1);
		
		System.out.println(ages[len] - ages[0]);
		int sum = 0;
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}			
		System.out.println(sum / ages.length);
		
		
		
		}
	
	}


