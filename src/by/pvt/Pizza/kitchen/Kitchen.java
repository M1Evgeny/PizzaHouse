package by.pvt.Pizza.kitchen;

import by.pvt.Pizza.pizza.Pizza;

public class Kitchen {

	public Pizza pizzaMashine(int name, int size) {
		Pizza order;
		Kitchen chef = new Kitchen();
		String pizzaName = chef.selectName(name);
		String pizzaSize = chef.selectSize(size);
		order = new Pizza(pizzaName, pizzaSize);
		return order;
	}

	public String selectName(int name) {
		String pn=null;
		switch (name) {
		case 1:
			pn = "Mexican pizza";
			break;
		case 2:
			pn = "Pepperoni pizza";
			break;
		}
		return pn;
	}

	public String selectSize(int size) {
		String ps=null;
		switch (size) {
		case 1:
			ps = "small";
			break;
		case 2:
			ps = "medium";
			break;
		case 3:
			ps = "large";
			break;
		}
		return ps;
	}
}
