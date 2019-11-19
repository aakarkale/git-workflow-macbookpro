public class KaleAakarA3
{
    public static void main(String[] args)
    {
        String str1 = "Santa Clara";
        String str2 = "University";
        String str3 = "Never buy a piece of art that you don't have to have. " +
                "You know, don't worry about who the artist is or how much it's worth. " +
                "I mean, you have to live with it every day. You have to walk by it every day. " +
                "You have to really love it. You have to really appreciate it. ";


        String new_string = str1 + " " + str2; //concatenating string 1 and string 2

        boolean contains = str1.split(" ")[0].contains("Santa"); //checking if the string contains Santa at index "0"
        System.out.println("\nIs first word in string1 Santa?: " + contains);

        System.out.println("\nNew String :- " + new_string); //printing the concatenated string


        String trim = new_string.trim();  //to count the number of words in "new_string"

        if (trim.isEmpty())
        {
            System.out.println(" ");
        }
        else
        {
            System.out.println("\nNo of Words in the new_string are: " + trim.split("\\s+").length);
        }

        String word = "have";
        System.out.println("\nOccurrences of “have” in String 3 : " + countOccurrence(str3, word)); //calling method countOccurrence which will count the number of "have" in the string


        String[] arrOfStr = str3.split("\\. ");
        String[] lastStringArr = arrOfStr[arrOfStr.length - 1].split(" ");
        //System.out.println("Print array values :" + Arrays.asList(arrOfStr));
        //System.out.println("Print array values :" + Arrays.asList(lastStringArr));

        System.out.println("\nReverse of last line : ");
        for (int i = lastStringArr.length - 1; i >= 0; i--) {
            System.out.print(lastStringArr[i]);
            System.out.print(" ");
        }
        System.out.println("."); // you have hard-coded this....

        System.out.println("\nReplaced line: ");
        for (int i = lastStringArr.length - 1; i >= 0; i--) {
            System.out.print(lastStringArr[i].replace("i", "e"));
            System.out.print(" ");

        }
        System.out.println(".");


        int pos = 0;
        boolean capitalize = true;
        StringBuilder sb = new StringBuilder(str3);
        while (pos < sb.length())
        {
            if (sb.charAt(pos) == ' ')
            {
                capitalize = true;
            }
            else if (capitalize && !Character.isWhitespace(sb.charAt(pos)))
            {
                sb.setCharAt(pos, Character.toUpperCase(sb.charAt(pos)));
                capitalize = false;
            }
            pos++;
        }
        System.out.println("\nCapitalized String 3 :");
        System.out.println(sb.toString());
        System.out.println("\nProgram Completed");
    }

    public static int countOccurrence(String paragraph, String word)
    {
        // split the string by full-stop and a space
        String sentences[] = paragraph.split("\\. ");

        // search for pattern
        int count = 0;
        for (int i = 0; i < sentences.length; i++)
        {
            String words[] = sentences[i].split("\\s");
            for (int j = 0; j < words.length; j++)
            {
                // if match found increase count
                if (word.equals(words[j]))
                    count++;
            }

        }
        return count;
    }
}