package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * 2. Create the package ‘testsuite’ and create the
 * following classes inside the ‘testsuite’ package.
 * 1. WomenTest
 * 2. MenTest
 * 3. GearTest
 */
public class WomenTest extends BaseTest {
    /*
   Create the package ‘testsuite’ and create the classes WomenTest inside the ‘testsuite’ package.
    */

    WomenPage women = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {

        //Mouse Hover on Women Menu
        Thread.sleep(2000);
        women.mouseHoverOnWomenMenu();

        //Mouse Hover on Tops
        Thread.sleep(2000);
        women.mouseHoverOnTops();

        //Click on Jackets
        women.clickOnJackets();
        Thread.sleep(2000);

        // Storing jackets names in list
        List<WebElement> jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());

            //* Select Sort By filter “Product Name”
            women.sortByFilter("Product Name");

            //* Verify the products name display in alphabetical order
            jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
            List<String> jacketsNameListAfter = new ArrayList<>();
            Thread.sleep(1000);
            for (WebElement value1 : jacketsElementsList) {
                jacketsNameListAfter.add(value1.getText());
            }
            // Sort the before name list into Ascending Order
            jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
            // Verify the products name display in alphabetical order
            Assert.assertEquals(jacketsNameListBefore, jacketsNameListAfter);

        }
    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {

        //Mouse Hover on Women Menu
        Thread.sleep(2000);
        women.mouseHoverOnWomenMenu();

        //Mouse Hover on Tops
        Thread.sleep(2000);
        women.mouseHoverOnTops();

        //Click on Jackets
        women.clickOnJackets();
        Thread.sleep(2000);

        // Storing jackets price in list
        List<WebElement> jacketsPriceElementList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }
        // Select Sort By filter “Price”
        women.sortByFilter("Price");

        Thread.sleep(1000);
        // After Sorting Products by Price
        jacketsPriceElementList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListAfter = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }
        // Sort the jacketPriceListBefore to Ascending Order
        Collections.sort(jacketsPriceListBefore);
        // Verify the products price display in Low to High
        Assert.assertEquals(jacketsPriceListBefore, jacketsPriceListAfter);
    }


}
