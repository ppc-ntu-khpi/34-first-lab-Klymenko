/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Shirt {
  public int shirtID = 1; // стандартне значення номера моделі сорочки
  public String description = "Some description without any sense"; // стандартний опис сорочки
  // коди кольорів: R=червоний, B=синій, G=зелений, U=невідомо
  public String[] colors = {
			"Red", 
			"Blue",
			"Green",
			"Undefined",
			};
  int colorid = 2;
  public double price = 20.2; // стандартна вартість сорочки
  public int quantityInStock = 20; // стандартна кількість на складі
  
  // цей метод просто виводить всю інформацію про сорочку на екран
  public void displayShirtInformation() {
    Scanner in = new Scanner(System.in);
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color: " + colors[colorid]);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  } // кінець методу displayShirtInformation
} // кінець опису класу
