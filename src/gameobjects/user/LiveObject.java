package gameobjects.user;

public abstract class LiveObject {
	private String name;
	private Status status;
	private Location location;
	private Gage health;
	
	public LiveObject(String name, Status status) {
		this.name = name;
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
	
	public void setHealth(int value) {
		health.change(value);
	}
	
	public void basicAttack(LiveObject other) {
		other.setHealth(-status.getStrength());
	}
}
