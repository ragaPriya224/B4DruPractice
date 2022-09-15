package com.drucare.druSpringBootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.druSpringBootDemo.model.Topic;
import com.drucare.druSpringBootDemo.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	TopicService topicservice;
	
	@GetMapping("/topic")
	public List<Topic> getAllTopics(){
		return topicservice.getAllTopics();
	}
	@GetMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String  id){
		return topicservice.getTopic(id);
	}
	@PostMapping("/topic")
	public void addTopic(@RequestBody Topic topic){
		 topicservice.addTopic(topic);
	}
	@PutMapping("/topic/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String  id) {
		 topicservice.updateTopic(topic,id);
	}
	
}
