package StudentPackage;

class LinkedList {
    Node head;

    public void addStudent(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = (Node) current.next;
            }
            current.next = newNode;
        }
    }

 


public void displayStudents() {
    Node current = head;
    while (current != null) {
        Student student1 = current.data;
        System.out.println("Name: " + student1.getName());
        System.out.println("ID: " + student1.getId());
        System.out.println("Grade: " + student1.getGrade());
        System.out.println("----------------------");
        current = current.next;
    }
}

public static class Node {
    Student data;
    Node next;

    public Node(Student student) {
        data = student;
        next = null;
    }
}
}