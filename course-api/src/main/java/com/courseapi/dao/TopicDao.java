package com.courseapi.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import com.courseapi.model.Topic;

@Repository
public class TopicDao {

	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("Java","CoreJava","Java Description"),
			new Topic("Spring","Advance Java","Spring Description"),
			new Topic("Spring Boot","New One","Spring Boot Description"),
			new Topic("Rest","Cross Platform","Webservice")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		for(int i =0;i< topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				
				return t;
			}
		}
		return null;
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		 topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		
		for(int i =0;i< topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				
				topics.set(i, topic);
				return;
			}
		}
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		//topics.remove(getTopic(id));
	}
}
