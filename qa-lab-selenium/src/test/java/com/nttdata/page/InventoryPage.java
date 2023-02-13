package com.nttdata.page;

import org.openqa.selenium.By;

public class InventoryPage {

    public static By productsTitle = By.cssSelector("span.title");
    public static By itemsCards = By.cssSelector("div.inventory_item");
    public static By Producto = By.id("item_0_img_link");
    public static By carritoButton = By.id("add-to-cart-sauce-labs-bike-light");
    public static By añadircarritotext = By.xpath("*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]");
    //SEGUNDA FORMA PARA MI XPATH POR NOMBRE lo cambie por que el de abajo demora en ejecutar un poco mas
   // public static By añadircarritotext = By.xpath("//div[@class='inventory_item_name'='Sauce Labs Bike Light']");
}
