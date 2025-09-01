package OnlineExamSystem;

import java.util.*;

enum Difficulty {
    EASY, MEDIUM, HARD
}

class Question<T> {
    private String text;
    private Difficulty level;
    private Map<String, T> options;
    private T correctAnswer;

    public Question(String text, Difficulty level, Map<String, T> options, T correctAnswer) {
        this.text = text;
        this.level = level;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getText() {
        return text;
    }

    public Map<String, T> getOptions() {
        return options;
    }

    public T getCorrectAnswer() {
        return correctAnswer;
    }
}

class Subject<T> {
    private String name;
    private List<Question<T>> questions;

    public Subject(String name) {
        this.name = name;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question<T> q) {
        questions.add(q);
    }

    public List<Question<T>> getQuestions() {
        return questions;
    }

    public String getName() {
        return name;
    }
}

class Student<T> {
    private String name;
    private int rollNo;
    private Map<String, List<T>> submittedAnswers;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.submittedAnswers = new HashMap<>();
    }

    public void takeExam(Subject<T> subject, Scanner sc) {
        List<T> answers = new ArrayList<>();
        System.out.println("\n--- " + name + " taking exam for " + subject.getName() + " ---");
        for (Question<T> q : subject.getQuestions()) {
            System.out.println("Q: " + q.getText());
            for (Map.Entry<String, T> entry : q.getOptions().entrySet()) {
                System.out.println(entry.getKey() + ") " + entry.getValue());
            }
            System.out.print("Enter your answer: ");
            String ans = sc.nextLine();
            answers.add(q.getOptions().get(ans));
        }
        submittedAnswers.put(subject.getName(), answers);
    }

    public int calculateScore(Subject<T> subject) {
        int score = 0;
        List<Question<T>> qs = subject.getQuestions();
        List<T> answers = submittedAnswers.get(subject.getName());
        for (int i = 0; i < qs.size(); i++) {
            if (qs.get(i).getCorrectAnswer().equals(answers.get(i))) {
                score++;
            }
        }
        return score;
    }
}

public class OnlineExamSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Subject<String> java = new Subject<>("Java");

        Map<String, String> q1Options = new HashMap<>();
        q1Options.put("A", "Object-Oriented");
        q1Options.put("B", "Procedural");
        q1Options.put("C", "Functional");
        q1Options.put("D", "Scripting");
        java.addQuestion(new Question<>("Java is which type of language?", Difficulty.EASY, q1Options, "Object-Oriented"));

        Map<String, String> q2Options = new HashMap<>();
        q2Options.put("A", "JVM");
        q2Options.put("B", "JRE");
        q2Options.put("C", "JDK");
        q2Options.put("D", "Compiler");
        java.addQuestion(new Question<>("Which provides runtime environment in Java?", Difficulty.MEDIUM, q2Options, "JRE"));

        Student<String> s1 = new Student<>("Harshita", 101);

        s1.takeExam(java, sc);

        int score = s1.calculateScore(java);
        System.out.println("\n" + score + "/" + java.getQuestions().size() + " Correct!");
    }
}

