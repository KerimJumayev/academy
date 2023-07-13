package by.academy.lesson16;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.Box;

public class BoxDemo {

	public static void main(String[] args) {

		ArrayList<HeavyBox> box = new ArrayList<HeavyBox>();
		HeavyBox box1 = new HeavyBox(3, 4, 5, 6);
		HeavyBox box2 = new HeavyBox(6, 3, 8, 4);
		HeavyBox box3 = new HeavyBox(9, 7, 2, 5);
		box.add(box1);

		box.add(box2);
		box.add(box3);
		for (HeavyBox b : box) {
			System.out.println(b);

		}
		box.get(0).setWidth(1);
		System.out.println(box.set(0, box3));
		box.remove(box.size() - 1);
		System.out.println(box);

		HeavyBox[] array = new HeavyBox[box.size()];
		box.toArray(array);
		System.out.println(Arrays.toString(array));

		box.clear();
		System.out.println(box);
	}

}
