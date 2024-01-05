
package ogrencikayithash;


public class Hash {
    Node dizi[];
    int size;
    
    
    public Hash(int size){
        this.size=size;
        dizi=new Node[size];
        for(int i=0;i<size;i++){
            dizi[i]=new Node();
        }
    }
    
    
    int indisUret(int no){
        return no % size;
    }
    
    
    void ekle(int no,String ad,int ort){
        int indis=indisUret(no);
        Node ogrenci = new Node(no,ad,ort);
        Node temp=dizi[indis];
        
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=ogrenci;
        System.out.println(ad+ " Eklendi.");
    }
    
    
    void sil(int no){
        int indis=indisUret(no);
        Node temp=dizi[indis];
        Node temp2=temp;
        boolean sonuc=false;
        
        if(temp.next!=null){
            sonuc=true;
            System.out.println(no+ " Numarali Ogrenci Yok.");
        }
        
        else if(temp.next.next==null && temp.next.no==no){
            sonuc=true;
            temp.next=null;
            System.out.println(no+ " Numarali Ogrenci Silindi.");
        }
        
        else{
            while(temp.next!=null){
                temp2=temp;
                temp=temp.next;
                
                if(temp.no==no){
                    sonuc=true;
                    temp2.next=temp.next;
                    System.out.println(no+" Numarali Ogrenci Silindi.");
                }
            }
        }
        
        if(sonuc==false){
            System.out.println(no+ " Numarali Ogrencinin Kaydina Ulasilamadi!");
        }
    }
    
    
    void yazdir(){
        System.out.println("Kayitli Ogrencinin Bilgileri");
        for(int i=0;i<size;i++){
            Node temp=dizi[i];
            
            while(temp.next!=null){
                System.out.println(temp.next.no + "\t" + temp.next.ad + "\t" + temp.next.ort + "\t" + temp.next.durum);
                temp=temp.next;
            }
        }
    }
    
    
    void ara(int no){
        boolean sonuc=false;
        int indis=indisUret(no);
        Node temp=dizi[indis];
        
        while(temp.next!=null){
            if(temp.next.no==no){
                sonuc=true;
                System.out.println(no+ " Numarali Ogrenci Bilgileri:");
                System.out.println("Numarali Ogrenci Bilgileri: "+temp.next.ad);
                System.out.println("Numarali Ogrenci Bilgileri: "+temp.next.ort);
                System.out.println("Numarali Ogrenci Bilgileri: "+temp.next.durum);
                break;
            }
            temp=temp.next;
        }
        
        if(sonuc==false){
            System.out.println(no+ " Numarali Ogrencinin Kaydina Ulasilamadi!");
        }
        
        
    }
    
    
}
