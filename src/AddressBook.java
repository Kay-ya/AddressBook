import java.util.*;

public class AddressBook {

    private HashMap<String, String> BudInfo;

    public AddressBook(){
        BudInfo = new HashMap<>();
    }

    public void addBuddy() {
    }

    public void removeBuddy() {
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("TOM", "Carleton", "123");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        //System.out.println("Address1 Book");
    }

}

