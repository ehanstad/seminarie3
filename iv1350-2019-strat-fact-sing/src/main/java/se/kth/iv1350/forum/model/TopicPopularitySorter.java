package se.kth.iv1350.forum.model;

/**
 * Sort topics by the number of stars.
 */
public class TopicPopularitySorter implements TopicSorter {
    /**
     * Compares the two specified topics.
     *
     * @param topic1 The first topic to compare.
     * @param topic2 The second topic to compare.
     * @return a negative number if <code>topic1 &lt; topic2</code>, 0 if
     *         <code>topic1 = topic2</code>, a positive number if <code>topic1 &gt; topic2</code>.
     */
    @Override
    public int compare(TopicDTO topic1, TopicDTO topic2) {
        return topic2.getStars() - topic1.getStars();
    }

}
