package com.tarbi.Product;

import java.util.List;

public class Main {

	
	public static void main(String[] args) {
		
		ProductService service = new ProductService();
		
		/*
		 * service.addProduct(new Product("Asus","laptop","brown table",2022));
		 * service.addProduct(new Product("Asus", "laptop", "brown table", 2022));
		 * service.addProduct(new Product("Dell", "desktop", "corner desk", 2023));
		 * service.addProduct(new Product("HP", "monitor", "standing desk", 2024));
		 * service.addProduct(new Product("Lenovo", "tablet", "coffee table", 2021));
		 * service.addProduct(new Product("Acer", "keyboard", "gaming desk", 2022));
		 * service.addProduct(new Product("MSI", "mouse", "mouse pad", 2023));
		 * service.addProduct(new Product("Razer", "headset", "chair armrest", 2024));
		 * service.addProduct(new Product("Logitech", "webcam", "top of monitor",
		 * 2022)); service.addProduct(new Product("Samsung", "smartphone", "nightstand",
		 * 2023)); service.addProduct(new Product("Apple", "smartwatch", "wrist",
		 * 2024)); service.addProduct(new Product("Google", "smart speaker",
		 * "kitchen counter", 2022)); service.addProduct(new Product("Amazon",
		 * "e-reader", "bedside table", 2023)); service.addProduct(new Product("Sony",
		 * "gaming console", "TV stand", 2022)); service.addProduct(new
		 * Product("Nintendo", "gaming handheld", "backpack", 2023));
		 * service.addProduct(new Product("Microsoft", "gaming controller",
		 * "coffee table", 2024)); service.addProduct(new Product("Canon",
		 * "DSLR camera", "camera bag", 2022)); service.addProduct(new Product("Nikon",
		 * "mirrorless camera", "photography studio", 2023)); service.addProduct(new
		 * Product("GoPro", "action camera", "helmet mount", 2024));
		 * service.addProduct(new Product("DJI", "drone", "drone case", 2022));
		 * service.addProduct(new Product("Bose", "headphones", "desk drawer", 2023));
		 * service.addProduct(new Product("JBL", "portable speaker", "poolside", 2024));
		 * service.addProduct(new Product("WD", "external hard drive", "computer desk",
		 * 2022)); service.addProduct(new Product("SanDisk", "USB flash drive",
		 * "keychain", 2023)); service.addProduct(new Product("Netgear", "Wi-Fi router",
		 * "living room", 2024)); service.addProduct(new Product("TP-Link",
		 * "mesh Wi-Fi", "multiple rooms", 2022)); service.addProduct(new
		 * Product("Epson", "projector", "home theater", 2023)); service.addProduct(new
		 * Product("Brother", "printer", "home office", 2024)); service.addProduct(new
		 * Product("Rin g", "video doorbell", "front door", 2022));
		 * service.addProduct(new Product("Arlo", "security camera", "backyard", 2023));
		 * service.addProduct(new Product("Philips Hue", "smart light", "bedroom lamp",
		 * 2024));
		 */
		List<Product> products =service.getAllProducts();
		for(Product p:products) {
		System.out.println(p);
		}
		
		System.out.println("================================");
		System.out.println("A Particular Product");
		
		
		
		Product p=service.getProduct("Apple");
		System.out.println(p);
		
		System.out.println("================================");
		System.out.println("A Particular Text");
		
		List<Product> prods=service.getProductsWithText("smart");
		for(Product product:prods) {
			System.out.println(product);
		}
		System.out.println("================================");
		System.out.println("Product by Place");
		
		List<Product> prodbyplace=service.getProductbyPlace("camera");
		for(Product productbyplace:prodbyplace) {
			System.out.println(productbyplace);
		}
	}
}
