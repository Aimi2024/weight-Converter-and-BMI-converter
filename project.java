import java.util.Scanner;

public class project {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // String choices;
        String converter;

        double bmi_result = 0;
        double weight;
        double convertedWeight_kg;
        double height;
        // ask for weight

        System.out.print("Weight: ");
        while (true) {
            // check if input is double
            try {
                weight = Double.parseDouble(input.nextLine());
                break;

            } catch (NumberFormatException a) {
                System.out.print("Enter a number only:");
            }
        }
        while (true) {
            System.out.print("Convert it to (L) for pounds and (K) for kilograms: ");
            converter = input.next();
            // ask if converted to pounds or weight

            if (converter.equalsIgnoreCase("K")) {
                convertedWeight_kg = weight * 0.45;
                System.out.println(weight + " pounds is equal to " + convertedWeight_kg + " kilograms.");
                break;
            } else if (converter.equalsIgnoreCase("L")) {
                convertedWeight_kg = weight / 0.45;
                System.out.println(weight + " Kilograms is equal to " + convertedWeight_kg + " Pounds.");
                break;
            } else {
                System.out.println("enter what is valid in the choices");
            }
        }
        // if the user inputs Kilogram will execute for kilogram formula for BMI
        if (converter.equalsIgnoreCase("K")) {

            while (true) {
                System.out.print("Do you want to know your BMI? (Y) for yes and (N) for no: ");
                String BMI = input.next();

                if (BMI.equalsIgnoreCase("Y")) {
                    while (true) {
                        try {
                            System.out.print("Height: ");
                            height = Double.parseDouble(input.next());
                            break;

                        } catch (NumberFormatException a) {
                            System.out.print("Enter a number only:");
                        }
                        // formula for BMI
                    }
                    height = height * 0.01;
                    bmi_result = convertedWeight_kg / (height * height);
                    System.out.println("BMI result: " + bmi_result);
                    if (bmi_result < 18.5) {
                        System.out.println("Under Weight");
                        break;
                    } else if (bmi_result >= 18.5 && bmi_result <= 24.9) {
                        System.out.println("Normal Weight");
                        break;
                    } else if (bmi_result >= 25 && bmi_result <= 29.9) {
                        System.out.println("Overweight");
                        break;
                    } else if (bmi_result >= 30) {
                        System.out.println("Obesity");
                        break;
                    } else {
                        System.out.println("Are you even human dude?");
                        break;
                    }
                    // if the user does not want to know the BMI
                } else if (BMI.equalsIgnoreCase("N")) {
                    System.out.println("Thanks for using our BMI and weight converter! ");
                    break;

                }

            }
            // if the user inputs Pounds will execute for Pounds formula for BMI
        } else if (converter.equalsIgnoreCase("L")) {

            while (true) {
                System.out.print("Do you want to know your BMI? (Y) for yes and (N) for no: ");
                String BMI = input.next();
                if (BMI.equalsIgnoreCase("Y")) {
                    while (true) {
                        // will ask for the height and check if the user inputs a double
                        try {
                            System.out.print("Height: ");
                            height = Double.parseDouble(input.next());
                            break;

                        } catch (NumberFormatException a) {
                            System.out.print("Enter a number only:");
                        }
                        // if the user inputs Kilogram will execute for kilogram formula for BMI
                    }
                    height = height / 2.54;
                    bmi_result = (703 * convertedWeight_kg) / (height * height);
                    System.out.println("BMI result: " + bmi_result);
                    if (bmi_result < 18.5) {
                        System.out.println("Under Weight");
                        break;
                    } else if (bmi_result >= 18.5 && bmi_result <= 24.9) {
                        System.out.println("Normal Weight");
                        break;
                    } else if (bmi_result >= 25 && bmi_result <= 29.9) {
                        System.out.println("Overweight");
                        break;
                    } else if (bmi_result >= 30) {
                        System.out.println("Obesity");
                        break;
                    } else {
                        System.out.println("Are you even human dude?");
                        break;
                    }
                    // if the user does not want to know the BMI
                } else if (BMI.equalsIgnoreCase("N")) {
                    System.out.println("Thanks for using our BMI and weight converter! ");
                    break;

                }

            }
        }
    }
}