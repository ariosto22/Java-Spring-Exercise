package co.develhope.NoSQL_Orm_Exercise.repositories;

import co.develhope.NoSQL_Orm_Exercise.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
