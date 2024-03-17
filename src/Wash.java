/* This example represents the concept of efficiency. The Program below presents two
methods on how to wash dishes.
Algorithm 1 - Task allows for washing a dish every 30 seconds and drying
a dish every 30 second in succession until all dishes are cleaned.

Algorithm 2 - Task allows for washing a dish every 30 seconds and drying
a dish every 30 second is succession but it is also adding an additional drying
time to the process that will increase by 30 seconds for each dish washed until all dishes are cleaned.
* */
public class Wash {

    public static void main (String [] args){


        int num_dish = 30; // # of dishes

        int washTime = 30, dryTime = 30; // wash and dry time

        int totalTime = 0;



        for(int i = 1; i <= num_dish; i++)

        {

            totalTime += washTime + i * dryTime;

            System.out.println("Dish # "+i  + "," + totalTime);

        }

        System.out.println("Algorithm # 1 wash time = " + num_dish + " min");

        System.out.println("Algorithm # 2 wash time = " + (totalTime/60) + "min");




    }

}