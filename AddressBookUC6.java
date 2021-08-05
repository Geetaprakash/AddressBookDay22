package AddressBook;
import java.util.TreeSet;
public class AddressBookUC6 {
        public static void main(String[] args) {
            TreeSet<String> Firstname=new TreeSet<String>();
            Firstname.add("Geeta");
            Firstname.add("Prakash");
            Firstname.add("Soumya");
            Firstname.add("Bhavya");

            TreeSet<String> Lastname = new TreeSet<String>();
            Lastname.add("Biradar");
            Lastname.add("Patil");
            Lastname.add("Gowda");
            Lastname.add("AAA");

            TreeSet<String> Address = new TreeSet<String>();
            Address.add("Banglore");
            Address.add("mysore");
            Address.add("Mandya");

            TreeSet<String> State = new TreeSet<String>();
            State.add("Maharastra");
            State.add("kerala");
            State.add("karanatak");

            TreeSet<Integer> Zip = new TreeSet<Integer>();
            Zip.add(565008);
            Zip.add(565007);
            Zip.add(560769);

            TreeSet<String> Email = new TreeSet<String>();
            Email.add("geeta@gmail.com");
            Email.add("prakash@gmail.com");
            Email.add("soumya@gmail.com");

            System.out.println("Firstname:" +Firstname);
            System.out.println("Lastname:" +Lastname);
            System.out.println("Address:" +Address);
            System.out.println("State:" +State);
            System.out.println("Zip:" +Zip);
            System.out.println("Email:" +Email);
        }
    }

