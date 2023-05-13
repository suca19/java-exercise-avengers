import java.util.ArrayList;
import java.util.Arrays;
class Solution {
   
        public static void lol() {
        String [] newArr = new String [5];
            newArr[0] = "hello";
            newArr[1] = "hi";
            newArr[2] = "my";
            newArr[3] = "mal";
            newArr[4] = "bills";
        int[] numbs = {2,3,54,6,6};
        int x = numbs[2];
                String y = newArr[3];
        ArrayList<String> friendsArrayList =
        new ArrayList<>(Arrays.asList("John", "Crisht", "Erick", "Luke"));
                System.out.println(x +" "+ y);  
                System.out.println(friendsArrayList.get(1));
                System.out.println(numbs.length);
                System.out.println(friendsArrayList.size());
                System.out.println(newArr.length);
                friendsArrayList.add("Roberto");
                System.out.println(friendsArrayList.get(4));
                //set Array
                newArr[0] = "Carl";
                System.out.println(newArr[0]);
                //Set ArrayList
                friendsArrayList.set(0, "pepe");
                System.out.println(friendsArrayList.get(0));
                //Remove an Element
                // can not do this with Arrays
                friendsArrayList.remove("Crisht");
                System.out.println(friendsArrayList.get(1));
                //print
                System.out.println(newArr);
                System.out.println(friendsArrayList);

    }
                }