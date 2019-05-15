package se.kth.iv1350.forum.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Holds all topics in the forum.
 */
public class Forum {
    private Map<String, Topic> topics = new HashMap<>();

    /**
     * Creates a new topic with the specified name.
     *
     * @param name The name of the newly created topic.
     */
    public void createTopic(String name) {
        Topic newTopic = new Topic(name);
        topics.put(name, new Topic(name));
    }

    /**
     * @return A list of all topics.
     */
    public List<TopicDTO> findAllTopics() {
        List<TopicDTO> allTopics = new ArrayList<>();
        
        for (Topic topic : topics.values()) {
            allTopics.add(topic.getState());
        }
        
        return allTopics;
    }

    /**
     * Increments the number of stars of the specified topic.
     *
     * @param topicName The name of the topic to which a star shall be added.
     */
    public void addStar(String topicName) {
        topics.get(topicName).addStar();
    }

    /**
     * Increments the number of views of the specified topic.
     *
     * @param topicName The name of the topic to which a star shall be added.
     */
    public void addView(String topicName) {
        topics.get(topicName).addView();
    }

}
