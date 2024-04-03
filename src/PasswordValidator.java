public class PasswordValidator {



    public boolean hasGoodLength(String password){
        return password.length() >= 12;
    }

    public  boolean hasNoWhiteSpaces(String password){

        boolean hasNoWhiteSpace=true;

        for(int i=0;i<password.length();i++){
            if(Character.isWhitespace(password.charAt(i))){
                hasNoWhiteSpace= false;


            }
        }

    return hasNoWhiteSpace;
    }

    public boolean hasNoRepetitions(String password){
        return true;
    }

    public boolean hasNumbers(String password) {

        boolean hasNumber = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasNumber = true;
                break;
            }
        }
            return hasNumber;

    }

    public boolean hasSpecialCharacter(String password){

        String specialCharacters = "!.@-;”(){}[]?";

        boolean hasSpecialCharacter=false;

        for (int i = 0; i < password.length(); i++) {
            if (specialCharacters.contains(String.valueOf(password.charAt(i)))){
            hasSpecialCharacter= true; }
        }


    return hasSpecialCharacter;
    }

}
