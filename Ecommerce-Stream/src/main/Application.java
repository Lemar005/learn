package main;

import java.util.ArrayList;

import domain.Measurement;
import domain.Price;
import domain.Product;
import domain.ProductFactory;

public class Application {

	public static void main(String[] args) {

		
//		Product p = ProductFactory.getProduct("iPhone");
//		Product b = ProductFactory.getProduct("Samsung");
//		Product s = ProductFactory.getProduct("");
//		Product g = ProductFactory.getProduct(null);
//		Product i = ProductFactory.getFakeProduct();
		
		Product v = ProductFactory.getProduct("Potato", 10, "USD", 5, "kg");
	    System.out.println(v);
	    System.out.println(v);

//		ArrayList<Product> list = ProductFactory.getFakeProducts(10);
//
//		//System.out.println(p + "\n" + b +  "\n" + s + "\n" + g + "\n" + i);
//    
//        list.forEach(System.out::println);
	}

}
