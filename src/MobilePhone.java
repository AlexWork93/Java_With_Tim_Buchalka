import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }


    public boolean addNewContact(Contact newContact) {
        if (findContact(newContact) < 0){
            myContacts.add(newContact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) < 0){
            return false;
        }else {
            myContacts.set(myContacts.indexOf(oldContact), newContact);
            return true;
        }
    }


    public boolean removeContact(Contact contactToRemove) {
        if (findContact(contactToRemove) < 0){
            return false;
        }else {
            myContacts.remove(contactToRemove);
            return true;
        }
    }

    private int findContact(Contact contactToFind) {
        int indexOfSearchedContact = -1;
        for (int i = 0; i < myContacts.size(); i++){
            if (myContacts.get(i).getName().equalsIgnoreCase(contactToFind.getName())) indexOfSearchedContact = i;
        }
        return indexOfSearchedContact;
    }


    private int findContact(String contactToFind) {
        int indexOfSearchedContact = -1;
        for (Contact contact : myContacts) {
            if (contact.getName().equalsIgnoreCase(contactToFind)) indexOfSearchedContact = myContacts.indexOf(contact);
        }
        return indexOfSearchedContact;
    }

    public Contact queryContact(String contactToFind) {
        for (Contact contact : myContacts) {
            if (contact.getName().equalsIgnoreCase(contactToFind))
                return contact;
        }
        return null;
    }
    public void printContacts(){
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++){
            System.out.printf("%d. %s -> %s%n", i + 1, myContacts.get(i).getName(), myContacts.get(i).getPhoneNumber());
        }
    }
}
