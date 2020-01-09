class Storage {
private int product=0;

public synchronized void get(){
    while (product<1){
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    product--;
    System.out.println("Got 1 product ");
    System.out.println("Products on Storage "+product);
    notify();
}
public synchronized void put(){
    while (product>=2){
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        product++;
        System.out.println("Added 1 product");
        System.out.println("Products on storage "+product);
        notify();
    }
}

}
