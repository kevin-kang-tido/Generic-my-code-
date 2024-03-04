import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private Integer id;
    private String name;
    private Double[] scores;

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScores(Double...scores){
        this.scores = scores;
    }
    public Double[] getScores() {
        return scores;
    }
    Student(){}
    public Student(Integer id, String name, Double...scores){
        this.id = id;
        this.name = name;
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Num of Student : ");
        int numberOfStudent = Integer.parseInt(scanner.nextLine());
        Student[] students = new Student[numberOfStudent];
        for (int i = 0; i<students.length; i++){
            students[i] = new Student();
            System.out.print("ID: ");
            students[i].setId(Integer.parseInt(scanner.nextLine()));
            System.out.print("Name: ");
            students[i].setName(scanner.nextLine());
            System.out.print("Number of Scores: ");
            int numScores = Integer.parseInt(scanner.nextLine());
            Double[] scores = new Double[numScores];
            for (int j = 0; j < numScores; j++) {
                System.out.print("Enter Score " + (j + 1) + ": ");
                scores[j] = Double.parseDouble(scanner.nextLine());
            }
            students[i].setScores(scores);
        }
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    public static Double avg(Double...scores) {
        double result = 0;
        for (Double score : scores) {
            result += score;
        }
        return result/scores.length;
    }
}
