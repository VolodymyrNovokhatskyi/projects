package softgroup.exercisetest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vnovohatskyy on 03.01.17.
 */

public class RgbApp {
	public static void main(String[] args) {
		RgbColorUtil util = new RgbColorUtil();
		List<RgbColor> list1 = new ArrayList<>();
		List<RgbColor> list2 = new ArrayList<>();
		List<RgbColor> list3 = new ArrayList<>();
		list1 = util.setListOfRgbColor();
		list2 = util.setListMultipleByNumber(list1, 51);
		list3 = util.processingList(list2);
		util.printRgbColorFromList(list3, 9);
	}
}
