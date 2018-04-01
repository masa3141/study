

public class Main {
    static public class Contact{
        String name;
        String email;
        String phoneNumber;
    }
    static public class ContactsManager {
        // Fields:
        Contact [] myFriends;
        int friendsCount;

        // Constructor:
        ContactsManager(){
            friendsCount = 0;
            myFriends = new Contact[500];
        }

        // Methods:
        void addContact(Contact contact){
            myFriends[friendsCount] = contact;
            friendsCount++;
        }

        Contact searchContact(String searchName){
            for(int i=0; i<friendsCount; i++){
                if(myFriends[i].name.equals(searchName)){
                    return myFriends[i];
                }
            }
            return null;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Contact c1 = new Contact();
        c1.name = "aa";
        ContactsManager myContactManager = new ContactsManager();
        myContactManager.addContact(c1);
        Contact r1 = myContactManager.searchContact("aa");
        System.out.println(r1.name);


        CheckingAccount ca = new CheckingAccount();
        ca.account = "aa";
        ca.limit = "bb";
        System.out.println(ca.account);
    }
}