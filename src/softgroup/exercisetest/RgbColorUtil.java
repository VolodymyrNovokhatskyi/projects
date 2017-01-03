package softgroup.exercisetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by vnovohatskyy on 03.01.17.
 */

public class RgbColorUtil {

	public List<RgbColor> setListOfRgbColor() {
		Color[] colors = Color.values();
		List<Color> colorsList = new ArrayList<>();
		colorsList = Arrays.asList(colors);
		List<RgbColor> rgbList = new ArrayList<>();
		for (Color in : colorsList) {
			RgbColor rgb = new RgbColorBuilder().buildRed(in.getRed()).buildGreen(in.getGreen()).buildBlue(in.getBlue())
					.build();
			rgbList.add(rgb);
		}
		return rgbList;
	}

	public List<RgbColor> setListMultipleByNumber(List<RgbColor> list, int number) {
		List<RgbColor> temp = new ArrayList<>();
		for (RgbColor rgb : list) {
			if (rgb.getRed() % number == 0 && rgb.getGreen() % number == 0 && rgb.getBlue() % number == 0) {
				temp.add(rgb);
			}
		}
		return temp;
	}

	private List<RgbColor> setAskOrderRedColor(List<RgbColor> list) {
		for (int i = list.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (list.get(j).getRed() > list.get(j + 1).getRed()) {
					int tmp = list.get(j).getRed();
					list.get(j).setRed(list.get(j + 1).getRed());
					list.get(j + 1).setRed(tmp);
				}
			}
		}
		return list;
	}

	private List<RgbColor> setDeskOrderBlueColor(List<RgbColor> list) {
		for (int i = list.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (list.get(j).getBlue() < list.get(j + 1).getBlue()) {
					int tmp = list.get(j + 1).getBlue();
					list.get(j + 1).setBlue(list.get(j).getBlue());
					list.get(j).setBlue(tmp);
				}
			}
		}
		return list;
	}

	public List<RgbColor> processingList(List<RgbColor> list) {
		List<RgbColor> temp = new ArrayList<>();
		List<RgbColor> processedList = new ArrayList<>();
		Collections.shuffle(list);
		temp = setAskOrderRedColor(list);
		processedList = setDeskOrderBlueColor(temp);
		return processedList;

	}

	public void printRgbColorFromList(List<RgbColor> list, int numberOfPrintedObjects) {
		if (numberOfPrintedObjects <= list.size()) {
			for (int i = 0; i < numberOfPrintedObjects; i++) {
				System.out.print(list.get(i) + ", ");
			}
		} else {
			System.out.println("Number of printed objects is bigger than list size");
		}
	}

}
