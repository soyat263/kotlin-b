package books

import Task.Book

abstract class Library {
    abstract fun addBook(book: Book)
    abstract fun viewAllBooks()
    abstract fun findBookByAuthor(Author:String)
}