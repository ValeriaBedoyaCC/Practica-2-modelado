package Prestamos;
interface UserState {
    void borrowBook(UserContext user);
}

class ActiveState implements UserState {
    public void borrowBook(UserContext user) {
        System.out.println("Libro prestado exitosamente.");
    }
}

class DelinquentState implements UserState {
    public void borrowBook(UserContext user) {
        System.out.println("No puedes pedir préstamos hasta devolver libros atrasados.");
    }
}