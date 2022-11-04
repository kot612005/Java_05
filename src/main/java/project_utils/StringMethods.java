package project_utils;

public class StringMethods {

    public String countAs2 (String text){
        if (text != null) {
            if (!text.isEmpty()){
                text = text.trim().toLowerCase();
                int counter = 0;
                int counter2 = 0;
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) == ('a')) {
                        counter += 1;
                    } else {
                        counter2 += 1;
                    }
                }
                if (counter + counter2 == text.trim().length()) {

                    return String.valueOf(counter).concat(", ").concat(String.valueOf(counter2));
                }
            }
            return "Invalid value";
        }
        return "null";
    }











}


