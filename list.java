import java.util.*;

public class list{
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>();

        mylist.add(0,24);
        mylist.add(1,25);
        mylist.add(2,21);

        mylist.forEach((Integer val) -> System.out.println(val));

        mylist.replaceAll((Integer val)->-1 * val);

         mylist.forEach((Integer val) -> System.out.println(val));

         //sorting list with comparator

         //mylist.sort((Integer val1 , Integer val2) -> val2-val1);
         System.out.println("After Sorting");
         mylist.forEach((Integer val) -> System.out.println(val));

        //  mylist.remove(1);
         System.out.println("After removing");
          mylist.forEach((Integer val) -> System.out.println(val));


          //Traversing list using Iterator

          ListIterator<Integer> myIterator = mylist.listIterator(mylist.size());

        //Traversing backward direction
          while(myIterator.hasPrevious()){
            int prevelm = myIterator.previous();
            System.out.println(" Traversing backward " + prevelm + " nextelm " + myIterator.nextIndex() + " previous index " + myIterator.previousIndex());
          }



    }
}