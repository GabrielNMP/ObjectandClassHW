package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Author firstWriter = new Author("�����", "������");
        Book firstBook = new Book("�������", firstWriter,2019 );
        Author secondWriter = new Author("����", "�������");
        Book secondBook = new Book("�����", secondWriter, 2020);
        System.out.println(firstBook.getAuthor().getName() + " " + firstBook.getAuthor().getSurname() + ". " +
                firstBook.getTitle() + ". " + firstBook.getYear());
        System.out.println(secondBook.getAuthor().getName() + " " + secondBook.getAuthor().getSurname() + ". " +
                secondBook.getTitle() + ". " + secondBook.getYear());
        secondBook.setYear(2016);
        System.out.println("������������ ��� ����� ����� �� - "  + secondBook.getYear());



    }
}
