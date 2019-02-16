import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ScoreTrakker {
	
	
	
	public ScoreTrakker(List students) {
		super();
		this.students = students;
	}
	
	private static List students = new ArrayList(10);
	
	public void loadDataFromFile(String fileName) throws IOException {
		
		int i = 0;
		
		FileReader reader = new FileReader(fileName);
		
		Scanner in = new Scanner(reader);
		
		while(in.hasNextLine()) {
			// Bring in two lines of the txt file
			String name = in.nextLine();
			String score = in.nextLine();
			
			// Convert score to an integer
			int result = Integer.parseInt(score);
			// TODO Add some error handling
		
			// Declare student object and place into the Arraylist
			Student student = new Student(name, result);
			students.add(student);		
		}
		
		reader.close();
		
		
		
	}
	
	public void printInOrder() {

		Collections.sort(students);
		for(Object stud : students) {

			System.out.println(stud);
		}
		
	}
	

	public void processFiles() throws IOException {
		
		loadDataFromFile("scores.txt");
		printInOrder();
		
	}
	
	public static void main(String [] args) throws IOException {

		ScoreTrakker tracker = new ScoreTrakker(students);
		tracker.processFiles();
		Collections.sort(students);
		
		
	}
	
}


