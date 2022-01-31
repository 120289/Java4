package oefenopdracht6;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Factuur {
	
	private int number;
	private List<Factuurregel> lines = new ArrayList<Factuurregel>();
	DecimalFormat df = new DecimalFormat("##.##");

	public Factuur(int number) {
		this.number = number;
	}

	public void addRegel(Factuurregel factuurregel) {
		lines.add(factuurregel);

	}

	public Integer getNumber() {
		return number;
	}

	private List getLines() {
		return lines;
	}

	public Double getTotalPrice() {
		Double totalPrice = 0d;

		for (Factuurregel fr : lines) {
			totalPrice += fr.getTotalPrice();
		}

		return Double.valueOf(df.format(totalPrice));
	}

	public Integer getLinesCount() {

		return lines.size();
	}

}