package tnv.springframework.springwebapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tnv.springframework.springwebapp.domain.Author;
import tnv.springframework.springwebapp.domain.Book;
import tnv.springframework.springwebapp.domain.repositories.AuthorRepository;
import tnv.springframework.springwebapp.domain.repositories.BookRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author = new Author("Ricky", "Mohtasin");
        Book tmlf = new Book("Toxic male life fantasy", "5535342");
        author.getBookList().add(tmlf);
        tmlf.getAuthors().add(author);

        authorRepository.save(author);
        bookRepository.save(tmlf);

        Author author2 = new Author("Tanveer", "Zaman");
        Book iws = new Book("In the Woods Somewhere", "58395");
        author2.getBookList().add(iws);
        iws.getAuthors().add(author2);

        authorRepository.save(author2);
        bookRepository.save(iws);

        System.out.println("Started in BootStrap!!");
        System.out.println("Number of Books: " + bookRepository.count());


    }
}
