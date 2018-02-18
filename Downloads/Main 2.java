
import java.util.Scanner;
public class Main {
    private static int valueAssignment(char hexInput) {
            int hexValue = 0;

            if (hexInput == '0') {
                hexValue = 0;
            }
            if (hexInput == '1') {
                hexValue = 1;
            }
            if (hexInput == '2') {
                hexValue = 2;
            }
            if (hexInput == '3') {
                hexValue = 3;
            }
            if (hexInput == '4') {
                hexValue = 4;
            }
            if (hexInput == '5') {
                hexValue = 5;
            }
            if (hexInput == '6') {
                hexValue = 6;
            }
            if (hexInput == '7') {
                hexValue = 7;
            }
            if (hexInput == '8') {
                hexValue = 8;
            }
            if (hexInput == '9') {
                hexValue = 9;
            }
            if (hexInput == 'A' || hexInput == 'a') {
                hexValue = 10;
            }
            if (hexInput == 'B' || hexInput == 'b') {
                hexValue = 11;
            }
            if (hexInput == 'C' || hexInput == 'c') {
                hexValue = 12;
            }
            if (hexInput == 'D' || hexInput == 'd') {
                hexValue = 13;
            }
            if (hexInput == 'E' || hexInput == 'e') {
                hexValue = 14;
            }
            if (hexInput == 'F' || hexInput == 'f') {
                hexValue = 15;
            }
            if (hexInput == 'X' || hexInput == 'x') {
                hexValue = 0;
            }
            return hexValue;
        }
        public static void main (String args[]){
            Scanner scnr = new Scanner(System.in);

            System.out.print("Enter a hexadecimal number: ");
            String hexInput = scnr.next();//what the user inputs

            long decimalTotal = 0;
            int hexInputLength = hexInput.length();

            int hexCalc;
            int index = hexInputLength - 1;
      

            while (index >= 0) {
                hexCalc = valueAssignment(hexInput.charAt(index)); //gets the leftmost character and assigns it a value
                decimalTotal = decimalTotal + Math.abs(hexCalc * (long) Math.pow(16, hexInputLength - index - 1));
                index--;
            }

            System.out.println("Your number is " + decimalTotal + " in decimal");
            System.out.println();
        }
    }
