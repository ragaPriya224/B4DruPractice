package com.drucare.druSpringBootDemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.drucare.druSpringBootDemo.model.Topic;

@Service
public class TopicService {
	
	List<Topic> topicList= new ArrayList(Arrays.asList(new Topic("100","hulk"),
			new Topic("4","avengers"),
			new Topic("100","spiderman")));
	
	public List<Topic> getAllTopics(){
		return topicList;
	}

	public Topic getTopic(String topicId) {
		// TODO Auto-generated method stub
		return topicList.stream().filter(t -> t.getId().equals(topicId))
				.findFirst().get();
	}

	public void addTopic(Topic topic) {
		topicList.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		
		
	}
	
	
}
