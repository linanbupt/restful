package hello;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface XiangqingRepository extends MongoRepository<Xiangqing, String> {

    public Xiangqing findByCode(String code);
   

}
