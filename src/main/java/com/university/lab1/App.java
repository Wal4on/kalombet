package com.university.lab1;

public class App {
    public static void main(String[] args) {

        Book book1 = new Book("Author1", "Kniga1", "12345", 2021);
        Book book2 = new Book("Author2", "Kniga2", "54321", 2022);

        System.out.println("Информация о книге 1:");
        System.out.println("Год: " + book1.getYear());
        System.out.println("Название: " + book1.getTitle());
        System.out.println("ISBN: " + book1.getIsbn());
        System.out.println("Автор: " + book1.getAuthor());

        System.out.println();

        System.out.println("Информация о книге 2:");
        System.out.println("Год: " + book2.getYear());
        System.out.println("Название: " + book2.getTitle());
        System.out.println("ISBN: " + book2.getIsbn());
        System.out.println("Автор: " + book2.getAuthor());
    }
}
