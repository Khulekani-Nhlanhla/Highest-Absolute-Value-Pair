public class Main {
    public static void main(String[] args) {
        int[] tab = {3,2,-2,-3};
        int[] tab_new = new int[tab.length-1];
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0;i<tab.length;i++)
        {

            if(tab[i]>biggest){
                System.out.println("Largest number");
                biggest = tab[i];
                System.out.println(biggest);
            }

            if(tab[i]<smallest){
                System.out.println("Smallest numbers");
                smallest= tab[i];
                System.out.println(smallest);
            }
            if (biggest == (smallest*-1)){
                System.out.printf("The highest pair of absolute numbers is %d and |%d|",biggest,smallest);
            }

        }

    }
}
