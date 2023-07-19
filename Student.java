package StudentPackage;


public class Student {
    private String name;
    private int id;
    private float grade;
	public static Student data;

    public Student(String name, int id, float grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public float getGrade() {
        return grade;
    }
}

