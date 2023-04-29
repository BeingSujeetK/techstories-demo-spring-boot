package online.techstories.demo.graphqlapi.resolver;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import online.techstories.demo.graphqlapi.entity.Book;
import online.techstories.demo.graphqlapi.repository.BookRepository;

@Component
public class BookResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

  private final BookRepository bookRepository;

  public BookResolver(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public List<Book> books() {
    return bookRepository.findAll();
  }

  public Book addBook(String title, String author) {
    Book book = new Book();
    book.setTitle(title);
    book.setAuthor(author);
    bookRepository.save(book);
    return book;
  }

}