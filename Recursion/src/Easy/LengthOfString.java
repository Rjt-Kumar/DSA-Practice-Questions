package Easy;

public class LengthOfString {

    public static void main(String[] args) {
        System.out.println(length("avavajaalfa"));

    }

    public static int length(String old){

        if ( old.isEmpty() ){
            return 0;
        }

        return 1+length(old.substring(1));
    }
}
