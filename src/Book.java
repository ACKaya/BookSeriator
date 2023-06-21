import java.util.Comparator;

public class Book implements Comparable<Book> {
    private String name;
    private int pageNumer;
    private String authorName;
    private int releaseDate;

    public Book(String name, int pageNumer, String authorName, int releaseDate) {
        this.name = name;
        this.pageNumer = pageNumer;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumer() {
        return pageNumer;
    }

    public void setPageNumer(int pageNumer) {
        this.pageNumer = pageNumer;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
