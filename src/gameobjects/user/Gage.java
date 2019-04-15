package gameobjects.user;

public class Gage {
	int max;
	int current;
	public Gage(int max) {
		this.max = max;
		this.current = max;
	}
	
	public void change(int input) {
		current = current + input;
	}
	
	public String toString() {
		return current + "/" + max;
	}
}
