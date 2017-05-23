package com.Nodes;

public class Main {

    public static void main(String[] args) {
        ListItemNext l1 = new ListItemNext(null,"kota");
        ListItemNext l2 = new ListItemNext(l1,"ma");
        ListItemNext l3 = new ListItemNext(l2,"Ala");

    ListItemNext current =l3;
    while(current != null);{
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}
