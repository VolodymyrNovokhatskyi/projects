package softgroup.exercisetest;

/**
 * Created by vnovohatskyy on 03.01.17.
 */

public enum Color {
	BLACK(0, 0, 0), 
	WHITE(255, 255, 255), 
	RED(255, 0, 0), 
	LIME(0, 255, 0), 
	BLUE(0, 0, 255), 
	LIGHT_YELLOW(255, 255,51), 
	YELLOW(255, 255, 0), 
	DARK_YELLOW(204, 204, 0), 
	AQUA(0, 255, 255), 
	MAGENTA(255, 0, 255), 
	SILVER(192, 192, 192), 
	GRAY(128, 128, 128), 
	MAROON(128, 0, 0), 
	OLIVE(128, 128, 0), 
	GREEN(0, 128, 0), 
	PURPLE(128, 0, 128), 
	TEAL(0, 128, 128), 
	NAVY(0, 0, 128);

	private int red;

	private int green;

	private int blue;

	Color(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}
}
