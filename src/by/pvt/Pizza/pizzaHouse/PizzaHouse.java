package by.pvt.Pizza.pizzaHouse;

import by.pvt.Pizza.inputReader.InputReader;
import by.pvt.Pizza.kitchen.Kitchen;
import by.pvt.Pizza.menu.Menu;
import by.pvt.Pizza.pizza.Pizza;

public class PizzaHouse {
	public static void main(String[] args) {
		PizzaHouse pzzhs = new PizzaHouse();
		Menu menu = new Menu();
		InputReader ir = new InputReader();
		Kitchen chef = new Kitchen();

		pzzhs.greeting();
		menu.pizzaMenu();
		int pizzaOrderName = ir.pizzaName();
		int pizzaOrderSize = ir.pizzaSize();
		Pizza order = chef.pizzaMashine(pizzaOrderName, pizzaOrderSize);
		pzzhs.ready(order);
	}

	public void greeting() {
		System.out.println("Welocome to our PizzaHouse");
	}

	public void ready(Pizza pizza) {
		System.out.print("Your order is ready. Here is you " + pizza.size + " " + pizza.name);
	}
}
