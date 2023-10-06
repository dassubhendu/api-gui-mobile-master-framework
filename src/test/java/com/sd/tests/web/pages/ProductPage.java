package com.sd.tests.web.pages;

import com.sd.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;
import java.util.function.Consumer;

import static com.sd.utils.PageActionsHelper.*;

public class ProductPage {

  private static final By THREE_BAR_MENU_BUTTON = By.id("react-burger-menu-btn");
  private static final By LOGOUT_BUTTON = By.id("logout_sidebar_link");
  private static final By PRODUCTS_LABEL = By.xpath("//span[text()='Products']");
  private static final By SHOPPING_CART_LINK = By.xpath("//a[@class='shopping_cart_link']");
  private static final By PRODUCT_NAME_LABEL = By.xpath("//div[@class='inventory_item_name']");
  private static final By ADD_TO_CART_BUTTON = By.xpath("//button[text()='Add to cart']");

  public ProductPage(){};

  public ProductPage clickOnBurgerMenuButton(){
    waitAndClick(THREE_BAR_MENU_BUTTON, Duration.ofSeconds(20));
    return this;
  }

  public boolean isProductsLabelVisible(){
    return waitAndCheckElementIsVisible(PRODUCTS_LABEL, Duration.ofSeconds(20));
  }

  public boolean isLogoutButtonPresent() {
    return waitAndCheckElementIsVisible(LOGOUT_BUTTON, Duration.ofSeconds(20));
  }

}
