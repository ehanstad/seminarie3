package se.kth.iv1350.forum.model;

/**
 * Sorts Topics in the specified order, equal Topics are sorted by name.
 */
public class TopicSorterResolveByNameComposite implements TopicSorter {
    private TopicSorter primarySorter;
    private TopicNameSorter nameSorter = new TopicNameSorter();

    public TopicSorterResolveByNameComposite(TopicSorter primarySorter) {
        this.primarySorter = primarySorter;
    }

    /**
     * Compares the two specified topics.
     *
     * @param topic1 The first topic to compare.
     * @param topic2 The second topic to compare.
     * @return a negative number if <code>topic1 &lt; topic2</code>, sorts by name if
     *         <code>topic1 = topic2</code>, a positive number if <code>topic1 &gt; topic2</code>.
     */
    @Override
    public int compare(TopicDTO topic1, TopicDTO topic2) {
        int primarySortResult = primarySorter.compare(topic1, topic2);
        if (primarySortResult == 0) {
            return nameSorter.compare(topic1, topic2);
        } else {
            return primarySortResult;
        }
    }
}
