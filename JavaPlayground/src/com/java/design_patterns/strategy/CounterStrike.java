package com.java.design_patterns.strategy;

public class CounterStrike {

	public static void main(String[] args) {

		Player terrorist = new Player("Terrorist");
		Player counter_terrorist = new Player("Counter-Terrorist");

		System.out.println("Before bomb plantedx\n");

		terrorist.setStrategy(new AggressiveStrategy());
		counter_terrorist.setStrategy(new DefensiveStrategy());

		terrorist.action();

		counter_terrorist.action();

		System.out.println("\nAfter bomb planted\n");

		terrorist.setStrategy(new DefensiveStrategy());
		counter_terrorist.setStrategy(new AggressiveStrategy());

		terrorist.action();

		counter_terrorist.action();

	}

}
