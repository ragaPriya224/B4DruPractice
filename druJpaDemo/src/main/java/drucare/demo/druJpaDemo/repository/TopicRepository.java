package drucare.demo.druJpaDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import drucare.demo.druJpaDemo.model.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic, String>{

}
