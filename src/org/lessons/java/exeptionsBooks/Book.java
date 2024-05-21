package org.lessons.java.exeptionsBooks;

public class Book {

    // ATTRIBUTES
    private String title;
    private int pages;
    private String author;
    private String editor;

    // CONSTRUCTORS
    public Book(String title, int pages, String author, String editor) throws IllegalArgumentException {
        checkString(title, "title");
        this.title = title;
        checkNumber(pages, "number of pages");
        this.pages = pages;
        checkString(author, "author");
        this.author = author;
        checkString(editor, "editor");
        this.editor = editor;
    }

    // METHODS
    public void checkString(String s, String type) throws IllegalArgumentException {
        if (s.isEmpty()) {
            throw new IllegalArgumentException("Invalid " + type);
        }
    }

    public static void checkNumber(int n, String type) throws NumberFormatException {
        if (n <= 0) {
            throw new NumberFormatException("Invalid " + type);
        }
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String s) {
        checkString(s, "title");
        this.title = s;
    }

    public int getPages() {
        return this.pages;
    }
    public void setPages(int n) {
        checkNumber(n, "number of pages");
        this.pages = n;
    }

    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String s) {
        checkString(s, "author");
        this.author = s;
    }

    public String getEditor() {
        return this.editor;
    }
    public void setEditor(String s) {
        checkString(s, "editor");
        this.editor = s;
    }

    public void printBook() {
        System.out.print("\nTitolo: " + this.title);
        System.out.print("\nNumero di pagine: " + this.pages);
        System.out.print("\nAutore: " + this.author);
        System.out.print("\nEditore: " + this.editor);
        System.out.println();
    }
}
