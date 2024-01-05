
package ogrencikayithash;


public class Node {
    int no;
    String ad;
    int ort;
    String durum;
    Node next;
    
    public Node(){
        next=null;
    }
    
    public Node(int no,String ad,int ort){
        this.no=no;
        this.ad=ad;
        this.ort=ort;
        this.durum=ort<50 ? "Kaldi" : "Gecti";
    }
}
