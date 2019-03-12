import java.util.ArrayList;
import java.util.List;

public class PetleDoChuja {

    public static void main(String[] args) {
        int[] tablica = {3, 4, 2, 16, 4, 6, 6};
        List<Integer> list = new ArrayList<Integer>();
        for (int index = 0; index <tablica.length;index++) {
            System.out.println(tablica[index]);
            list.add(tablica[index]);
        }
        System.out.println(list.toString());
    }

}
