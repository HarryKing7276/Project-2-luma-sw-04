package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    GearPage gear = new GearPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        // Mouse Hover on Gear Menu
        Thread.sleep(2000);
        gear.mouseHOverOnGearManu();

        // Click on Bags
        gear.clickOnBags();

        //* Click on Product Name ‘Overnight Duffle’
        gear.clickOnProduct();

        //* Verify the text ‘Overnight Duffle’
        String actualProductText = gear.verifyOvernightDuffleText();
        Assert.assertEquals(actualProductText, "Overnight Duffle", "Product name is Incorrect");

        //* Change Qty 3
        gear.changeQuantity();

        //* Click on ‘Add to Cart’ Button.
        gear.addToCart();

        //* Verify the text ‘You added Overnight Duffle to your shopping cart.’
        String actualProductAddText = gear.verifyProductAddText();
        Assert.assertEquals(actualProductAddText, "You added Overnight Duffle to your shopping cart.", "Product not match");

        //* Click on ‘shopping cart’ Link into message
        gear.clickOnShoppingCart();

        //* Verify the product name ‘Overnight Duffle’
        String actualProductText1 = gear.verifyTheProductName();
        Assert.assertEquals(actualProductText, "Overnight Duffle", "Product name is Incorrect");

        //* Verify the Qty is ‘3’
        Thread.sleep(3000);
        String actualProductQty = gear.verifyTheQuantityNumber();
        Assert.assertEquals(actualProductQty, "3", "Qty is not match");

        //* Verify the product price ‘$135.00’
        String actualProductPrice = gear.verifyTheProductPrice();
        Assert.assertEquals(actualProductPrice, "$135.00", "Price is not match");

        //* Change Qty to ‘5’
        Thread.sleep(2000);
        gear.updateTheQuantity();

        //* Click on ‘Update Shopping Cart’ button
        gear.clickOnUpdateShoppingCart();

        //* Verify the product price ‘$225.00’
        String actualProductPrice1 = gear.verifyTheProductPrice1();
        Assert.assertEquals(actualProductPrice1, "$225.00", "Price is not match");
    }
}
