package Day1;

public class QuizEvaluator {

    public int calculateScore(String[] correctAnswers, String[] userAnswers) throws InvalidQuizSubmissionException {
        if (correctAnswers.length != userAnswers.length) {
            throw new InvalidQuizSubmissionException("Answer length mismatch.");
        }

        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equalsIgnoreCase(userAnswers[i])) {
                score++;
            }
        }
        return score;
    }

    public String getGrade(int score, int totalQuestions) {
        double percentage = (score * 100.0) / totalQuestions;
        if (percentage >= 90) return "A";
        else if (percentage >= 75) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 40) return "D";
        else return "F";
    }
}

