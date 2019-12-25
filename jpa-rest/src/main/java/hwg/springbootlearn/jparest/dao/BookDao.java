package hwg.springbootlearn.jparest.dao;

import hwg.springbootlearn.jparest.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: hwg
 * @Date: Create in 2019/12/24
 */
public interface BookDao extends JpaRepository<Book,Integer> {
}
