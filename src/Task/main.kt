package Task

fun main() {

    val library = PublicLibrary()


    val book1 = Book("Kotlin Programming", "John Doe", 2020)
    val book2 = Book("Learning Java", "Jane Smith", 2021)
    val book3 = Book("Advanced Kotlin", "John Doe", 2022)


    library.addBook(book1)
    library.addBook(book2)
    library.addBook(book3)


    println("All books in the library:")
    library.viewAllBooks()

    val authorToFind = "John Doe"
    println("\nBooks by author $authorToFind:")
    library.findBooksByAuthor(authorToFind)
}
