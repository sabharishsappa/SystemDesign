package WordProcessor;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    public static Map<Character,DocumentCharacter> characterCache = new HashMap<>();

    public static ILetter createLetter(char characterValue)
    {
        if(characterCache.containsKey(characterValue))
        {
            return characterCache.get(characterValue);
        }

        else {
            DocumentCharacter documentCharacterobj = new DocumentCharacter(characterValue,"Arial",10);
            characterCache.put(characterValue,documentCharacterobj);
            return documentCharacterobj;
        }
    }
}
