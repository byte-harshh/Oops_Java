package Basics;

public class Book{
	private String bookname;
	private int bookID;
	private Author author;

 public Book(String bookname,int bookID,Author author){
 	this.bookname = bookname;
 	this.bookID = bookID;
 	this.author = author;
 }
 @Override
 public String toString(){
    return "Book Name: "+bookname+"\n"+"Book ID: "+bookID+"\n"+"Author : "+author;
 }
}