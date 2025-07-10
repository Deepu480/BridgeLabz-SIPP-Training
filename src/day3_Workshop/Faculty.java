package day3_Workshop;

class Faculty implements Graded {
    private String name;
    private String facultyId;

    public Faculty(String name, String facultyId) {
        this.name = name;
        this.facultyId = facultyId;
    }

    // Assign grade to student
    @Override
    public void assignGrade(String grade) {
        System.out.println("Grade assigned: " + grade);
    }

    public String getName() {
        return name;
    }
}
