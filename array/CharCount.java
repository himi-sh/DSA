import javax.naming.CompoundName;

//i/p aaabccdddaabbb
// o/p a3b1c2d3a2b3

class CharCount {

    public static void main(String[] args) {
        String input = "aaabccdddaabbb";
        String output = "";
        char current = input.charAt(0);  // a
        char next = input.charAt(0); 
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            next = input.charAt(i);
            if (current == next) {
                count++; //2
            } else {
                output = output + current + count; // a1
                count = 1;
                current = next;
            }
        }

        output = output + next + count;
        System.out.println(output);
    }
}
