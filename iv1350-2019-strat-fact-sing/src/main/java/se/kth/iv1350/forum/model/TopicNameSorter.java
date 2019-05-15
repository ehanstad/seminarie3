package se.kth.iv1350.forum.model;

/**
 * Sorts topics by their names, in alphabetical order.
 */
public class TopicNameSorter implements TopicSorter {

    /**
     * Compares the two specified topics.
     *
     * @param topic1 The first topic to compare.
     * @param topic2 The second topic to compare.
     * @return -1 if <code>topic1 &lt; topic2</code>, 0 if <code>topic1 = topic2</code>, 1 if
     *         <code>topic1 &gt; topic2</code>.
     */
    @Override
    public int compare(TopicDTO topic1, TopicDTO topic2) {
        return topic1.getName().compareTo(topic2.getName());
    }

}
