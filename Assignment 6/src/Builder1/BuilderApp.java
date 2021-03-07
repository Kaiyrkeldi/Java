package Builder1;

public class BuilderApp {

	public static void main(String[] args) {
		House house = new House(4,2,4,true,true,true,true);
		System.out.println(house);
	}
}

class House {
	int windows;
	int doors;
	int rooms;
    boolean hasGarage;
    boolean hasSwimmingPool;
    boolean hasStatues;
    boolean hasGarden;

	public void setWindows(int windows) {this.windows = windows;}
	public void setDoors(int doors) {this.doors = doors;}
	public void setRooms(int rooms) {this.rooms = rooms;}
	public void setHasGarage(boolean hasGarage) {this.hasGarage = hasGarage;}
	public void setHasSwimmingPool(boolean hasSwimmingPool) {this.hasSwimmingPool = hasSwimmingPool;}
	public void setHasStatues(boolean hasStatues) {this.hasStatues = hasStatues;}
	public void setHasGarden(boolean hasGarden) {this.hasGarden = hasGarden;}

	public House(int windows, int doors, int rooms, boolean hasGarage, boolean hasSwimmingPool, boolean hasStatues, boolean hasGarden) {
		this.windows = windows;
		this.doors = doors;
		this.rooms = rooms;
		this.hasGarage = hasGarage;
		this.hasSwimmingPool = hasSwimmingPool;
		this.hasStatues = hasStatues;
		this.hasGarden = hasGarden;
	}

	@Override
	public String toString() {
		return "House{" +
				"windows=" + windows +
				", doors=" + doors +
				", rooms=" + rooms +
				", hasGarage=" + hasGarage +
				", hasSwimmingPool=" + hasSwimmingPool +
				", hasStatues=" + hasStatues +
				", hasGarden=" + hasGarden +
				'}';
	}
}
