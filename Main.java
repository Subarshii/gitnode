package node;


import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<Node> nodes = new ArrayList<>();

        Node n1 = new Node("1");
        Node n2 = new Node("2");
        Node n3 = new Node("3");
        Node n4 = new Node("4");
        Node n5 = new Node("5");
        Node n6 = new Node("6");


        Edge edge1 = new Edge(n1, "A", 3, 5, n2);
        Edge edge2 = new Edge(n1, "B", 4, 7, n3);
        Edge edge3 = new Edge(n2, "C", 2, 5, n4);
        Edge edge4 = new Edge(n3, "D", 0, 0, n2);
        Edge edge5 = new Edge(n4, "E", 3, 4, n5);
        Edge edge6 = new Edge(n5, "F", 5, 8, n6);
        n1.setListedges(edge1);
        n1.setListedges(edge2);
        n2.setListedges(edge3);
        n3.setListedges(edge4);
        n4.setListedges(edge5);
        n5.setListedges(edge6);

        edge1.setNextnode(n2);
        edge2.setNextnode(n3);
        edge3.setNextnode(n4);
        edge4.setNextnode(n2);
        edge5.setNextnode(n5);


        nodes.add(n1);
        nodes.add(n2);
        nodes.add(n3);
        nodes.add(n4);
        nodes.add(n5);
        nodes.add(n6);
        System.out.print(n1.getName());
        System.out.print(" edge " + n1.getListedges().get(0).getActivity());
        System.out.print(" value min = " + n1.getListedges().get(0).getMin() + "value  max =" + n1.getListedges().get(0).getMax() + "\nand ");
        System.out.print(" edge " + n1.getListedges().get(1).getActivity());
        System.out.print(" value  min " + n1.getListedges().get(1).getMin() + " value max = " + n1.getListedges().get(0).getMax() + "\n");

        System.out.print(n2.getName());
        System.out.print(" edge " + n2.getListedges().get(0).getActivity());
        System.out.print(" value  min " + n2.getListedges().get(0).getMin() + " value max = " + n2.getListedges().get(0).getMax() + "\n");


        System.out.print(n3.getName());
        System.out.print(" edge " + n3.getListedges().get(0).getActivity());
        System.out.print(" value  min " + n3.getListedges().get(0).getMin() + " value max = " + n3.getListedges().get(0).getMax() + "\n");


        System.out.print(n4.getName());
        System.out.print(" edge " + n4.getListedges().get(0).getActivity());
        System.out.print(" value  min " + n4.getListedges().get(0).getMin() + " value max = " + n4.getListedges().get(0).getMax() + "\n");

        System.out.print(n5.getName());
        System.out.print(" edge " + n5.getListedges().get(0).getActivity());
        System.out.print(" value  min " + n5.getListedges().get(0).getMin() + " value max = " + n5.getListedges().get(0).getMax() + "\n");

        System.out.print(n6.getName());
        System.out.print(" dont have edge \n");

        System.out.println("long time");
        for (Node n : nodes) {
            for (int i = 0; i < n.getListedges().size(); i++) {
                if (n.getListedges().get(i) != n1.getListedges().get(0)) {

                    System.out.print( " " +n.getListedges().get(i).getActivity()
                            + ":" + n.getListedges().get(i).getMin()
                            + "-" + n.getListedges().get(i).getMax()
                            + " node " + n.getListedges().get(i).getNextnode().get(i).getName());

                }
            }
        }
        System.out.println("\n");
        System.out.println("short time");
        for (Node n : nodes) {
            for (int i = 0; i < n.getListedges().size(); i++) {
                if (n.getListedges().get(i) != n1.getListedges().get(1)
                        && n.getListedges().get(i) != n3.getListedges().get(0)) {

                    System.out.print(" " + n.getListedges().get(i).getActivity()
                            + ":" + n.getListedges().get(i).getMin()
                            + "-" + n.getListedges().get(i).getMax()
                            + " node " + n.getListedges().get(i).getNextnode().get(i).getName() );

                }
            }
        }

    }

}

