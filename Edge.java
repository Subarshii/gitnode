package node;


import java.util.ArrayList;

public class Edge {


    private String activity;

    private int min;
    private int max;
    private Node node;
    private ArrayList<Node> nextnode = new ArrayList<Node>();

    String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }


    public int getMin() {
        return min;
    }

    public void setMin(int min) {

        this.min = min;
    }

    public int getMax() {

        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }


    Edge(String activity, int min, int max) {
        this.activity = activity;
        this.min = min;
        this.max = max;
    }


    Edge(Node node, String activity, int min, int max, Node nextnode) {
        this.activity = activity;
        this.min = min;
        this.max = max;
        this.node = node;
        this.setNextnode(nextnode);
    }

    Edge(String activity, int min, int max, Node nextnode) {
        this.activity = activity;
        this.min = min;
        this.max = max;
        this.setNextnode(nextnode);
    }

    Edge(Node node, String activity, int min, int max) {
        this.activity = activity;
        this.min = min;
        this.max = max;
        this.node = node;
    }

    public ArrayList<Node> getNextnode() {
        if (nextnode == null) {
            return null;
        }
        return this.nextnode;
    }

    public void setNextnode(Node node) {
        nextnode.add(node);
        this.node = node;
    }
}
