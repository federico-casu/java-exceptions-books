package org.lessons.java.exeptionsBooks;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] library = null;
        int nBooks;

        while (library == null) {
            try {
                System.out.println("Quanti libri vuoi inserire?: ");
                nBooks = Integer.parseInt(scanner.nextLine());
                Book.checkNumber(nBooks, "number of books");
                library = new Book[nBooks];
            } catch (NumberFormatException luisa) {
                System.out.println(luisa.getMessage());
            }
        }

        for (int i = 0; i < library.length; i++) {
            String title, author, editor;
            int pages;

            try {
                System.out.print("\nLibro n. " + (i+1));
                System.out.print("\nTitolo: ");
                title = scanner.nextLine();
                System.out.print("\nNumero pagine: ");
                pages = Integer.parseInt(scanner.nextLine());
                System.out.print("\nAutore: ");
                author = scanner.nextLine();
                System.out.print("\nEditore: ");
                editor = scanner.nextLine();

                library[i] = new Book(title, pages, author, editor);
            } catch (IllegalArgumentException luisa) {
                System.out.println(luisa.getMessage());
            }
        }

        scanner.close();
    }
}
