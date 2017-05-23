package com.Nodes;

/**
 * Created by RENT on 2017-05-23.
 */
public class ListItem {
    private ListItem next;
    private Object data;

    public ListItem(ListItem next,Object data){
        this.next=next;
        this.data=data;
    }
    public Object getData(){
        return this.data;

    }
    public ListItem getNext(){
        return this.next;
    }
}
