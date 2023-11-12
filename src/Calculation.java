public class Calculation {

    int smallest;
    int k = 0;
    int biggest = Integer.MIN_VALUE;

    public void AbsoluteValueFinder(int[] nums) {

        int[] tab_new = new int[nums.length - 1];
        int NumbersLeftInArray = nums.length;
        int[] tab_new2 = new int[nums.length-1];

        //I put it in a while loop so I can count how many times i can iterate the code.
        while (NumbersLeftInArray >= 2) {
            for (int num : nums) {
                //This is where the program goes through and takes the largest number in the array
                if (num > biggest) {
                    System.out.println("Largest number");
                    biggest = num;
                    System.out.println(biggest);
                }


            }
            //Once we get the biggest we check if the smallest number in the
            for (int num : nums) {
                if (num == biggest * -1) {
                    smallest = num;
                    System.out.printf("The highest pair of absolute numbers is %d and |%d|%n", biggest, smallest);
                } else if (biggest != num) {

                    tab_new[k] = num;
                    k++;

                }

            }
            biggest = Integer.MIN_VALUE;
            for (int i = 0; i < tab_new.length; i++) {

                if (tab_new[i] > biggest) {
                    System.out.println("Largest number");
                    biggest = nums[i];
                    System.out.println(biggest);
                }

            }
            k = 0;
            for (int j = 0; j < tab_new.length; j++) {
                if (tab_new[j] == biggest * -1) {
                    smallest = tab_new[j];
                    System.out.printf("The highest pair of absolute numbers is %d and |%d|%n", biggest, smallest);
                }
                if (biggest != tab_new[j]) {

                    tab_new2[k] = nums[j];
                    k++;

                }
            /*
             else {
                    System.out.println("There is no pair of absolute values");
                }
            }*/
                NumbersLeftInArray--;
            }
            System.out.println("There is no solution");
        }
    }
}
