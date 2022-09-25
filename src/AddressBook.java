import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> infobud;

    public AddressBook(){
        infobud = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo bud) {
        if (bud != null){
            infobud.add(bud);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if (index >=0 && index < infobud.size()){
            return infobud.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("TOM", "Carleton", 123);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }

}


//https://github.com/Kay-ya/AddressBook.git