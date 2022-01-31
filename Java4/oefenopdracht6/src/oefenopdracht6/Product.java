package oefenopdracht6;

import java.text.DecimalFormat;

public class Product {
	String naam;
	String omschrijving;
	double prijs;
	DecimalFormat df = new DecimalFormat("#.##");

	public Product(String naam, String omschrijving, Double prijs) {
		this.naam = naam;
		this.omschrijving = omschrijving;
		this.prijs = prijs;
	}

	public String getNaam() {
		return naam;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public double getPrijs() {
		return Double.valueOf(df.format(prijs));
	}
}
