package oefenopdracht6;

import java.text.DecimalFormat;

public class Factuurregel {
	public int btw;

	public int aantal;
	private Product product;
	DecimalFormat df = new DecimalFormat("##.##");

	// Constructor
	public Factuurregel(Product product, int btw, int aantal) {
		this.btw = btw;
		this.product = product;
		this.aantal = aantal;
	}

	// Getters
	public int getBtw() {
		return btw;
	}

	public double getPrijs() {
		return aantal * product.getPrijs();
	}

	public int getAantal() {
		return aantal;
	}

	public double getTotalPrice() {
		return Double.valueOf(df.format(getPrijs() * (1 + (btw / 100d))));

	}

	public Product getProduct() {

		return this.product;
	}
}
