class MagazineCollection {
    private MagazineIterator[] magazines;
    private int size;

    public MagazineCollection(int capacity) {
        magazines = new MagazineIterator[capacity];
        size = 0;
    }

    public void addMagazine(MagazineIterator magazine) {
        if (size < magazines.length) {
            magazines[size++] = magazine;
        }
    }

    public Iterator<MagazineIterator> iterator() {
        return new MagazineIterator(magazines, size);
    }

    private class MagazineIterator implements Iterator<MagazineIterator> {
        private MagazineIterator[] magazines;
        private int index;
        private int size;

        public MagazineIterator(MagazineIterator[] magazines, int size) {
            this.magazines = magazines;
            this.size = size;
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public MagazineIterator next() {
            return hasNext() ? magazines[index++] : null;
        }
    }
}
