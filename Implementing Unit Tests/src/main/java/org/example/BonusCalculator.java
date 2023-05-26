package org.example;

public class BonusCalculator {
    public ScoreCalculator getScoreCalculator() {
        return scoreCalculator;
    }

    public void setScoreCalculator(ScoreCalculator scoreCalculator) {
        this.scoreCalculator = scoreCalculator;
    }

    private ScoreCalculator scoreCalculator;
    public double calculate(Employee employee) {
        if (employee.getRank() < 5) {
            return 100;
        } else {
            int score = scoreCalculator.getScore(employee.getRank(),employee.getDesignation());
            if (score >= 80) {
                return 500;
            } else {
                return 250;
            }
        }
    }
}
