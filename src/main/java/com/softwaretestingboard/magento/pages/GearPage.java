package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bags = By.xpath("//span[normalize-space()='Bags']");
    By productName = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By productText = By.xpath("//span[@class='base']");
    By changeQty = By.xpath("//input[@id='qty']");
    By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    By addedProductText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By linkShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By getProductNameText = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By quantityText = By.xpath("//input[@title='Qty']");
    By productPriceText = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");
    By updateQty = By.xpath("//input[@title='Qty']");
    By clickUpdateQty = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By productPriceText1 = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");


    public void mouseHOverOnGearManu() {
        mouseHoverOnElement(gearMenu);
    }

    public void clickOnBags() {
        mouseHoverAndClickOnElement(bags);
    }

    public void clickOnProduct() {
        clickOnElement(productName);
    }

    public String verifyOvernightDuffleText() {
        return getTextFromElement(productText);
    }

    public void changeQuantity() {
        driver.findElement(By.xpath("//input[@id='qty']")).clear();
        sendTextToElement(changeQty, "3");
    }

    public void addToCart() {
        clickOnElement(addToCartButton);
    }

    public String verifyProductAddText() {
        return getTextFromElement(addedProductText);
    }

    public void clickOnShoppingCart() {
        clickOnElement(linkShoppingCart);
    }

    public String verifyTheProductName() {
        return getTextFromElement(getProductNameText);
    }

    public String verifyTheQuantityNumber() throws InterruptedException {
        Thread.sleep(3000);
        return getAttributeValueFromElement(quantityText);}

    public String verifyTheProductPrice() {
        return getTextFromElement(productPriceText);}

    public void updateTheQuantity() throws InterruptedException {
        driver.findElement(By.xpath("//input[@title='Qty']")).clear();
        Thread.sleep(2000);
        sendTextToElement(updateQty, "5");}

    public void clickOnUpdateShoppingCart() {
        clickOnElement(clickUpdateQty);
    }

    public String verifyTheProductPrice1() {
        return getTextFromElement(productPriceText1);
    }


}
