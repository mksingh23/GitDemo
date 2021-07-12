package Inheritance;
class Bicycle{
	public int gear;
	public int speed;
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	public void applyBreak(int deacceleration) {
		speed -= deacceleration;
	}
	public void applySpeed(int acceleration) {
		speed += acceleration;
	}
	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}
}
class MountainBike extends Bicycle{
	int setHeight;

	public MountainBike(int gear, int speed, int setHeight) {
		super(gear, speed);
		this.setHeight = setHeight;
	}
	public void setHeight(int newValue) {
		setHeight = newValue;
	}
	@Override
	public String toString() {
		return "MountainBike [setHeight=" + setHeight + ", gear=" + gear + ", speed=" + speed + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
public class SingleInheritance {
	public static void main(String[] args) {
		MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
	}
}
