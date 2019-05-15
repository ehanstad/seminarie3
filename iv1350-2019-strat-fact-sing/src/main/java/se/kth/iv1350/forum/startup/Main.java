package se.kth.iv1350.forum.startup;

import java.util.List;
import se.kth.iv1350.forum.controller.Controller;
import se.kth.iv1350.forum.model.TopicDTO;

/**
 * Start the entire application
 */
public class Main {
    /**
     * Starts the entire application.
     * 
     * @param args The program does not take any command line parameters.
     */
    public static void main(String[] args) {
        String[] topicNames = {"TopicC", "TopicB", "TopicA"};
        Controller contr = new Controller();
        
        for (String topicName : topicNames) {
            contr.createTopic(topicName);
        }
        
        contr.addStar("TopicB");
        contr.addStar("TopicB");
        contr.addStar("TopicC");
        contr.addView("TopicA");
        contr.addView("TopicA");
        contr.addView("TopicC");
        contr.addView("TopicC");
        
        List<TopicDTO> topicsToDisplay = contr.getTopicsToDisplay();
        for (TopicDTO topic : topicsToDisplay) {
            System.out.println(topic.getName());
        }        
    }
}
