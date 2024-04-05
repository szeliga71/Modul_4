import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PaswordValidatorTest {

    String testPasswort = "AsKot12@Ola65";
    String emptyPass = "";

    String nullPass = null;


    PasswordValidator passwordValidator = new PasswordValidator();


    @Test
    public void hasGoodLengthPassEqualsNull() {

        Assertions.assertFalse(passwordValidator.hasGoodLength(nullPass));
    }

    @Test
    public void hasGoodLengthPassIsEmpty() {


        Assertions.assertFalse(passwordValidator.hasGoodLength(emptyPass));
    }

    @Test
    public void hasGoodLengthTwoPass() {


        Assertions.assertTrue(passwordValidator.hasGoodLength(testPasswort), testPasswort);
    }

    @Test
    public void hasGoodLengthShortPass() {

        Assertions.assertFalse(passwordValidator.hasGoodLength("shortPass"));
    }

    @Test
    public void hasGoodLengthEquals12() {

        Assertions.assertTrue(passwordValidator.hasGoodLength("passLonges12"));
    }

    @Test
    public void hasGoodLengthMoreThan12() {

        Assertions.assertTrue(passwordValidator.hasGoodLength("paassLongerThan12"));
    }

    @Test

    public void passwordWhiteSpaceTest() {

        Assertions.assertTrue(passwordValidator.hasNoWhiteSpaces(testPasswort));
    }

    @Test

    public void passwordWhiteSpaceTestPassIsEmpty() {


        Assertions.assertFalse(passwordValidator.hasNoWhiteSpaces(emptyPass));
    }

    @Test

    public void passwordWhiteSpaceTestPassEqualsNull() {


        Assertions.assertFalse(passwordValidator.hasNoWhiteSpaces(nullPass));
    }

    @Test

    public void passwordWithOutWhiteSpaceTest() {

        Assertions.assertTrue(passwordValidator.hasNoWhiteSpaces("qwerty"));
    }

    @Test

    public void passwordWhiteSpaceTestInsideText() {

        Assertions.assertFalse(passwordValidator.hasNoWhiteSpaces("ala ma kota"));
    }

    @Test

    public void passwordWhiteSpaceTestOnStartAndEnd() {

        Assertions.assertFalse(passwordValidator.hasNoWhiteSpaces(" password "));
    }

    @Test

    public void passwordWhiteSpaceTestStartEndInside() {

        Assertions.assertFalse(passwordValidator.hasNoWhiteSpaces(" password pass "));
    }

    @Test

    public void passwordWhiteSpaceTestStartAndInside() {

        Assertions.assertFalse(passwordValidator.hasNoWhiteSpaces(" password pass"));
    }

    @Test

    public void passwordWhiteSpaceTestEndAndInside() {

        Assertions.assertFalse(passwordValidator.hasNoWhiteSpaces("password pass "));
    }

    @Test

    public void passwordWhiteSpaceTestStartEndManyInside() {
        Assertions.assertFalse(passwordValidator.hasNoWhiteSpaces(" pass word pass "));

    }

    @Test

    public void hasNoRepetitionsPassIsNullTest() {

        Assertions.assertFalse(passwordValidator.hasNoRepetitions(nullPass));
    }

    @Test

    public void hasNoRepetitionsPassIsEmptyTest() {

        Assertions.assertFalse(passwordValidator.hasNoRepetitions(emptyPass));
    }

    @Test

    public void hasNoRepetitionsTest() {

        Assertions.assertTrue(passwordValidator.hasNoRepetitions("qwertz"));
    }

    @Test

    public void hasRepetitionsInsideTest() {

        Assertions.assertFalse(passwordValidator.hasNoRepetitions("password"));
    }

    @Test

    public void hasRepetitionsStartAndInsideTest() {
        Assertions.assertFalse(passwordValidator.hasNoRepetitions("ppassword"));
    }

    @Test

    public void hasRepetitionsStartTest() {

        Assertions.assertFalse(passwordValidator.hasNoRepetitions("ppasword"));
    }

    @Test

    public void hasRepetitionsInsideAndEndTest() {

        Assertions.assertFalse(passwordValidator.hasNoRepetitions("passwordd"));
    }

    @Test

    public void hasRepetitionsEndTest() {
        Assertions.assertFalse(passwordValidator.hasNoRepetitions("paswordd"));

    }

    @Test

    public void hasNumberPassIsEmptyTest() {
        Assertions.assertFalse(passwordValidator.hasNumbers(emptyPass));

    }

    @Test

    public void hasNumbersPassIsNullTest() {
        Assertions.assertFalse(passwordValidator.hasNumbers(nullPass));

    }

    @Test

    public void hasNumbersInsideTest() {

        Assertions.assertTrue(passwordValidator.hasNumbers("pass8word"));
    }

    @Test

    public void hasNumbersFirstTest() {
        Assertions.assertTrue(passwordValidator.hasNumbers("2password"));
    }

    @Test

    public void hasNumbersInsideLastTest() {
        Assertions.assertTrue(passwordValidator.hasNumbers("password3"));
    }

    @Test

    public void hasNumbersInsideMoreInsideTest() {
        Assertions.assertTrue(passwordValidator.hasNumbers("pa2ssw9ord"));
    }

    @Test

    public void hasNumbersStartEndTest() {

        Assertions.assertTrue(passwordValidator.hasNumbers("2password7"));
    }

    @Test

    public void hasNumbersStartWithTwoNumbersTest() {

        Assertions.assertTrue(passwordValidator.hasNumbers("24password"));
    }

    @Test

    public void hasNONumbersTest() {

        Assertions.assertFalse(passwordValidator.hasNumbers("password"));
    }

    @Test

    public void hasNumbersInLettersTest() {
        Assertions.assertFalse(passwordValidator.hasNumbers("onepassword"));
    }

    @Test

    public void hasSpecialCharacterPassIsNullTest() {

        Assertions.assertFalse(passwordValidator.hasSpecialCharacter(nullPass));
    }

    @Test

    public void hasSpecialCharacterPassIsEmptyTest() {
        Assertions.assertFalse(passwordValidator.hasSpecialCharacter(emptyPass));

    }

    @Test

    public void hasSpecialCharacterStartTest() {

        Assertions.assertTrue(passwordValidator.hasSpecialCharacter("!password"));
    }

    @Test

    public void hasSpecialCharacterInsiderTest() {

        Assertions.assertTrue(passwordValidator.hasSpecialCharacter("pa@ssword"));
    }

    @Test

    public void hasSpecialCharacterEndTest() {

        Assertions.assertTrue(passwordValidator.hasSpecialCharacter("password("));
    }

    @Test

    public void hasSpecialCharacterStartInside2Test() {

        Assertions.assertTrue(passwordValidator.hasSpecialCharacter("pas?word"));
    }

    @Test

    public void hasNoSpecialCharacterTest() {

        Assertions.assertFalse(passwordValidator.hasSpecialCharacter("password125"));
    }

    @Test

    public void hasSpecialCharacterTest() {

        Assertions.assertFalse(passwordValidator.hasSpecialCharacter("password"));
    }
}
