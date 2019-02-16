
public class Student implements Comparable<Student>{
	private String name;
	private int score = 0;
	
	public Student(String name, int score) {
//		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(Student someStudent) {
		
		if (this.getScore() == someStudent.getScore()) {
			return 0;
		}
		else {
			return this.score > someStudent.getScore() ? 1 : -1;
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
//
//	@Override
//	public int compareTo(Object someStudent) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	
	
	
}
