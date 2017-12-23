package problemSet3;

public class Cone {
	public static void main(String[] args) {

	}

	private int r;
	private int h;

	/**
	 * Constructor for the Cone class
	 * 
	 * @param r,
	 *            the radius of the cone
	 * @param h,
	 *            the height of the cone
	 */
	public Cone(int r, int h) {
		this.r = r;
		this.h = h;
	}

	/**
	 * Calculates the volume of the cone
	 * 
	 * @return the volume of the cone (Volume of a cone = 1/3 * PI * r^2 * h)
	 */
	public double getVolume() {
		double volume;
		// TODO write the code to assign the volume of the cone to the variable volume.
		// Use Math.PI
		volume = Math.pow(this.r, 2) * Math.PI * this.h / 3;
		return volume;
	}
}
