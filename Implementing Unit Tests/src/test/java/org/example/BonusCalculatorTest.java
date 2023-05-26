package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

public class BonusCalculatorTest {
    @Test
    void TestBonus(){
        BonusCalculator bonusCalculator = new BonusCalculator();

        ScoreCalculator scoreCalculator = mock(ScoreCalculator.class);
        doReturn(40).when(scoreCalculator).getScore(4,"qwe");

        Employee employee = mock(Employee.class);
        doReturn(4).when(employee).getRank();

        bonusCalculator.setScoreCalculator(scoreCalculator);
        assertEquals(100,bonusCalculator.calculate(employee),0);
    }

    @Test
    void returnFiveHunderedCase(){
        BonusCalculator bonusCalculator = new BonusCalculator();

        ScoreCalculator scoreCalculator = mock(ScoreCalculator.class);
        doReturn(90).when(scoreCalculator).getScore(5,"qwe");

        Employee employee = mock(Employee.class);
        doReturn(5).when(employee).getRank();
        doReturn("qwe").when(employee).getDesignation();

        bonusCalculator.setScoreCalculator(scoreCalculator);
        assertEquals(500,bonusCalculator.calculate(employee),0);
    }

    @Test
    void returnTwoFifty(){
        BonusCalculator bonusCalculator = new BonusCalculator();

        ScoreCalculator scoreCalculator = mock(ScoreCalculator.class);
        doReturn(40).when(scoreCalculator).getScore(5,"qwe");

        Employee employee = mock(Employee.class);
        doReturn(5).when(employee).getRank();
        doReturn("qwe").when(employee).getDesignation();

        bonusCalculator.setScoreCalculator(scoreCalculator);
        assertEquals(250,bonusCalculator.calculate(employee),0);
    }
}
