import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NowaKlasa {
    public static void main(String[] args) {
        List<Pojeb> pojebList = new ArrayList<Pojeb>();
        pojebList.add(new Pojeb(13, "Anime"));
        pojebList.add(new Pojeb(12, "Fortnite"));
        pojebList.add(new Pojeb(14, "Manga"));
        System.out.println(pojebList);
        pojebList.sort(new Comparator<Pojeb>() {
            @Override
            public int compare(Pojeb o1, Pojeb o2) {
                if (o1.getWiek() == o2.getWiek()) {
                    return 0;
                } else if (o1.getWiek() < o2.getWiek()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        System.out.println(pojebList);
    }
}
