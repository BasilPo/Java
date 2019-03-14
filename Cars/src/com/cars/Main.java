/* Create a Car class with the following fields:
 * - id,
 * - Brand,
 * - Model,
 * - Year of manufacture,
 * - Color,
 * - Price,
 * - Registration number.
 *
 * Define constructors and methods setType(), getType(), toString().
 * Create an array of objects.
 * Print:
 * a) a list of cars of a given brand;
 * b) a list of vehicles of a given model that have been operated for more than n years;
 * c) a list of vehicles of a given year of release, the price of which is higher than the specified.
 */
package com.cars;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//Testing
public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car("Audi", "A1", 2010, "White", 5000.00, "ABC1111"),
                new Car("Audi", "A3", 2000, "Gray", 3000.00, "BBB1234"),
                new Car("Audi", "Q8", 2018, "Red", 25000.00, "OOO0000"),
                new Car("Bentley", "Continental GT", 2010, "Red", 20000.00, "ABC2222"),
                new Car("BMV", "M5", 2017, "Black", 15000.00, "BDR2345"),
                new Car("Ford", "Mondeo", 2015, "Brown", 11000.00, "QWE9872"),
                new Car("Honda", "Accord", 2013, "Blue", 10000.00, "CBC7777"),
                new Car("Honda", "Civic", 2015, "Green", 8000.00, "CCC1234"),
                new Car("Jeep", "Wrangler", 2005, "Green", 6000.00, "SUN4517"),
                new Car("Volvo", "S60", 2018, "White", 17000.00, "BIL4107")
        };

        //A
        System.out.println("List of Audi cars:\n");
        String brand = "Audi";

        for (Car car : cars) {
            if (car.getBrand().equals(brand))
                System.out.println(car);
        }

        //B
        System.out.println("The list of models Accord, which has been used for more than 5 years");
        int operationYear = 5;
        String model = "Accord";

        Date date = new Date(); //the current date
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);

        for (Car car : cars) {
            //date.getYear() is deprecated => calendar.get(Calendar.YEAR)
            if (car.getModel().equals(model) && calendar.get(Calendar.YEAR) - car.getManufactureYear() >= operationYear) {
                System.out.println(car);
            }
        }

        //C
        System.out.println("List of 2018 cars, the price of which is more than 20,000");
        int year = 2018;
        double price = 20000.00;

        for (Car car : cars) {
            if (car.getManufactureYear() == year && car.getPrice() >= price) {
                System.out.println(car);
            }
        }
    }
}