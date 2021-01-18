package Locaters;

import org.openqa.selenium.By;

public class checkoutLocaters {

	public static By Checkout = By.xpath("//*[contains(text(),'ADD TO CART')]");
	
	public static By Cart = By.xpath("/html/body/div/div/header/div/div[3]/a[4]/img");
	
	public static By ProceedToCheckout = By.xpath("//*[contains(text(),'PROCEED TO CHECKOUT')]");
	
}
