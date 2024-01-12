package ro.uvt.info.sp_lab.example.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import ro.uvt.info.sp_lab.models.Book;
import ro.uvt.info.sp_lab.persistence.BooksRepository;
import ro.uvt.info.sp_lab.services.AllBooksSubject;
import ro.uvt.info.sp_lab.services.NewBookRequest;
import ro.uvt.info.sp_lab.services.SseObserver;

@RestController
@RequestMapping("/books-sse")
public class BooksSseController {

    private  AllBooksSubject allBooksSubject;

    private final BooksRepository booksRepository;

    public BooksSseController(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @GetMapping
    public ResponseBodyEmitter getBooksSse() {
        final SseEmitter emitter = new SseEmitter(0L);
        allBooksSubject.registerObserver(new SseObserver(emitter));
        return emitter;
    }

    @PostMapping
    public String newBook(@RequestBody NewBookRequest newBookRequest) {
        Book book = createBook(newBookRequest);
        book = booksRepository.save(book);
        allBooksSubject.add(book);
        return "Book saved [" + book.getId() + "] " + book.getTitle();
    }

    private Book createBook(NewBookRequest newBookRequest) {
        return null;
    }


}
