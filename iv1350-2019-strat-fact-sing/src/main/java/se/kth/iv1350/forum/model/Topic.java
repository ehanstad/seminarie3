package se.kth.iv1350.forum.model;

import java.time.Instant;

/**
 * A discussion topic in the forum.
 */
class Topic {
    private int stars;
    private int views;
    private Instant creationTime;
    private String name;
    
    /**
     * Creates a new instance with the specified name. CreationTime is set to the time when this
     * constructor is executed.
     * 
     * @param name The topic name. 
     */
    Topic(String name) {
        this.name = name;
        creationTime = Instant.now();
    }
    
    /**
     * Increments the number of stars.
     */
    void addStar() {
        stars++;
    }
    
    /**
     * Increments the number of views.
     */
    void addView() {
        views++;
    }
    
    TopicDTO getState() {
        return new TopicDTO(stars, views, creationTime, name);
    }
}