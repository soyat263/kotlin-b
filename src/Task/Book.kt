package Task

class Book(val title: String, val author: String, val year: Int) {
}

abstract class Library {
    abstract fun addBook(book: Book)
    abstract fun viewAllBooks()
    abstract fun findBooksByAuthor(author: String)
}

class PublicLibrary : Library() {
    private val books = mutableListOf<Book>()

    override fun addBook(book: Book) {
        books.add(book)
    }

    override fun viewAllBooks() {
        for (book in books) {
            println("Title: ${book.title}, Author: ${book.author}, Year: ${book.year}")
        }
    }

    override fun findBooksByAuthor(author: String) {
        val foundBooks = books.filter { it.author == author }
        if (foundBooks.isEmpty()) {
            println("No books found by author: $author")
        } else {
            for (book in foundBooks) {
                println("Title: ${book.title}, Year: ${book.year}")
            }
        }
    }
}
