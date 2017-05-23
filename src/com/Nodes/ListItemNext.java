package com.Nodes;

/**
 * Created by RENT on 2017-05-23.
 */
public class ListItemNext {
    private ListItemNext next;
    private Object data;

    public ListItemNext(ListItemNext next, Object data){
        this.next=next;
        this.data=data;
    }
    public Object getData(){
        return this.data;

    }
    public ListItemNext getNext(){
        return this.next;
    }
}
