import java.util.*;

class AudiobookCollection {
    private Map<String, AudiobookIterator> audiobooks;

    public AudiobookCollection() {
        audiobooks = new HashMap<>();
    }

    public void addAudiobook(String title, AudiobookIterator audiobook) {
        audiobooks.put(title, audiobook);
    }

    public Iterator<AudiobookIterator> getIterator() {
        return new AudiobookIterator(audiobooks);
    }

    private static class AudiobookIterator implements Iterator<AudiobookIterator> {
        private Iterator<AudiobookCollection.AudiobookIterator> iterator;

        @SuppressWarnings("unchecked")
        public AudiobookIterator(Map<String, AudiobookIterator> audiobooks) {
            this.iterator = (Iterator<AudiobookCollection.AudiobookIterator>) audiobooks.values().iterator();
        }

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public AudiobookIterator next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No hay más audiolibros disponibles.");
            }
            return iterator.next();
        }
    }
}
