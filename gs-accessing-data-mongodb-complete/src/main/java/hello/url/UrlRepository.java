package hello.url;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<url, String> {

    public url findByCode(String code);
   

}
