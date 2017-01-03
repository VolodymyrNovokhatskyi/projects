package softgroup.exercisetest;

/**
 * Created by vnovohatskyy on 03.01.17.
 */

public class RgbColorBuilder {

	private int red;
	private int green;
	private int blue;

	public RgbColorBuilder() {
	}

	public RgbColorBuilder buildRed(int red) {
		this.red = red;
		return this;
	}

	public RgbColorBuilder buildGreen(int green) {
		this.green = green;
		return this;
	}

	public RgbColorBuilder buildBlue(int blue) {
		this.blue = blue;
		return this;
	}

	public RgbColor build() {
		RgbColor rgb = new RgbColor();
		if (red >= 0 && red <= 255) {
			rgb.setRed(red);
		} else {
			throw new IllegalStateException("value " + red + " is not in the range [0,255]");
		}
		if (green >= 0 && green <= 255) {
			rgb.setGreen(green);
		} else {
			throw new IllegalStateException("value " + green + " is not in the range [0,255]");
		}
		if (blue >= 0 && blue <= 255) {
			rgb.setBlue(blue);
		} else {
			throw new IllegalStateException("value " + blue + " is not in the range [0,255]");
		}
		return rgb;
	}

}
