package Stream;

public class StudentObject {
	
    String name;
    int score;
    int height;
    
    
	public StudentObject(String name, int score, int height) {
		this.name = name;
		this.score = score;
		this.height = height;
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
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "StudentObject [name=" + name + ", score=" + score + ", height=" + height + "]";
	}
    
    
}
