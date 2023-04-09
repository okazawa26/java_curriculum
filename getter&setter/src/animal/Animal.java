package animal;

public class Animal {
	private String animalName;
	private double length;
	private int speed;

	public String getName() {
		return this.animalName;
	}

	public void setAnimalName(String animalName) {
		if (animalName == null) {
			throw new IllegalArgumentException("animalNameはNULLです");
		}
		this.animalName = animalName;
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(double length) {
		if (length <= 0) {
			throw new IllegalArgumentException("lengthは0以下です");
		}
		this.length = length;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		if (speed <= 0) {
			throw new IllegalArgumentException("speedは0以下です");
		}
		this.speed = speed;
	}
}