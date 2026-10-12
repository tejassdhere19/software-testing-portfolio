package com.shopq.pages;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
public class ShopPage {
 private final WebDriver d;private final WebDriverWait wait;
 public ShopPage(WebDriver d){this.d=d;wait=new WebDriverWait(d,Duration.ofSeconds(5));}
 public int productCount(){return d.findElements(By.cssSelector(".card")).size();}
 public void search(String q){WebElement e=d.findElement(By.id("search"));e.clear();e.sendKeys(q);}
 public void add(String id){wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-add='"+id+"']"))).click();}
 public String cartCount(){return d.findElement(By.id("cart-count")).getText();}
 public void openCart(){d.findElement(By.id("cart-toggle")).click();wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cart-panel")));}
 public void increase(String id){d.findElement(By.cssSelector("[data-qty='"+id+"'][data-delta='1']")).click();}
 public String quantity(String id){return d.findElement(By.cssSelector("[data-cart-product='"+id+"'] .qty-value")).getText();}
 public void checkout(){d.findElement(By.id("checkout-start")).click();wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkout-panel")));}
 public void submitEmpty(){d.findElement(By.cssSelector("#checkout-form button[type='submit']")).click();}
 public String error(){return d.findElement(By.id("checkout-error")).getText();}
 public void submit(String f,String l,String email,String addr){d.findElement(By.id("first-name")).sendKeys(f);d.findElement(By.id("last-name")).sendKeys(l);d.findElement(By.id("email")).sendKeys(email);d.findElement(By.id("address")).sendKeys(addr);d.findElement(By.cssSelector("#checkout-form button[type='submit']")).click();}
 public boolean confirmation(){return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmation-panel"))).isDisplayed();}
 public String orderNumber(){return d.findElement(By.id("order-number")).getText();}
}
