package tnv.springframework.springwebapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tnv.springframework.springwebapp.domain.Author;
import tnv.springframework.springwebapp.domain.Book;
import tnv.springframework.springwebapp.domain.Publisher;
import tnv.springframework.springwebapp.domain.repositories.AuthorRepository;
import tnv.springframework.springwebapp.domain.repositories.BookRepository;
import tnv.springframework.springwebapp.domain.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher publisher1 = new Publisher("ABC", "2424", "Dhaka", "Dhaka", "1230");
        publisherRepository.save(publisher1);

        Author author = new Author("Ricky", "Mohtasin");
        Book tmlf = new Book("Toxic male life fantasy", "5535342");
        author.getBookList().add(tmlf);
        tmlf.getAuthors().add(author);

        tmlf.setPublisher(publisher1);
        publisher1.getBookList().add(tmlf);

        authorRepository.save(author);
        bookRepository.save(tmlf);
        publisherRepository.save(publisher1);

        Author author2 = new Author("Tanveer", "Zaman");
        Book iws = new Book("In the Woods Somewhere", "58395");
        author2.getBookList().add(iws);
        iws.getAuthors().add(author2);
        iws.setPublisher(publisher1);
        publisher1.getBookList().add(iws);

        authorRepository.save(author2);
        bookRepository.save(iws);
        publisherRepository.save(publisher1);

        System.out.println("Started in BootStrap!!");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Number of Publishers: " + publisher1.getBookList().size());


    }
}
