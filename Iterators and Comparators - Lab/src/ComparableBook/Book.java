package ComparableBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private int year;
    private List<String> authors;


    public Book(String title, int year, String... authors ) {
        this.title = title;
        this.year = year;
        setAuthors(authors);
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    private void setAuthors(String... authors) {
        if (authors.length>0){
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }else {
            this.authors = new ArrayList<>();
        }
    }

    @Override
    public String toString() {
        return String.format("%s",this.title);
    }

    @Override
    public int compareTo(Book o) {
        if (this.title.compareTo(o.getTitle())==0){
            return o.getYear()-this.year;
        }
        return this.title.compareTo(o.getTitle());
    }
}
