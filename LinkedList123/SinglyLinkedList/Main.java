package LinkedList123.SinglyLinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INSTRUCTIONS");

        String[] strArr = { "To push the data into Linked List, Please Type-: PUSH Data eg(PUSH 23) ",
                "To end Type-: END", "To view List Type-: PRINT", "To Commit change and create list TYPE-: CREATE ",
                "To Insert into the list TYPE-:  INSERT Location,value  eg INSERT 2,345" ,
            "To delete the node from the Type-: DELETE loc eg-:  DELETE 4",
            "2->4->5",
                "Deleting positions are 1, 2, 3",
                "Inserting positions are 1, 2, 3, 4"
        };

        for (String a : strArr) {
            System.out.println(a);
        }

        System.out.println();
        String strng = sc.nextLine();
        ArrayList<Integer> arr = new ArrayList<>();
        SLL sll = null;

        while (!strng.startsWith("END")) {
            if (strng.startsWith("PUSH")) {
                String nstr = strng.substring(5);

                int dta = Integer.parseInt(nstr);
                System.out.println("Inserting data-:" + dta);
                arr.add(dta);

            }
            if (strng.startsWith("PRINT")) {

                sll.print();

            }
            if (strng.startsWith("CREATE")) {
                System.out.println("Creating...");
                sll = new SLL(arr);
                arr.clear();

            }
            if (strng.startsWith("SIZE")) {
                System.out.println(
                        sll.getsize());

            }
            if (strng.startsWith("INSERT")) {
                System.out.println("Inserting...");
                String[] substr = strng.substring(7).split(",", 2);

                int loc = Integer.parseInt(substr[0]);
                int val = Integer.parseInt(substr[1]);
                System.out.println("Inserting the value " + val + " at " + loc);

                sll.insert(loc, val);

            }
            if (strng.startsWith("DELETE")) {
                System.out.println("Deleting...");
                String substr = strng.substring(7);
                int loc = Integer.parseInt(substr);
                System.out.println("The deleted value is -:" + sll.delete(loc));

            }
            strng = sc.nextLine();
        }

    }

}
