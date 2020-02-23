package adt;

public class Node {
    /***
     * class to creat nodes for linked list
     */

    public String f_name , l_name,Email;
    public long[] no=new long[2];
    public int index;
    private Node next;
    public Node(String f_name ,String l_name, long[] no,String Email){//a constructor of Node class
        this.f_name=f_name;
        this.l_name=l_name;
        for(int i =0;i<2;i++) {
            this.no[i] = no[i];
        }
        this.Email=Email;
        //this.index=0;
        setNext(null);
    }
    public Node getNext() {
        //getter
        return next;
    }
    public void setNext(Node next) {
        //setter
        this.next = next;
    }
}
