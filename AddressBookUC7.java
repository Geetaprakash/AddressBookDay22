package AddressBook;

import java.util.HashSet;

public class AddressBookUC7 {
        public static void main(String[] args) {
            HashSet<String> Fname=new HashSet<String>();
            Fname.add("Geeta");
            Fname.add("Prakash");
            Fname.add("Geeta");

            HashSet<String> Lname=new HashSet<String>();
            Lname.add("Biradar");
            Lname.add("Patil");
            Lname.add("Patil");

            HashSet<String> Address=new HashSet<String>();
            Address.add("Banglore");
            Address.add("Mandya");
            Address.add("Mandya");

            HashSet<String> State=new HashSet<String>();
            State.add("karanatak");
            State.add("karanatak");
            State.add("karanatak");

            HashSet<Integer> Zip =new HashSet<Integer>();
            Zip.add(565008);
            Zip.add(565007);
            Zip.add(560769);

            HashSet<String> Email=new HashSet<String>();
            Email.add("geeta@gmail.com");
            Email.add("prakash@gmail.com");
            Email.add("soumya@gmail.com");

            System.out.println("Firstname:" +Fname);
            System.out.println("Lastname:" +Lname);
            System.out.println("Address:" +Address);
            System.out.println("State:" +State);
            System.out.println("Zip:" +Zip);
            System.out.println("Email:" +Email);
        }
    }


