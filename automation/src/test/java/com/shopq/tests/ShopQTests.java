package com.shopq.tests;
import com.shopq.base.BaseTest;import com.shopq.pages.ShopPage;import org.testng.Assert;import org.testng.annotations.Test;
public class ShopQTests extends BaseTest {
 @Test public void catalogueShowsFourProducts(){Assert.assertEquals(new ShopPage(driver).productCount(),4);}
 @Test public void searchFiltersProducts(){ShopPage s=new ShopPage(driver);s.search("Headphones");Assert.assertEquals(s.productCount(),1);}
 @Test public void addingProductUpdatesCart(){ShopPage s=new ShopPage(driver);s.add("p1");Assert.assertEquals(s.cartCount(),"1");}
 @Test public void cartQuantityCanBeUpdated(){ShopPage s=new ShopPage(driver);s.add("p1");s.openCart();s.increase("p1");Assert.assertEquals(s.quantity("p1"),"2");}
 @Test public void checkoutRequiresFields(){ShopPage s=new ShopPage(driver);s.add("p1");s.openCart();s.checkout();s.submitEmpty();Assert.assertTrue(s.error().contains("complete all checkout fields"));}
 @Test public void validCheckoutCreatesConfirmation(){ShopPage s=new ShopPage(driver);s.add("p2");s.openCart();s.checkout();s.submit("Test","Customer","qa@example.com","123 Demo Street");Assert.assertTrue(s.confirmation());Assert.assertTrue(s.orderNumber().startsWith("SQ-"));}
}
