package files;
/**
 * title project 2
 * @author 92019528 jakeroche
 */
import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.Comparator;


class SortId implements Comparator<catalogueobject> {

    public static int Counter = 0;

    @Override // Sort by number
    public int compare(catalogueobject a, catalogueobject b) {
        Counter++;
        return a.getItemId() - b.getItemId();
    }
}

class SortByCatalogue implements Comparator<catalogueobject> {

    public static int Counter2 = 0;

    @Override // Sorts alphabetical by catogory
    public int compare(catalogueobject a, catalogueobject b) {
        Counter2++;
        return a.getCategory().compareToIgnoreCase(b.getCategory());
    }
}

class Sorter {

    public static int Counter = 0;
    public static int Check = 0;

    public static void Sort(ArrayList<catalogueobject> jdf) {
        int n = jdf.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                Counter++;
                if (jdf.get(j).getItemId() > jdf.get(j + 1).getItemId()) {
                    Check++;
                    // swap temp and arr[i]
                    catalogueobject temp = jdf.get(j);
                    jdf.set(j, jdf.get(j + 1));
                    jdf.set(j + 1, temp);
                }
            }
        }
    }
}

public class javasort {

    public static ArrayList<catalogueobject> list = new ArrayList();

    public static void iniList() {
        list.clear();
        list.add(new catalogueobject(3, "Life of Pi", "Books"));
        list.add(new catalogueobject(7, "Deelongie 4 way toaster", "Home and Kitchen"));
        list.add(new catalogueobject(2, "Glorbarl knife set", "Home and Kitchen"));
        list.add(new catalogueobject(4, "Diesorn vacuum cleaner", "Appliances"));
        list.add(new catalogueobject(5, "Jennie Olivier sauce pan", "Home and Kitchen"));
        list.add(new catalogueobject(6, "This book will save your life", "Books"));
        list.add(new catalogueobject(9, "Kemwould hand mixer", "Appliances"));
        list.add(new catalogueobject(1, "Java for Dummies", "Books"));
    }

    public static void ListArray(String dnf, int c) {
        System.out.println(dnf
                + list);
        if (c != 0) {
            System.out.println("Operations: " + c + "\n\n");
        }
    }

   
    public static void main(String jdf[]) {
        System.out.println("Welcome");
        iniList();//Makes the list

        
        ListArray("Unsorted", 0);
        System.out.println("\n");

        //Do a bubble sort
        Sorter.Sort(list);//apply sort
        ListArray("Bubble sorted by Category", Sorter.Counter);

        //Re makes the list
        iniList();

        //Sorts the list by id
        sort(list, new SortId());//apply sort
        ListArray("Sorted by ID", SortId.Counter);

        //Sort the list by catogory this time
        sort(list, new SortByCatalogue());//apply 
        ListArray("Sorted by Category", SortByCatalogue.Counter2);

       
    }
}
