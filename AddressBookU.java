package AddressBook;
import java.util.TreeSet;
public class AddressBookU {
        public static void main(String[] args) {
            TreeSet<Integer> Ph_num = new TreeSet<Integer>();
            Ph_num.add(98898008);
            Ph_num.add(89789789);
            Ph_num.add(98659404);

            TreeSet<String> State = new TreeSet<String>();
            State.add("karanatak");
            State.add("Maharastra");
            State.add("kerala");

            System.out.println("Ph_num:" +Ph_num);
            System.out.println("State:" +State);
            System.out.println("Intial Set: "+Ph_num);
            System.out.println("Head Set: "+Ph_num.headSet(98898008));
            System.out.println("TailSet: "+State.tailSet("kerala"));
        }
    }
