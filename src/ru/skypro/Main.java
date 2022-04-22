package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Author firstWriter = new Author("Борис", "Акунин");
        Book firstBook = new Book("Сулажин", firstWriter,2019 );
        Author secondWriter = new Author("Адам", "Пшехшта");
        Book secondBook = new Book("Адепт", secondWriter, 2020);
        System.out.println(firstBook.getAuthor().getName() + " " + firstBook.getAuthor().getSurname() + ". " +
                firstBook.getTitle() + ". " + firstBook.getYear());
        System.out.println(secondBook.getAuthor().getName() + " " + secondBook.getAuthor().getSurname() + ". " +
                secondBook.getTitle() + ". " + secondBook.getYear());
        secondBook.setYear(2016);
        System.out.println("Перезаписать год книги Адепт на - "  + secondBook.getYear());



    }
}
