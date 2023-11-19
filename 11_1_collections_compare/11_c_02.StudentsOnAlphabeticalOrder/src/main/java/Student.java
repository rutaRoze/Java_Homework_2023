

public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student comparedStudent) {

        if (this.name.equals(comparedStudent.getName())) {
            return 0;
        }

        for (int i = 0; i < this.name.length() && i < comparedStudent.getName().length(); i++) {

            if (this.name.charAt(i) == comparedStudent.getName().charAt(i)) {
                continue;
            }

            if (this.name.charAt(i) < comparedStudent.getName().charAt(i)) {
                return -1;
            }

            if (this.name.charAt(i) > comparedStudent.getName().charAt(i)) {
                return 1;
            }
        }

        if (this.name.length() < comparedStudent.getName().length()) {
            return -1;
        }
        return 1;
    }
}
