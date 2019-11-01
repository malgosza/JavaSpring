package kodzik.Booki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//kontrolery zawsze restowe
@RestController
@RequestMapping
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable Integer id) {
        return bookRepository.findById(id).get();
    }
}
