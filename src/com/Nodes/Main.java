package com.Nodes;

import javax.xml.soap.Node;

public class Main {

    public static void main(String[] args) {
        ListItem l1 = new ListItem(null,"kota");
        ListItem l2 = new ListItem(l1,"ma");
        ListItem l3 = new ListItem(l2,"Ala");

    ListItem current =l3;
    while(current != null);{
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}
