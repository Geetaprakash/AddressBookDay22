package AddressBook;
import java.util.ArrayList;

public class AddressBookUC4 {
        public static void main(String[] args) {
            ArrayList<String> Firstname = new ArrayList<String>();
            Firstname.add("Geeta");
            Firstname.add("Prakash");
            Firstname.add("Soumya");
            Firstname.remove(1);
            ArrayList<String> Lastname = new ArrayList<String>();
            Lastname.add("Biradar");
            Lastname.add("Patil");
            Lastname.add("Gowda");


            ArrayList<String> Address = new ArrayList<String>();
            Address.add("Banglore");
            Address.add("mysore");
            Address.add("Mandya");


            ArrayList<String> State = new ArrayList<String>();
            State.add("karanatak");
            State.add("karanatak");
            State.add("karanatak");
            State.remove(2);

            ArrayList<Integer> Zip = new ArrayList<>();
            Zip.add(565008);
            Zip.add(565007);
            Zip.add(560769);
            Zip.remove(2);

            ArrayList<String> Email = new ArrayList<String>();
            Email.add("geeta@gmail.com");
            Email.add("prakash@gmail.com");
            Email.add("soumya@gmail.com");
            Email.remove(0);

           System.out.println("Firstname:" +Firstname);
            System.out.println("Lastname:" +Lastname);
            System.out.println("Address:" +Address);
            System.out.println("State:" +State);
            System.out.println("Zip:" +Zip);
            System.out.println("Email:" +Email);
        }
    }

