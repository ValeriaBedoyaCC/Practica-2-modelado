package Observer;
 
interface Observer {
    void update();
}

class User implements Observer {
    String name;
    public User(String name) { this.name = name; }
    public void update() { System.out.println(name + ", tu libro reservado está disponible."); }
}

