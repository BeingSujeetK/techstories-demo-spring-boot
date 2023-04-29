package online.techstories.demo.graphqlapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import online.techstories.demo.graphqlapi.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}