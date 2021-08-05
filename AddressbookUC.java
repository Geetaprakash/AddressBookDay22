package AddressBook;
import java.util.*;
public class AddressbookUC {
                public static void main(String[] args) {
                    TreeSet<String> city = new TreeSet<String>();
                    city.add("Banglore");
                    city.add("mysore");
                    city.add("Mandya");

                    TreeSet<String> State = new TreeSet<String>();
                    State.add("karanatak");
                    State.add("Maharastra");
                    State.add("kerala");

                    System.out.println("city:" +city);
                    System.out.println("State:" +State);

                    System.out.println("Intial Set: "+city);

                    System.out.println("Head Set: "+city.headSet("Geeta"));

                    //System.out.println("SubSet: "+ State.subSet("karanatak"));

                    System.out.println("TailSet: "+State.tailSet("kerala"));
                }
            }


