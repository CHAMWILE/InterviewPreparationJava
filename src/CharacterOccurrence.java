public class CharacterOccurrence {
    public static void main(String[] args) {
        String name = "Jackson Gidion Sondas Sikaponda";
        int[] count = new int[256];

        for (char ch : name.toCharArray()) {
            count[ch]++;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                System.out.println("Character '" + (char) i + "' occurred " + count[i] + " times");
            }
        }
    }
}