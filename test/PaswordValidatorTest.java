import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PaswordValidatorTest {

    String testPasswort="AsKot12@Ola65";

    PasswordValidator passwordValidator=new PasswordValidator();




    @Test
    public void hasGoodLength(){


        Assertions.assertTrue(passwordValidator.hasGoodLength(testPasswort), testPasswort);

        Assertions.assertFalse(passwordValidator.hasGoodLength("shortPass"));

        Assertions.assertTrue(passwordValidator.hasGoodLength("passLonges12"));

        Assertions.assertTrue(passwordValidator.hasGoodLength("paassLongerThan12"));
    }

    @Test

    public void passwordWhiteSpaceTest(){

        Assertions.assertTrue(passwordValidator.hasNoWhiteSpaces(testPasswort));

        Assertions.assertTrue(passwordValidator.hasNoWhiteSpaces("qwerty"));

        Assertions.assertFalse(passwordValidator.hasNoWhiteSpaces("ala ma kota"));

        Assertions.assertFalse(passwordValidator.hasNoWhiteSpaces(" password "));

        Assertions.assertFalse(passwordValidator.hasNoWhiteSpaces(" password pass "));

        Assertions.assertFalse(passwordValidator.hasNoWhiteSpaces(" password pass"));

        Assertions.assertFalse(passwordValidator.hasNoWhiteSpaces("password pass "));

        Assertions.assertFalse(passwordValidator.hasNoWhiteSpaces(" pass word pass "));

    }

    @Test

    public void hasNoRepetitionsTest(){

        Assertions.assertTrue(passwordValidator.hasNoRepetitions("qwertz"));

        Assertions.assertFalse(passwordValidator.hasNoRepetitions("password"));

        Assertions.assertFalse(passwordValidator.hasNoRepetitions("ppassword"));

        Assertions.assertFalse(passwordValidator.hasNoRepetitions("ppasword"));

        Assertions.assertFalse(passwordValidator.hasNoRepetitions("passwordd"));

        Assertions.assertFalse(passwordValidator.hasNoRepetitions("paswordd"));

    }

    @Test

    public void hasNumbersTest(){

        Assertions.assertTrue(passwordValidator.hasNoRepetitions("pass8word"));

        Assertions.assertTrue(passwordValidator.hasNoRepetitions("2password"));

        Assertions.assertTrue(passwordValidator.hasNoRepetitions("password3"));

        Assertions.assertTrue(passwordValidator.hasNoRepetitions("pa2ssw9ord"));

        Assertions.assertTrue(passwordValidator.hasNoRepetitions("2password7"));

        Assertions.assertTrue(passwordValidator.hasNoRepetitions("24password"));

        Assertions.assertFalse(passwordValidator.hasNumbers("password"));

        Assertions.assertFalse(passwordValidator.hasNumbers("onepassword"));
    }

    @Test

    public void hasSpecialCharacterTest(){

        Assertions.assertTrue(passwordValidator.hasSpecialCharacter("!password"));

        Assertions.assertTrue(passwordValidator.hasSpecialCharacter("pa@ssword"));

        Assertions.assertTrue(passwordValidator.hasSpecialCharacter("password("));

        Assertions.assertTrue(passwordValidator.hasSpecialCharacter("pas?word"));

        Assertions.assertFalse(passwordValidator.hasSpecialCharacter("password125"));

        Assertions.assertFalse(passwordValidator.hasSpecialCharacter("password"));
    }
}
