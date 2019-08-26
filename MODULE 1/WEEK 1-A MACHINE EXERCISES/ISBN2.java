package com.whitecloak;

import java.util.Scanner;

public class ISBN2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();

        int totalSumProduct = 0;
        for(int i = 0;i<isbn.length();i++) {
            int digit = Integer.parseInt(Character.toString(isbn.charAt(i)));
            int digitProduct = (digit * (i+1));
            totalSumProduct += digitProduct;
        }
        int checkDigit = (totalSumProduct % 11);

        StringBuilder isbnSB = new StringBuilder(isbn);
        isbnSB.insert(1, "-");
        isbnSB.insert(5, "-");
        isbnSB.append("-"+(checkDigit == 10 ? "X" : checkDigit));

        String isbnFormatted = isbnSB.toString();
        System.out.println(isbnFormatted);
    }
}
