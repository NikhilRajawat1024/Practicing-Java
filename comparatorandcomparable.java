import java.util.*;

public class comparatorandcomparable {

    public static void main(String[] args) {

        // Primitive Collection sort
        int[] arr = { 6, 5, 3, 9 };
        Integer arr1[] = { 5, 4, 7, 8 };
        Arrays.sort(arr); // This sort function uses Quick Sort
        // System.out.println(arr);

        // Use of Comparator

        Arrays.sort(arr1, (Integer val1, Integer val2) -> val1 - val2);
        
        // for (int i : arr1) {
        //     System.out.println(i);
        // }

        // Sorts in ascending order
        /*
        The way of working of this comparator is like we have two pointers p1 and p2 
        let say p1 at 6 and p2 at 9 , as we wrote val1-val2 so 6-9 = -3 results in -ve
        and algo suggests if it is greater than 0 so it will swap. 
        This is the working of comparator

        for more info tap sort text twice then right click than go to definition

         */

        // If we want to sort this in descending order than just do val2 - val1

        // Arrays.sort(arr1, (Integer val1, Integer val2) -> val2 - val1);
        
        // for (int i : arr1) {
        //     System.out.println(i);
        // }


        //ONE MORE EXAMPLE

        Car[] carArray = new Car[3];
        carArray[0] = new Car("SUV","Petrol");
        carArray[1] = new Car("Sedan","diesel");
        carArray[2] = new Car("hatchback","cng");

        Arrays.sort(carArray,(Car obj1 , Car obj2) -> obj2.CarType.compareTo(obj1.CarType)); //Based on CarType
        //Arrays.sort(carArray,(Car obj1 , Car obj2) -> obj2.CarType.compareTo(obj1.CarType)); //Based on CarName
        

        for(Car car : carArray){
            System.out.println(car.CarName + " -- "+car.CarType);
        }


    }
}
    