package edu.pdx.cs410J.aachan;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Unit tests for the Student class.  In addition to the JUnit annotations,
 * they also make use of the <a href="http://hamcrest.org/JavaHamcrest/">hamcrest</a>
 * matchers for more readable assertion statements.
 */
public class LeapyearTest
{
    @Test
    public void yearIsDivisibleBy400(){
        int year = 400;
        Leapyear ayear = new Leapyear();
        boolean result = ayear.isDivisibleBy400(year);
        assertThat(result, equalTo(true));
    }

    @Test
    public void shouldBeTrueIfYearIsDivisibleBy100ButNot400() {
        int year = 100;
        Leapyear yearChecker = new Leapyear();
        boolean result = yearChecker.isDivisibleBy100ButNot400(year);
        assertThat(result, equalTo(true));
    }

    @Test
    public void shouldBeTrueIfYearIsDivisibleBy4ButNot100(){
        int year = 2008;
        Leapyear yearChecker = new Leapyear();
        boolean result = yearChecker.isDivisibleBy4ButNot100(year);
        assertThat(result, equalTo(true));
    }

    @Test
    public void shouldBeTrueIfYearIsDivisibleBy4() {
        int year = 4;
        Leapyear yearChecker = new Leapyear();
        boolean result = yearChecker.isDivisibleBy4(year);
        assertThat(result, equalTo(true));
    }

    @Test
    public void shouldBeTrueIfYearIsLeapYear() {
        int year = 2008;
        Leapyear yearChecker = new Leapyear();
        boolean result = yearChecker.isLeapYear(year);
        assertThat(result, equalTo(true));
    }

}
