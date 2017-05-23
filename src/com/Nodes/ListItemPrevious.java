package com.Nodes;

/**
 * Created by RENT on 2017-05-23.
 */
public class ListItemPrevious {
    private ListItemPrevious previous;
    private Object data2;

    public ListItemPrevious(ListItemPrevious previous, ListItemPrevious data2){
        this.previous = previous;
        this.data2 = data2;
    }
    public Object getData2(){
        return this.data2;
    }
    public ListItemPrevious getPrevious(){
        return this.previous;
    }
}
