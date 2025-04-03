package AReceipeForProblemSolving;

import java.util.HashMap;

class Step5 {
    public static void main(String[] args) {
        // String content = charCount("hello");
        String content = charCount("My name is Elshad");
        System.out.println(content);
    }

// Write a function with takes in a string and returns count of each character in the string 

// charCount("My name is Elshad")
//  { m:2,
//    y:1,
//    n:1,
//    a:2,
//    e:2,
//    i:1,
//    s:2,
//    l:1,
//    h:1,
//    d:1 }

public static String charCount (String str){
    // to something
        // declare object to return at the end 
        String result;
        HashMap <Character, Integer> hashMap = new HashMap <Character, Integer> (); 
        // Loop over the string
        for (int i=0; i<str.length(); i++) {
        // if it is a letter
            // lowercase the character
            if (Character.isLetter(str.charAt(i))) {
            // Character chr = str.charAt(i);
            Character chr = Character.toLowerCase(str.charAt(i));
            // if the character is in out object add one to the value it
            if (hashMap.containsKey(chr)) {
            hashMap.put(chr, hashMap.get(chr)+1);
            } else {
                // if the character is not in our object, add it to the object with the value of 1
            hashMap.put(chr, 1);
                }
            }      
            
        }
           
        // Convert the object to string 
    // return something 
    result = hashMap.toString();
        // return object 
    return result;
    }
}


//                  SUMMARIZE 

//          UNDERSTAND THE PROBLEM 

//          EXPLORE EXAMPLES

//          BREAK IT DOWN 

//          SOLVE / SIMPLIFY

//          LOOK BACK REFACTOR 

