

import java.util.AbstractMap;
import java.util.Map;

class House {

    Map<String, String> phrases = Map.ofEntries(
            new AbstractMap.SimpleEntry<>("1", "the house that Jack built."),
            new AbstractMap.SimpleEntry<>("2", "the malt that lay in " ),
            new AbstractMap.SimpleEntry<>("3", "the rat that ate "),
            new AbstractMap.SimpleEntry<>("4", "the cat that killed "),
            new AbstractMap.SimpleEntry<>("5", "the dog that worried "),
            new AbstractMap.SimpleEntry<>("6", "the cow with the crumpled horn that tossed "),
            new AbstractMap.SimpleEntry<>("7", "the maiden all forlorn that milked "),
            new AbstractMap.SimpleEntry<>("8", "the man all tattered and torn that kissed "),
            new AbstractMap.SimpleEntry<>("9", "the priest all shaven and shorn that married "),
            new AbstractMap.SimpleEntry<>("10", "the rooster that crowed in the morn that woke "),
            new AbstractMap.SimpleEntry<>("11", "the farmer sowing his corn that kept "),
            new AbstractMap.SimpleEntry<>("12", "the horse and the hound and the horn that belonged to "));




    public String verse(int verse) {
        StringBuilder sb = new StringBuilder("This is ");
        for (int i = 1; verse >= i; verse--) {
            sb.append(phrases.get(String.valueOf(verse)));
        }
        return sb.toString();
    }

    public String sing() {
        return verses(1, 12);
    }

    public String verses(int startVerse, int endVerse) {
        StringBuilder sb = new StringBuilder();
        for (int i = startVerse; i <= endVerse; i++) {
            sb.append(verse(i)).append("\n");
        }
        return sb.toString().trim();
    }
}
