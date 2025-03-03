package Prestamos;


class BorrowManager {
    public void borrowDocument(UserContext user, Document doc, BorrowType type) {
        user.borrowBook();
        System.out.println("Préstamo de " + Document.title + " como " + type);
    }
}