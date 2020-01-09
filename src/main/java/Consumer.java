class Consumer extends Thread {
Storage storage;
Consumer(Storage storage){
    this.storage=storage;
}

    @Override
    public void run() {
        for(int i=1;i<5;i++){
            storage.get();
        }
    }
}
