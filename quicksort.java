package files;

/**
 * title project 2
 * @author 92019528 jakeroche
 */
public class quicksort {

    public static int Counter = 0;
    public static int Counter2 = 0;
    public static catalogueobject[] list;
    public static catalogueobject[] baselist = {
        new catalogueobject(3, "Life of Pi", "Books"),
        new catalogueobject(7, "Deelongie 4 way toaster", "Home and Kitchen"),
        new catalogueobject(2, "Glorbarl knife set", "Home and Kitchen"),
        new catalogueobject(4, "Diesorn vacuum cleaner", "Appliances"),
        new catalogueobject(5, "Jennie Olivier sauce pan", "Home and Kitchen"),
        new catalogueobject(6, "This book will save your life", "Books"),
        new catalogueobject(9, "Kemwould hand mixer", "Appliances"),
        new catalogueobject(1, "Java for Dummies", "Books"),};
    public static catalogueobject[] baselist2 = {
        new catalogueobject(8, "Life of Pi", "Books"),
        new catalogueobject(7, "Deelongie 4 way toaster", "Home and Kitchen"),
        new catalogueobject(6, "Glorbarl knife set", "Home and Kitchen"),
        new catalogueobject(5, "Diesorn vacuum cleaner", "Appliances"),
        new catalogueobject(4, "Jennie Olivier sauce pan", "Home and Kitchen"),
        new catalogueobject(3, "This book will save your life", "Books"),
        new catalogueobject(2, "Kemwould hand mixer", "Appliances"),
        new catalogueobject(1, "Java for Dummies", "Books"),};

    public static void sort(catalogueobject[] data) {

        Counter = 0;
        Counter2 = 0;
        list = data;
        quicksort(0, data.length - 1);
    }

    public static void quicksort(int start, int finish) {
        int i = start, j = finish ;
        
        int pivot = list[start + (finish - start) / 2].getItemId();

        // Divide into two lists
        while (i <= j) {
            
            while (list[i].getItemId() < pivot) {
                Counter++;
                i++;
            }
           
            while (list[j].getItemId() > pivot) {
                Counter++;
                j--;
            }

       
            if (i <= j) {
                Counter++;
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (start < j) {
            Counter++;
            quicksort(start, j);
        }
        if (i < finish) {
            Counter++;
            quicksort(i, finish);
        }
    }

    public static void exchange(int i, int j) {
        Counter++;
        catalogueobject temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    /* Prints the array */
    static void printArray(String Msg) {
        System.out.println(Msg);
        for (catalogueobject i : baselist) {
            System.out.print(
                    "id: " + i.getItemId() + " "
                    + "name: " + i.getItemName() + " "
                    + "category: " + i.getCategory() + "\n");
        }
        if (Counter != 0) {
            System.out.println("Check Count: " + Counter + "\n"
                    + "Swap  Count: " + Counter2);
        }
        System.out.println("\n");

    }

    // Driver method to test above
    public static void main(String args[]) {
        System.out.println("Welcome");

        printArray("Unsorted");

        sort(baselist);//apply sort
        printArray("Quick Sorted");

        sort(baselist);//apply sort
        printArray("Quick Sorted Again");

        sort(baselist2);//apply sort
        printArray("Backwards Quick Sorted");

        
    }
}
