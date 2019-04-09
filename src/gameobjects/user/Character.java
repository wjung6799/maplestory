package gameobjects.user;

public abstract class Character {
	private String name;
	private Status status;
	private Location location;
	
	public Character(String name, Status status) {
		this.name = name;
		setStatus(status);
	}
	
	public String getName() {
		return name;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	abstract public void attack();
	abstract public void travel();
	
}
