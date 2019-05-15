package se.kth.iv1350.forum.controller;

import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import se.kth.iv1350.forum.model.Forum;
import se.kth.iv1350.forum.model.SorterException;
import se.kth.iv1350.forum.model.TopicDTO;
import se.kth.iv1350.forum.model.TopicSorterFactory;

/**
 * This is the application's controller. All calls to the model pass through here.
 */
public class Controller {
    private Forum forum;

    /**
     * Instantiates a new controller with an empty forum;
     */
    public Controller() {
        forum = new Forum();
    }

    /**
     * @return A list of all topics to display, sorted in the order they shall be displayed.
     */
    public List<TopicDTO> getTopicsToDisplay() {
        List<TopicDTO> topics = forum.findAllTopics();
                
        try {
            Collections.sort(topics, TopicSorterFactory.getFactory().getTopicSorter());
        } catch (SorterException ex) {
            ex.printStackTrace(); // THIS SHOULD BE REPLACED WITH A MESSAGE ADATPED TO THE USER.
        }
        return topics;
    }

    /**
     * Creates a new topic with the specified name.
     *
     * @param name The name of the newly created topic.
     */
    public void createTopic(String name) {
        forum.createTopic(name);
    }

    /**
     * Increments the number of stars of the specified topic.
     * 
     * @param topicName The name of the topic to which a star shall be added.
     */
    public void addStar(String topicName) {
        forum.addStar(topicName);
    }

    /**
     * Increments the number of views of the specified topic.
     * 
     * @param topicName The name of the topic to which a star shall be added.
     */
    public void addView(String topicName) {
        forum.addView(topicName);
    }
}
