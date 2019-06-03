package com.courseapi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courseapi.dao.TopicDao;
import com.courseapi.model.Topic;

@Service
public class TopicService {

	@Autowired
	TopicDao topicDao;
	
	public List<Topic> getAllTopics(){
		return topicDao.getAllTopics();
	}
	
	public Topic getTopic(String id) {
		return topicDao.getTopic(id);
	}

	public void addTopic(Topic topic) {
		topicDao.addTopic(topic);
	}

	public void updateTopic(Topic topic, String id) {
		topicDao.updateTopic(topic, id);
		
	}

	public void deleteTopic(String id) {
		topicDao.deleteTopic(id);
	}
}
