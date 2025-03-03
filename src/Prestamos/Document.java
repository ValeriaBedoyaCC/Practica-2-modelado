package Prestamos;

abstract class Document {
    static String title;
    abstract void getFormat();
}

class PDFDocument extends Document {
    void getFormat() { System.out.println("Formato: PDF"); }
}

class EPUBDocument extends Document {
    void getFormat() { System.out.println("Formato: EPUB"); }
}
