package com.kangenh_spring6.bookstrap;

import com.kangenh_spring6.domain.Author;
import com.kangenh_spring6.domain.Book;
import com.kangenh_spring6.domain.Publisher;
import com.kangenh_spring6.repository.AuthorRepository;
import com.kangenh_spring6.repository.BookRepository;
import com.kangenh_spring6.repository.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    @Override
    public void run(String... args) {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Henry");

        Book add = new Book();
        add.setTitle("Domain Driven Design");
        add.setIsbn("123456");

        Author ericSaved = authorRepository.save(eric);
        Book addSaved = bookRepository.save(add);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johoson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE EJB");
        noEJB.setIsbn("567890");

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        ericSaved.getBooks().add(addSaved);
        rodSaved.getBooks().add(noEJBSaved);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);
        System.out.println("In Bootstrap");
        System.out.println("Author count : " + authorRepository.count() );
        System.out.println("Book count : " + bookRepository.count() );

        Publisher publisher = new Publisher();
        publisher.setPublisherName("MyPublisher");
        publisher.setAddress("123 Main");
        publisherRepository.save(publisher);

        System.out.println("Publisher Count " + publisherRepository.count() );
    }
}
