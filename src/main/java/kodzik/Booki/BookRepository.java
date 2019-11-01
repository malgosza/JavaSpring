package kodzik.Booki;

import org.springframework.data.repository.CrudRepository;

//umozliwia dostep do tabeli czyli np. find all, delet update
public interface BookRepository extends CrudRepository<Book, Integer> {
}
