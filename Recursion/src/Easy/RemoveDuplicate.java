package Easy;

public class RemoveDuplicate {

    public static void main(String[] args) {

       duplicate("aabbbbbbbc","");

    }

    public static void duplicate(String old,String ans){

        if( old.length() == 1 ){
            ans = ans + old.charAt(0);
            System.out.println(ans);
            return;
        }

        if( old.charAt(0) == old.charAt(1)){

            // Since duplicate are present therefore remove the first one and don't add in the answer
            duplicate(old.substring(1),ans);
        }else{    // since the next and current elements are not duplicate hence add the element

            duplicate(old.substring(1),ans+old.charAt(0));
        }


    }

}
