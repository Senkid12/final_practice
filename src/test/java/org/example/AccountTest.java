package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import javax.swing.*;

@RunWith(Parameterized.class)
public class AccountTest {
    private Account account;
    private static final String NAME_1 = " Zoro Rononoa ";
    private static final String NAME_2 = "Sa";
    private static final String NAME_3 = "Zorooooooooooooooooooooooooooooooo Rononoaaaaaaaaaaaaaaa";
    private static final String NAME_4 = "Zoro Rononoa";
    private String name;
    private boolean isResult;
    private static final boolean isTrue = true;
    private static final boolean isFalse = false;

    public AccountTest(String name, boolean isResult) {
        this.name = name;
        this.isResult = isResult;
    }

    @Parameterized.Parameters
    public static Object[][] getParameters() {
        return new Object[][] {
                {NAME_1, isFalse},
                {NAME_2, isFalse},
                {NAME_3, isFalse},
                {NAME_4, isTrue},
        };
    }
    @Before
    public void setUp() {
        account = new Account(name);
    }
    @Test
    public void testAccountWithParameters() {
        boolean actual = account.checkNameToEmboss();
        Assert.assertEquals(isResult, actual);
    }
}
