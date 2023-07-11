package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {
    By productName = By.cssSelector(".product-item-link");
    By size32 = By.cssSelector("[data-role=\"swatch-option-880\"][data-rendered=\"true\"] .swatch-option.text");
    By colourBlack = By.cssSelector("#option-label-color-93-item-49");
    By addToCartButton = By.cssSelector(".action.tocart.primary");
    By addedPant = By.cssSelector("[data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]");
    By linkShoppingCart = By.cssSelector(".message-success.success.message div a");
    By textShoppingCart = By.cssSelector("main div h1 span");
    By textCronusYogaPant = By.cssSelector("[data-th=\"Item\"] div strong a");
    By textSize32 = By.cssSelector(".item-options>dd:first-of-type");
    By textBlack = By.cssSelector(".item-options>dd:last-of-type");
    By menMenu = By.cssSelector("li.level0.nav-3>a.level-top.ui-corner-all>span:nth-of-type(1)");
    By menBottoms = By.cssSelector("#ui-id-18 span");
    By menPants = By.cssSelector("#ui-id-23 span");


    public void mouseHoverToMenMenu() {
        mouseHoverOnElement(menMenu);
    }

    public void mouseHoverToMenTops() {
        mouseHoverOnElement(menBottoms);
    }

    public void clickOnPants() {
        mouseHoverAndClickOnElement(menPants);
    }

    public void hoverAndClickProduct() {
        mouseHoverOnElement(productName);
        mouseHoverAndClickOnElement(size32);}

    public void hoverAndClickProductColour() {
        mouseHoverOnElement(productName);
        mouseHoverAndClickOnElement(colourBlack);}

    public void hoverAndClickOnAddToCartButton() {
        mouseHoverOnElement(productName);
        mouseHoverAndClickOnElement(addToCartButton);}

    public String getTextAddedPantToShoppingCart() {
        return getTextFromElement(addedPant);
    }

    public void clickOnShoppingCart() {
        clickOnElement(linkShoppingCart);
    }

    public String getTextShoppingCart() {
        return getTextFromElement(textShoppingCart);
    }

    public String getTextCronusYogaPant() {
        return getTextFromElement(textCronusYogaPant);
    }

    public String getTextSize32() {
        return getTextFromElement(textSize32);
    }

    public String getTextBlack() {
        return getTextFromElement(textBlack);
    }
}
