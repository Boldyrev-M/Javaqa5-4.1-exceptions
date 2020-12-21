package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository repository = new ProductRepository();
    private Book coreJava = new Book();

    @Test
    public void shouldSaveOneItem() {
        repository.save(coreJava);
        Product[] expected = new Product[]{coreJava};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);

    }


  @Test
  void removeByIdCorrect() {
    Book book1 = new Book(1, "Book Name", 100, "A.S. Pushkin", 100, 1999);
    repository.save(book1);
    repository.removeById(1);
    Product[] expected = new Product[0];
    Product[] actual = repository.findAll();
    assertArrayEquals(expected, actual);

  }
  @Test
  void removeByIdWithException() {
    Book book2 = new Book(2, "Book Two Name", 100, "N.V. Gogol", 100, 1999);
    repository.save(book2);
      try {
          repository.removeById(1);
      }
      catch (Exception e) {

      }

  }
}
