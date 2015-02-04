package hello.lanmu1;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LanmuRepository extends MongoRepository<lanmu1, String> {

    public lanmu1 findByCode(String code);
    
    
    
    
    
    
}
