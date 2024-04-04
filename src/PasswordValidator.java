public class PasswordValidator {



    public boolean hasGoodLength(String password){
        return password.length() >= 12;
    }

    public  boolean hasNoWhiteSpaces(String password){
        for(int i=0;i<password.length();i++){
            if(Character.isWhitespace(password.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public boolean hasNoRepetitions(String password){

        if(password.length()==0) {
            return false;
        }
            for(int i=1;i<password.length();i++){

                if(password.charAt(i)==password.charAt(i-1)){

                     return false;
                }
            }
            return true;
    }

    public boolean hasNumbers(String password) {

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
            return false;
    }

    public boolean hasSpecialCharacter(String password){

        String specialCharacters = "!.@-;”(){}[]?";

        for (int i = 0; i < password.length(); i++) {
            if (specialCharacters.contains(String.valueOf(password.charAt(i)))){
            return true; }
        }
        return false;
    }

}
