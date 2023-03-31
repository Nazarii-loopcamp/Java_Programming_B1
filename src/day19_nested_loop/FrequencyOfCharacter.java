package day19_nested_loop;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String word = "apple";  // 5
        //             01234
        String checked = "";

        for (int i = 0; i < word.length(); i++) {

            int count = 0;
            char letter = word.charAt(i);


            if (!checked.contains("" + letter)){

                for (int j = 0; j < word.length(); j++) {

                    char eachLetter = word.charAt(j);

                    if (letter == eachLetter) {
                        count++;
                    }

                } // end of inner loop

                System.out.println(letter + " - " + count);
                checked += letter;

            }


        }


    }

}
