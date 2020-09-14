package fr.ubordeaux.ao;

public class Main {
    private static  final int MAX = Integer.MAX_VALUE;
    public static void main(String[] args) {
        ContactSet contactSet = new ContactSet();

        for (int i=0; i < MAX ; i++) {
            try {
                Town talence = new Town("Talence", 33405);
                Address address = new Address(351, "Cours de la libération", talence);
                Contact newContact = new Contact("John", "Do", address);
                contactSet.addContact(newContact);
            } catch (Exception ex) {
                System.out.println(i+" Object created ");
                ex.printStackTrace();
            }
        }
        // System.out.println(MAX+" contacts created !");
        try {
            Thread.sleep(200000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
