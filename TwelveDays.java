
import java.util.HashMap;

class TwelveDays {
    String str = "";
    String temp = "";
    String ending = "and a Partridge in a Pear Tree.";
    HashMap<Integer, String> map =  new HashMap<Integer, String>();
    HashMap<Integer, String> verse = new HashMap<Integer, String>();
    public TwelveDays() {
        map.put(1, "a Partridge in a Pear Tree.");
        map.put(2, "two Turtle Doves,");
        map.put(3, "three French Hens,");
        map.put(4, "four Calling Birds,");
        map.put(5, "five Gold Rings,");
        map.put(6, "six Geese-a-Laying,");
        map.put(7, "seven Swans-a-Swimming,");
        map.put(8, "eight Maids-a-Milking,");
        map.put(9, "nine Ladies Dancing,");
        map.put(10, "ten Lords-a-Leaping,");
        map.put(11, "eleven Pipers Piping,");
        map.put(12, "twelve Drummers Drumming,");
        verse.put(1,"first");
        verse.put(2,"second");
        verse.put(3,"third");
        verse.put(4,"fourth");
        verse.put(5,"fifth");
        verse.put(6,"sixth");
        verse.put(7,"seventh");
        verse.put(8,"eighth");
        verse.put(9,"ninth");
        verse.put(10,"tenth");
        verse.put(11,"eleventh");
        verse.put(12,"twelfth");
}
    String verse(int verseNumber) {
        if(verseNumber != 1){
            for(int i = verseNumber; i > 1; i--){
                temp += map.get(i) + " ";
            }
        }else{
            temp = map.get(1);
            ending = "";
        }
        str += "On the " + verse.get(verseNumber) + " day of Christmas my true love gave to me: " + temp + ending +"\n";
        return str;
    }
    String verses(int startVerse, int endVerse) {
        for (int j = startVerse; j < endVerse+1; j++){
            if(j == 1){
                str += "On the " + verse.get(j) + " day of Christmas my true love gave to me: " + map.get(1) + "\n";
            }else {
                for(int x = j; x != 1; x--){
                    temp += map.get(x) + " ";
                }
                str += "On the " + verse.get(j) + " day of Christmas my true love gave to me: " + temp + ending + "\n";
                temp = "";
            }
            if(j < endVerse){
                str += "\n";
            }
        }
        return str;
    }
    String sing() {
        return verses(1, 12);
    }
}


