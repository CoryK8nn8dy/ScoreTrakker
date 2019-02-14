
public class Student implements Comparable<Student> {
	private String name = "";
	private int score = 0;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(Student someStudent) {
		// if callers score is greater/equal to callees
		if (this.getScore() >= someStudent.getScore()) {
			return 1;
		// if callers score is less than callees
		} else {
			return -1;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}
