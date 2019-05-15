package se.kth.iv1350.forum.model;

import java.time.Instant;

/**
 * The state of a particular topic.
 */
public class TopicDTO {
    private int stars;
    private int views;
    private Instant creationTime;
    private String name;

    /**
     * Creates a new instance with the specified state.
     * 
     * @param stars The number of stars.
     * @param views The number of views.
     * @param creationTime The time the topic was first created.
     * @param name The topic's name.
     */
    public TopicDTO(int stars, int views, Instant creationTime, String name) {
        this.stars = stars;
        this.views = views;
        this.creationTime = creationTime;
        this.name = name;
    }

    /**
     * @return The number of stars.
     */
    public int getStars() {
        return stars;
    }

    /**
     * @return The number of views.
     */
    public int getViews() {
        return views;
    }

    /**
     * @return The time this topic was created.
     */
    public Instant getCreationTime() {
        return creationTime;
    }

    /**
     * @return The topic's name.
     */
    public String getName() {
        return name;
    }
    
    
}
