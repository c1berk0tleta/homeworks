public class Main {
    public static void main(String[] args) {
        Student artyom = new Student("Artyom", "Grechko", "PKS-320", 4.6);
        Aspirant aleksandra = new Aspirant("Gamova", "Aleksandra", "PKS-320", 5, "Network");
        Student[] students = { artyom, aleksandra };

        for (Student s : students)
            System.out.println(s.getScholarship());
    }
}
