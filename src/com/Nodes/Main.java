package com.Nodes;

public class Main {

    public static void main(String[] args) {
        ListItemNext l1 = new ListItemNext(null, "kota");
        ListItemNext l2 = new ListItemNext(l1, "ma");
        ListItemNext l3 = new ListItemNext(l2, "Ala");
        ListItemPrevious l4 = new ListItemPrevious(null, "KOTA");
        ListItemPrevious l5 = new ListItemPrevious(l4,"MA");
        ListItemPrevious l6 = new ListItemPrevious(l5,"ALA?");


   /* ListItemNext current =l3;
    while(current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }*/
    ListItemPrevious current = l4;
    while(current !=null){
        System.out.println(current.getData2());
        current = current.getPrevious();
    }}}
