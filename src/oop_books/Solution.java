package oop_books;

import java.util.LinkedList;
import java.util.List;

   /*   Создай public static класс MarkTwainBook, который наследуется от Book. Имя автора — [Mark Twain].
        Параметр конструктора — название книги (title).
        В классе MarkTwainBook реализуй все абстрактные методы.
        Для метода getBook измени тип возвращаемого значения на более подходящий.
        Создай по аналогии AgathaChristieBook. Имя автора — [Agatha Christie].
        В классе Book реализуй тело метода getOutputByBookType() так, чтобы он возвращал:
        agathaChristieOutput — для книг Агаты Кристи;
        markTwainOutput — для книг Марка Твена.
   */
   public class Solution {
       public static void main(String[] args) {
           List<Book> books = new LinkedList<Book>();
           books.add(new MarkTwainBook("Tom Sawyer"));
           books.add(new AgathaChristieBook("Hercule Poirot"));
           System.out.println(books);
       }

       abstract static class Book {
           private String author;

           public Book(String author) {
               this.author = author;
           }

           public abstract Book getBook();

           public abstract String getTitle();

           private String getOutputByBookType() {
               String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
               String markTwainOutput = getBook().getTitle() + " was written by " + author;


               //Add your code here
               String output = "output";
               if (getBook() instanceof AgathaChristieBook) output = agathaChristieOutput;
               else if (getBook() instanceof MarkTwainBook) output = markTwainOutput;

               return output;
           }

           public String toString() {
               return getOutputByBookType();
           }

       }

       public static class MarkTwainBook extends Book {
           private String title;

           public MarkTwainBook(String title) {
               super("Mark Twain");
               this.title = title;
           }

           @Override
           public MarkTwainBook getBook() {
               return this;
           }

           @Override
           public String getTitle() {
               return title;
           }
       }

       public static class AgathaChristieBook extends Book {
           private String title;
           public AgathaChristieBook(String title) {
               super("Agatha Christie");
               this.title = title;
           }

           @Override
           public Book getBook() {
               return this;
           }

           @Override
           public String getTitle() {
               return title;
           }
       }
   }

