package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by corycordell on 2/26/17.
 */
public class AbstractGraph<T extends Comparable<T>, D extends Comparable<D>, W extends Number> {
    protected boolean isDirected = false;
    protected boolean isWeighted = false;
    protected boolean hasNegativeWeights = false;
    protected boolean isCyclic = false;
    protected HashMap<T, D> vertices = new HashMap();

    public AbstractGraph(AbstractNode<T> node, AbstractEdge<T,W> edge) {
        super();
    }

    public AbstractGraph(AbstractNode<T> node, AbstractEdge<T,W> edge, boolean directed, boolean weighted) {
        this(node, edge);
        isDirected = directed;
        isWeighted = weighted;
    }

    public void addNode() {

    }

    public void removeNode() {

    }
}
