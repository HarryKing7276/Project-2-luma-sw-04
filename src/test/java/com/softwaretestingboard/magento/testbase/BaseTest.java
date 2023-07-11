package com.softwaretestingboard.magento.testbase;

import com.softwaretestingboard.magento.browserfactory.ManageBrowser;
import com.softwaretestingboard.magento.propertyreader.PropertyReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends ManageBrowser {
    /**
     * 1. Create the package ‘browserfactory’ and create the
     * class with the name ‘BaseTest’ inside the
     * ‘browserfactory’ package. And write the browser setup
     * code inside the class ‘Base Test’.
     */
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
