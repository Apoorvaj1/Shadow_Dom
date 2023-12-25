package AutomationTesterProgram;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the temperature: ");
                double temperature = sc.nextDouble();
                System.out.print("Enter the unit of the temperature (F/C): ");
                String unit = sc.next();

                if (unit.equalsIgnoreCase("F")) {
                    double celsius = (temperature - 32) * 5 / 9;
                    System.out.printf("%.2f°F is equivalent to %.2f°C", temperature, celsius);
                } else if (unit.equalsIgnoreCase("C")) {
                    double fahrenheit = temperature * 9 / 5 + 32;
                    System.out.printf("%.2f°C is equivalent to %.2f°F", temperature, fahrenheit);
                } else {
                    System.out.println("Invalid unit. Please enter either 'F' or 'C'.");
                }
                sc.close();
            }
        }

