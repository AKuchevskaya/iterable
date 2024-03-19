package iterable;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myDocuments = new MyLinkedList<>();

        myDocuments.add("Passport");
        myDocuments.add("Driver license");
        myDocuments.add("Medical insurance");
        myDocuments.add("International passport");
        myDocuments.add("Birth certificate");
        myDocuments.add("Marriage certificate");

        System.out.println("Список документов: ");
        myDocuments.getDocuments();
        
        System.out.println();

        myDocuments.remove("Medical insurance");

        System.out.println("Список документов после удаления: ");
        myDocuments.getDocuments();
    }
}