package Prestamos;

class UserContext {
    private UserState state;
    
    public UserContext() { this.state = new ActiveState(); }
    public void setState(UserState state) { this.state = state; }
    public void borrowBook() { state.borrowBook(this); }
}
