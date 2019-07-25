package node;


import java.util.ArrayList;

public class Node {


    private Edge edge;
    private String name;
    private ArrayList<Edge> listedges = new ArrayList<Edge>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node(String name) {
        this.name = name;
    }


    public void setListedges(Edge edge) {
        listedges.add(edge);
        this.edge = edge;
    }

    public ArrayList<Edge> getListedges() {
        return this.listedges;

    }

}
