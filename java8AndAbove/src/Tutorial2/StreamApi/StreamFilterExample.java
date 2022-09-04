package Tutorial2.StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

	public static void main(String[] args) {

		//filer products greater than 50k price         TRADITIONAL APPROACH
		
		List<Product> filteredProductList = new ArrayList<>();
		
		for(Product product : getProducts()) {
			if(product.getPrice()>50000) {
				filteredProductList.add(product);
			}
		}
		
		System.out.println("filteredProductList ::"+filteredProductList);
		
		
		// using java 8 stream API ------------------------------------------------------------------------------------------------------------------
		
		 
		List<Product> filteredProductList2 = getProducts()
				.stream()
				.filter((product) -> product.getPrice() < 50000)  //predicate
				.collect(Collectors.toList());
		
		filteredProductList2.forEach((product) -> System.out.println("product :: "+product));
		
		
		
		//---------------------------------------Directly using for each in stream-----------------------------------------------------------------------------------------------------
		
		getProducts()
				.stream()
				.filter((product) -> product.getPrice() < 50000)  //predicate
				.forEach(System.out::println);
		
		
	}
	
	private static List<Product> getProducts(){
		
		List<Product> productsList = new ArrayList<>();
		productsList.add(new Product(1,"Acer", 62000));
		productsList.add(new Product(2,"Dell", 30000));
		productsList.add(new Product(3,"Apple", 120000));
		productsList.add(new Product(4,"Hp", 40000));
		productsList.add(new Product(5,"Asus", 90000));
		
		
		return productsList;
	}
}


class Product {
	private int id;
	private String name;
	private float price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Product() {
		
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}