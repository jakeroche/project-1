package files;
/**
 * title project 2
 * @author 92019528 jakeroche
 */
import java.util.ArrayList;


public class bubblesort {

    public static int Counter = 0;
    public static int Check = 0;
    public static ArrayList< objects2> list = new ArrayList();

    public static void PutDataTolist() {
        list.clear();
        list.add(new objects2("Tama", 2, "Auckland"));
        list.add(new objects2("Amelia", 5, "Taranaki"));
        list.add(new objects2("Kaos", 3, "Hamilton"));
        list.add(new objects2("Karl", 4, "Papatoetoe"));
        list.add(new objects2("Carlos", 5, "Glenfield"));
        list.add(new objects2("Alicia", 2, "Whangarai"));
        list.add(new objects2("Zion", 2, "Wellington"));
        list.add(new objects2("Sara", 3, "Auckland"));
        list.add(new objects2("Bob", 4, "Papakura"));
        list.add(new objects2("Wiremu", 5, "Auckland"));
    }

    public static void Sort(ArrayList<objects2> dnf) {
        Counter = 0;
        Check = 0;
        int n = dnf.size();
        Counter++;
        for (int i = 0; i < n - 1; i++) {
            Counter++;
            for (int j = 0; j < n - i - 1; j++) {
                Counter++;
                if (dnf.get(j).getRating() > dnf.get(j + 1).getRating()) {
                    Check++;
                    // swap temp and arr[i]
                    objects2 temp = dnf.get(j);
                    dnf.set(j, dnf.get(j + 1));
                    dnf.set(j + 1, temp);
                } else {
                    Counter++;
                    if (dnf.get(j).getName().compareToIgnoreCase(dnf.get(j + 1).getName()) < 0) {
                        Counter++;
                        if (dnf.get(j).getRating() == dnf.get(j + 1).getRating()) {
                            Check++;
                            // swap temp and arr[i]
                            objects2 temp = dnf.get(j);
                            dnf.set(j, dnf.get(j + 1));
                            dnf.set(j + 1, temp);
                        }
                    }
                }
            }
        }

    }

    public static void ListArray(String jdf) {
        System.out.println(jdf
                + list + "\n");
        if (Counter != 0) {
            System.out.println(
                    "Operations: " + Counter
                    + "\nSwaps: " + Check + "\n\n");
        }
    }

    
    public static void main(String jdf[]) {
        System.out.println("Welcome");
        PutDataTolist();

        ListArray("Unsorted array");

        Sort(list); // do sort
        ListArray("Bubble Sorted array");
    }
}
