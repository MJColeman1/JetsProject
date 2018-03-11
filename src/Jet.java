
public class Jet {

	private String model;
	private double speed;
	private int range;
	private long price;
	
	public Jet() {

	}

	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public void fly() {
		System.out.println("The " + this.model + " has begun takeoff!");
		double time = (this.range * 60) / (this.speed);
		time = Math.round((time*100.0) / 100.0) * (100) / 100;
		int time2 = (int)(time);
		System.out.println("The " + this.model + " can fly at full speed "
				+ "(" + this.speed + " mph) for " + time2 + " minutes before needing to be refueled.");
	}

	public double getSpeedInMach(double speed) {
		return speed;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aircraft Model = ");
		builder.append(model);
		builder.append(", Speed = ");
		builder.append(speed);
		builder.append(", Range = ");
		builder.append(range);
		builder.append(", Price = $");
		builder.append(price);
		builder.append("");
		return builder.toString();
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

}
