import java.util.*;

public class BookCollection<Book> {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Iterator<Book> getIterator() {
        return new BookIterator();
    }

    public int size() {
        return books.size();
    }

    private class BookIterator implements Iterator<Book>{
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < books.size();
        }

        @Override
        public Book next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No hay más libros en la colección.");
            }
            return books.get(index++);
        }
    }
}