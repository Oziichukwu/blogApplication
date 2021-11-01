package africa.semicolon.blogApplication.data.repositories;

import africa.semicolon.blogApplication.data.models.Author;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AuthorRepositoriesImplTest {
        AuthorRepository authorRepository;
        @BeforeEach

        void setUp(){
            authorRepository = new AuthorRepositoryImpl();
        }
        @Test
        void save() {
            Author author = new Author();
            author.setFirstName("Goodnews");
            author.setLastName("Moses");
            author.setEmail("ukaegbu.gboy@gmail.com");
            author.setUserName("goodnews123");
            author.setAuthorId("3210");
            Author savedAuthor = authorRepository.save(author);
            assertEquals(author, savedAuthor);
        }

        @Test
        void findByAuthorId() {
            Author author = new Author();
            author.setFirstName("Goodnews");
            author.setLastName("Moses");
            author.setEmail("ukaegbu.gboy@gmail.com");
            author.setUserName("goodnews123");
            author.setAuthorId("3210");
            Author savedAuthor = authorRepository.save(author);
            Author foundAuthor = authorRepository.findByAuthorId("3210");
            assertEquals(savedAuthor, foundAuthor);

        }

        @Test
        void delete() {

            Author author = new Author();
            author.setFirstName("Goodnews");
            author.setLastName("Moses");
            author.setEmail("ukaegbu.gboy@gmail.com");
            author.setUserName("goodnews123");
            author.setAuthorId("3210");
            authorRepository.save(author);
            assertNotNull(authorRepository.findByAuthorId("3210"));
            authorRepository.delete(author);
            assertNull(authorRepository.findByAuthorId("3210"));

        }

        @Test
        void testDelete() {

            Author author = new Author();
            author.setFirstName("Goodnews");
            author.setLastName("Moses");
            author.setEmail("ukaegbu.gboy@gmail.com");
            author.setUserName("goodnews123");
            author.setAuthorId("3210");
            authorRepository.save(author);
            assertNotNull(authorRepository.findByAuthorId("3210"));
            authorRepository.delete("3210");
            assertNull(authorRepository.findByAuthorId("3210"));
        }

        @Test
        void findAll() {
            Author author = new Author();
            author.setFirstName("Goodnews");
            author.setLastName("Moses");
            author.setEmail("ukaegbu.gboy@gmail.com");
            author.setUserName("goodnews123");
            author.setAuthorId("3210");
            authorRepository.save(author);
            authorRepository.save(author);
            authorRepository.save(author);
            authorRepository.save(author);
            assertEquals(4, authorRepository.findAll().size());
        }
    }

