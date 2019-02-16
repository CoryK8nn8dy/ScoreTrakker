// Tanner Coggins
// Cory Kennedy


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ScoreTrakker {
	
	private String[] files = {"scores.txt", "badscore.txt", "nofile.txt"};
	
	public ScoreTrakker(List students) {
		super();
		this.students = students;
	}
	
	private static List students = new ArrayList(10);
	
	public void loadDataFromFile(String fileName) throws FileNotFoundException   {
		

		FileReader reader = new FileReader(fileName);

		
		
		
		Scanner in = new Scanner(reader);
		
		while(in.hasNextLine()) {
			// Bring in two lines of the txt file
			String name = in.nextLine();
			String score = in.nextLine();
			int result = 0;
			// Convert score to an integer
			try {
				result = Integer.parseInt(score);
			} catch (NumberFormatException e) {
				System.out.println("Incorrect format for " + name + " not a valid score: " + score);
			}
			
			// TODO Add some error handling
			
			// Declare student object and place into the Arraylist
			Student student = new Student(name, result);
			students.add(student);		
		}
		
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public void printInOrder() {

		Collections.sort(students);
		for(Object stud : students) {

			System.out.println(stud);
		}
		System.out.println("\n");
	}
	

	public void processFiles() {

		for (String file: files) {
			
			try {
				
				loadDataFromFile(file);
				printInOrder();
				
			} catch(FileNotFoundException e2) {
				System.out.println("Can't open file: " + file);
			}
			
		}

		
	}
	
	public static void main(String [] args)  {

		ScoreTrakker tracker = new ScoreTrakker(students);
		tracker.processFiles();
		Collections.sort(students);
		
		
	}
	
}


