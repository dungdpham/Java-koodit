public class Main {
    public static void main(String[] args) {
        ArrayListThreadSafe<String> arrayList = new ArrayListThreadSafe<>();

        Thread add = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                arrayList.addElement("Element " + i);
                System.out.println("Add element " + i);
            }
        });

        Thread remove = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                arrayList.removeElement("Element " + i);
                System.out.println("Remove element " + i);
            }
        });

        add.start();
        remove.start();

        try {
            add.join();
            remove.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Size: " + arrayList.getSize());
    }
}
