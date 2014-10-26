package com.babyPackage;

/**
 * @author 
 * 		Iulian 
 * @Description 
 * 		baby class
 */
public class Baby {
	String name;
	boolean isMale;
	double weight;
	double decibels;
	int numPoops = 0;

	/**
	 * @author 
	 * 		Iulian 
	 * @Description 
	 * 		poop function
	 * @param
	 * 		no params
	 */
	void poop() {
		numPoops += 1;
		System.out
				.println("Dear mother, " + "I have pooped. Ready the diaper.");
	}

	/**
	 * @author 
	 * 		Iulian 
	 * @Description 
	 * 		constructor Baby
	 * @param 
	 *		n: Baby name, w: weight, x: isMale
	 */
	public Baby(String n, double w, boolean x) {
		this.name = n;
		this.weight = w;
		this.isMale = x;
	}

	/**
	 * @author 
	 * 		Iulian 
	 * Description 
	 * 		prints name and weight
	 * @param
	 * 		no params
	 */
	public void afisare() {
		System.out.println(this.name);
		System.out.println(this.weight);
	}
}
