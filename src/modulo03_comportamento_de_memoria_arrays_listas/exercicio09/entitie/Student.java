package modulo03_comportamento_de_memoria_arrays_listas.exercicio09.entitie;

public class Student {
    private String name;
    private String email;
    private int roomNumber;

    public Student(String name, String email, int roomNumber) {
        this.name = name;
        this.email = email;
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", email=" + email + ", roomNumber=" + roomNumber + "]";
    }

    
}
