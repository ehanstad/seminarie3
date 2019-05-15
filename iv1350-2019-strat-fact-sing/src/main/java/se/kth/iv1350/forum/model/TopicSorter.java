package se.kth.iv1350.forum.model;

import java.util.Comparator;

/**
 * Defines the sorted order of two <code>Topic</code>s.
 */
public interface TopicSorter extends Comparator<TopicDTO>{
    /**
     * Compares the two specified topics.
     *
     * @param topic1 The first topic to compare.
     * @param topic2 The second topic to compare.
     * @return -1 if <code>topic1 &lt; topic2</code>, 0 if <code>topic1 = topic2</code>, 1 if
     *         <code>topic1 &gt; topic2</code>.
     */
    @Override
    public int compare(TopicDTO topic1, TopicDTO topic2);
}
