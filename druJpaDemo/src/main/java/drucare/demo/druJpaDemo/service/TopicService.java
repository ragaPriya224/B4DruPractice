package drucare.demo.druJpaDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import drucare.demo.druJpaDemo.model.Topic;
import drucare.demo.druJpaDemo.repository.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;

//	List<Topic> topicList= new ArrayList(Arrays.asList(new Topic("100","hulk"),
//			new Topic("4","avengers"),
//			new Topic("100","spiderman")));

	public List<Topic> getAllTopics(){
//		return topicList;
	}

	public Topic getTopic(String topicId) {
		
		return topicRepository.findById(topicId).get();
		
		
		// TODO Auto-generated method stub
//		return topicList.stream().filter(t -> t.getId().equals(topicId))
//				.findFirst().get();
	}

	public void addTopic(Topic topic) {
//		topicList.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		
		topicRepository.save(topic);
		
		
//		for(int i=0;i<=topicList.size()-1;i++) {
//			Topic t=topicList.get(i);
//			if(t.getId().equals(id)) {
//				topicList.set(i, topic);
//			}
//		}
	}

	public void deleteTopic(String topicId) {
//		topicList.removeIf(data -> data.getId().equals(topicId));
	}


}
