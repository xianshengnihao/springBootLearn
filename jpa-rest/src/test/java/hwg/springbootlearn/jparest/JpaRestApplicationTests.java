package hwg.springbootlearn.jparest;

import hwg.springbootlearn.jparest.bean.Book;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaRestApplicationTests {

    @Test
    void contextLoads() {
        Book book = new Book();
        book.setAuthor("郝维格");
    }

}
