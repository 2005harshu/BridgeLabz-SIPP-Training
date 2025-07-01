package Day1;

import java.util.*;

public class QuizPlatform {
    public static void main(String[] args) {
        String[] correctAnswers = {"A", "B", "C", "D", "A"};
        
        // Simulating multiple users
        List<String[]> userSubmissions = new ArrayList<>();
        userSubmissions.add(new String[]{"A", "B", "C", "D", "A"}); // 5 correct
        userSubmissions.add(new String[]{"A", "B", "D", "D", "B"}); // 3 correct
        userSubmissions.add(new String[]{"A", "C", "B", "A", "D"}); // 1 correct

        List<Integer> scores = new ArrayList<>();
        QuizEvaluator evaluator = new QuizEvaluator();

        for (int i = 0; i < userSubmissions.size(); i++) {
            String[] userAnswers = userSubmissions.get(i);
            try {
                int score = evaluator.calculateScore(correctAnswers, userAnswers);
                scores.add(score);
                String grade = evaluator.getGrade(score, correctAnswers.length);
                System.out.println("User " + (i + 1) + " Score: " + score + " Grade: " + grade);
            } catch (InvalidQuizSubmissionException e) {
                System.out.println("User " + (i + 1) + ": " + e.getMessage());
            }
        }

        System.out.println("All Scores: " + scores);
    }
}

