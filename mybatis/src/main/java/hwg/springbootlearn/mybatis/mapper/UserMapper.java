package hwg.springbootlearn.mybatis.mapper;


import hwg.springbootlearn.model.User;

import java.util.List;

/**
 * @Author: hwg
 * @Date: Create in 2019/12/23
 */
public interface UserMapper {
    List<User> getAllUser();
}
