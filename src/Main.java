import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> t=new TreeSet<>();
        t.add(new Book("Sefiller",10,"Dostoyevski",1900));
        t.add(new Book("Tutunamayanlar",20,"Oguz Atay",1950));
        t.add(new Book("Son Ada",5,"Zülfü Livaneli",1960));
        t.add(new Book("Fareler ve Insanlar",30,"John Stanbeck",1970));
        t.add(new Book("Bir adam bir kedi",15,"Zülfü Livaneli",1980));
        for (Book o:t){
            System.out.println(o.getName());
        }

    }
}
