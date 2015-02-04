package hello.list;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ListRepository extends MongoRepository<list, String> {

    public list findByCode(String code);
   

}
