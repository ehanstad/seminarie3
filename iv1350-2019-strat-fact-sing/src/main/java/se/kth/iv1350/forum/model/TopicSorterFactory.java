package se.kth.iv1350.forum.model;

/**
 * Creates implementations of <code>TopicSorter</code>, to sort topics in the decided order.
 */
public class TopicSorterFactory {
    private static final String TOPIC_SORTER_CLASS_PROPERTY = "topicsorter.name";
    private static final TopicSorterFactory FACTORY_INSTANCE = new TopicSorterFactory();

    /**
     * No other class is allowed to instantiate this singleton.
     */
    private TopicSorterFactory() {
    }

    /**
     * @return The only existing instance of this singleton.
     */
    public static TopicSorterFactory getFactory() {
        return FACTORY_INSTANCE;
    }

    public TopicSorter getTopicSorter() throws SorterException {
        String topicSorterClass = System.getProperty(TOPIC_SORTER_CLASS_PROPERTY);
        try {
            Class TopicSorterImpl = Class.forName(topicSorterClass);
            TopicSorter topicSorter = (TopicSorter) TopicSorterImpl.getDeclaredConstructor().
                    newInstance();
            return new TopicSorterResolveByNameComposite(topicSorter);
        } catch (Exception ex) {
            throw new SorterException("Could not create the decired sorter.");
        }
    }
}
