class book {
    public String Title;
    public String Author;
    public String Publisher;
    public String Edition;
    public String ISBN;
    public String Genre;
    public int  PublicationDate;

    public book(String Title, String Author, String Publisher, String Edition, String ISBN, String Genre, int PublicationDate) {
        this.Title=Title;
        this.Author=Author;
        this.Publisher=Publisher;
        this.Edition=Edition;
        this.ISBN=ISBN;
        this.Genre=Genre;
        this.PublicationDate=PublicationDate;
    }
    public void display(){
        System.out.println ("Title: "+Title);
        System.out.println ("Author: "+Author);
        System.out.println ("Publisher: "+Publisher);
        System.out.println ("Edition: "+Edition);
        System.out.println ("ISBN: "+ISBN);
        System.out.println ("Genre: "+Genre);
        System.out.println ("Publication Date: "+PublicationDate);
    }
}

public class library
{
    public static void main(String[] args) {
        book book1 = new book("Harry Potter", "J.K. Rowling", "Blooms", "1st", "123456789", "Fantasy", 1997);
        book book2 = new book("The Hobbit", "J.R.R. Tolkien", "HarperCollins", "3rd", "987654321", "Fantasy", 1937);
        book book3 = new book("1984", "George Orwell", "Secker & Warburg", "1st", "9780451524935", "Dystopian", 1949);
        book book4 = new book("To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", "1st", "9780061120084", "Fiction", 1960);
        book book5 = new book("Pride and Prejudice", "Jane Austen", "T. Egerton", "1st", "9780141439518", "Romance", 1813);
        book book6 = new book("The Great Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons", "1st", "9780743273565", "Fiction", 1925);
        book book7 = new book("Moby Dick", "Herman Melville", "Harper & Brothers", "1st", "9781503280786", "Adventure", 1851);
        book book8 = new book("War and Peace", "Leo Tolstoy", "The Russian Messenger", "1st", "9780199232765", "Historical", 1869);
        book book9 = new book("The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", "1st", "9780316769488", "Fiction", 1951);
        book book10 = new book("The Alchemist", "Paulo Coelho", "HarperOne", "1st", "9780061122415", "Fiction", 1988);

        book1.display();
        book2.display();
        book3.display();
        book4.display();
        book5.display();
        book6.display();
        book7.display();
        book8.display();
        book9.display();
        book10.display();

    }
}