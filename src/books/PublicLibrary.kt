//package books
//
//class PublicLibrary:Library() {
//    private val books = mutableListOf<Book>()
//
//    override fun addBook(book: Task.Book) {
//        books.add(book)
//    }
//
//    override fun viewAllBooks() {
//        for (book in books) {
//            println("title: ${book.title}")
//            println("Author: ${book.author}")
//            println("Year: ${book.year}")
//
//    }
//}
//
// override fun findBookByAuthor(author: String){
//     for (book in books){
//         if (book.author == author){
//             println("title: ${book.title}")
//             println("Author: ${book.author}")
//             println("Year: ${book.year}")
//         }
//     }
// }