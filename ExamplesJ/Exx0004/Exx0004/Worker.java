package Exx0004;

public class Worker {
    int ID;
    // int Salary;
    // String FirstName;
    // String Family;
    // String LastName;

    public Worker(int id) {
        ID = id;
        // Salary = salary;
        // FirstName = firstName;
        // Family = family;
        // LastName = lastNameS;
    }

    @Override
    public String toString() {
        return String.format("id: %s", ID);
    }

    @Override
    public boolean equals(Object obj) {
        var o = (Worker) obj;
        return ID == o.ID;
    }

    @Override
    public int hashCode() {
        return ID;
    }
}
