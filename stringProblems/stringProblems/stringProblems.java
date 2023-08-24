package stringProblems;

public class stringProblems{
    public static void main(String[] args) {
        //String s = "abc";
        // s += 'd';
        // s += 100;
        // s += "e";
        // printAllChars(s);

        // String s = "aeiouAEIOUqwertyUIOP";
        // System.out.println(countVowels(s));

        String test = "HanaH";
        
        String test4 = "HannaHsdf";
        String test5 = "hasdfskjfhksj";

        System.out.println(toggleCase(test));
        System.out.println(toggleCase(test4));
        System.out.println(toggleCase(test5));

        
        
        // System.out.println(passStrength(test2));
        // System.out.println(passStrength(test3));
         


        // System.out.println(isPelindrome(test));       
        // System.out.println(isPelindrome(test2));
        // System.out.println(isPelindrome(test3));

        

    }

    public static void printAllChars(String s){
        int lString = s.length();

        for (int i = 0; i<lString;i++){
            System.out.println(s.charAt(i));
        }


    }

    public static int countVowels(String str){
        int stringLen = str.length();
        int count = 0;
        char vowels[] = {'a','e','i','o','u','A','E','I','O','U'};

        for(int i = 0; i<vowels.length;i++){
            for(int j = 0; j<stringLen;j++){
                if(str.charAt(j) == vowels[i]){
                    count++;
                }
            }
        }
        return count;
        
    }

    public static int countConsonents(String str){
        return str.length()-countVowels(str);
    }

    public static boolean isPelindrome(String str){
        int stringLen = str.length();

        boolean ispelindrome = true;
        for(int i = 0;i<stringLen/2;i++){
            if (str.charAt(i) != str.charAt(stringLen-i-1)){
                ispelindrome = false;
                break;
            }
        }

        return ispelindrome;        
    }

    public static String passStrength(String password){
        int strengthCat = 0;
        
        int lowerCheck = 0;        
        int upperCheck = 0;
        int numCheck = 0;
        int specialCharCheck = 0;


        int passLen = password.length();

        if(passLen < 8){
            return "Password Length Must be Greater Than 8.";
        }

        for(int i = 0;i<passLen;i++){
            if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z'){
                lowerCheck = 1;
            }
            else if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'){
                upperCheck = 1;
            }
            else if(password.charAt(i) >= '0' || password.charAt(i) <= '9'){
                numCheck = 1;
            }
            else{
                specialCharCheck = 1;
            }
        }

        strengthCat = lowerCheck+upperCheck+numCheck+specialCharCheck;
        System.out.println(strengthCat);
        if(strengthCat == 1){
            return "poor";
        }else if (strengthCat == 2){
            return "weak";
        }else if (strengthCat == 3){
            return "Moderate";
        }
        return "Strong";
    }


    public static String toggleCase(String str){
        int strLen = str.length();
        String newStr = "";
        for(int i = 0;i<strLen;i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                newStr += (char)((int)str.charAt(i)+32);
            }else{
                newStr += (char)((int)str.charAt(i)-32);
            }
        }

        return newStr;
    }


}
