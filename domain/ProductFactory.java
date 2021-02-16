package domain;

import java.util.ArrayList;

import com.github.javafaker.Faker;

public class ProductFactory {

	private static int lastID = 0;

	public static Price getPrice(int i1, String s1) {

		if (i1 != 0 && s1 != null && s1.length() != 0)
			return new Price(i1, s1);
		else
			return null;

	}

	public static Measurement getMeasurement(int i1, String s1) {

		if (i1 != 0 && s1 != null && s1.length() != 0)
			return new Measurement(i1, s1);
		else
			return null;

	}

	public static Product getProduct(String name, int i1, String s1, int i2, String s2) {

		if (name != null && name.length() != 0)

			return new Product(++lastID, name, getPrice(i1, s1), getMeasurement(i2, s2));

		else
			return null;
	}

//	public static Product getFakeProduct() {
//		Faker f = new Faker();
//		int i = (int)Math.random();
//		return getProduct(f.commerce().productName() + " / " + getPrice(i, f.currency().code()), i, null, i, null);
//	}
//
//	public static ArrayList<Product> getFakeProducts(int count) {
//		ArrayList<Product> products = new ArrayList<>();
//          
//		while (--count >= 0) {
//
//			products.add(getFakeProduct());
//		}
//		return products;
//	}

}
