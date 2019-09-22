package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
		
		ArrayList<Animal> list=new ArrayList<Animal>();
		list.add(new Chicken());
		list.add(new Pig());
		list.add(new Cow());
		list.add(new Goat());
		for (int i = 0; i < list.size(); i++) {
			list.get(i).makeNoise();
			list.get(i).eatFood();
		}
	}
}
