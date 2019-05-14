public class HangmanObject
{
    String word;
    int parts;
    public HangmanObject(String wordX, int partsX) {
        // Set word to wordX, parts to partsX
        word = wordX;
        parts = partsX;
    }
    public HangmanObject(int partsX) {
        // Set parts to partsX
        parts = partsX;
    }
    //Accessors
    public int getParts() {
        // Return the number of parts
        return parts;
    }
    public String getWord() {
        // Return the word
        return word;
    }
    //Mutators
    public void setParts(int numparts) {
        // Set the number of parts
        parts = numparts;
    }
    public void addPart() {
        // Add a part
        parts++;
    }
}
