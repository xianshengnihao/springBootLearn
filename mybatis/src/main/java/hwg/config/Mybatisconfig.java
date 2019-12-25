package hwg.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @Author: hwg
 * @Date: Create in 2019/12/23
 */
@Configuration
@MapperScan(basePackages = "hwg.springbootlearn.mybatis.mapper",sqlSessionFactoryRef = "sqlSessionFactory")
public class Mybatisconfig {
    @Resource
    private DatasourceConfig datasourceConfig;

    @Bean
    SqlSessionFactory sqlSessionFactory(){
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(datasourceConfig.setDataSource());
        try {
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

