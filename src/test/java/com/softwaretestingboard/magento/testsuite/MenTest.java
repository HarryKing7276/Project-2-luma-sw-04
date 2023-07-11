package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    /*
   Create the package ‘testsuite’ and create the classes WomenTest inside the ‘testsuite’ package.
    */
    MenPage men = new MenPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        // Mouse Hover on Men Menu
        Thread.sleep(2000);
        men.mouseHoverToMenMenu();

        // Mouse Hover on Bottoms
        Thread.sleep(2000);
        men.mouseHoverToMenTops();

        // Click on Pants
        Thread.sleep(2000);
        men.clickOnPants();

        // Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        men.hoverAndClickProduct();

        // Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        men.hoverAndClickProductColour();

        // Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        men.hoverAndClickOnAddToCartButton();

        // Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        Assert.assertEquals(men.getTextAddedPantToShoppingCart(), "You added Cronus Yoga Pant to your shopping cart.", "Error");

        // Click on ‘shopping cart’ Link into message
        men.clickOnShoppingCart();
        // Verify the text ‘Shopping Cart.’
        Assert.assertEquals(men.getTextShoppingCart(), "Shopping Cart", "Error");

        // Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(men.getTextCronusYogaPant(), "Cronus Yoga Pant", "Error");

        // Verify the product size ‘32’
        Assert.assertEquals(men.getTextSize32(), "32", "Error");

        // Verify the product colour ‘Black’
        Assert.assertEquals(men.getTextBlack(), "Black", "Error");
    }
}
