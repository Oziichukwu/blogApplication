package africa.semicolon.blogApplication.data.repositories;

import africa.semicolon.blogApplication.data.models.Author;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorRepositoryImplTest {

    AuthorRepository authorRepository;
    @BeforeEach
    void setUp() {
        authorRepository = new AuthorRepositoryImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {
        Author author = new Author();
        author.setFirstName("Goodnews");
        author.setLastName("Moses");
        author.setProfession("SoftWare Engineer");
        author.setEmail("ukaegbu.gboy@gmail.com");
        author.setUserName("goodnews123");
        author.setAuthorId("3210");
       Author savedAuthor = authorRepository.save(author);
        assertEquals(author, savedAuthor);
        assertEquals(1, authorRepository.findAll().size());
    }

    public Author savedAuthorTest(){
        Author author = new Author();
        author.setFirstName("Goodnews");
        author.setLastName("Moses");
        author.setProfession("SoftWare Engineer");
        author.setEmail("ukaegbu.gboy@gmail.com");
        author.setUserName("goodnews123");
        author.setAuthorId("3210");
        return authorRepository.save(author);
    }

    @Test
    void findByAuthorId() {
        Author savedAuthor = savedAuthorTest();
        assertEquals(savedAuthor, authorRepository.findByAuthorId(savedAuthor.getAuthorId()).get());
    }

    @Test
    void delete() {
        Author savedAuthor = savedAuthorTest();
        authorRepository.delete(savedAuthor);
        assertEquals(0, authorRepository.findAll().size());
    }

    @Test
    void testDelete() {
        Author savedAuthor = savedAuthorTest();
        authorRepository.delete(savedAuthor);
        assertEquals(0, authorRepository.findAll().size());
    }

    @Test
    void deleteAll() {
        Author savedAuthor = savedAuthorTest();
        authorRepository.deleteAll();
        assertEquals(0, authorRepository.findAll().size());
    }
}