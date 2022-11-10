import java.util.*;
import static java.util.Arrays.asList;

class Scrabble {
        private final String scrabbleInput;
    
        private final static Map<Set<Character>, Integer> letterValues = new HashMap<Set<Character>, Integer>(){
            {
                put(set('A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T') , 1);
                put(set('D', 'G')                                         , 2);
                put(set('B', 'C', 'M', 'P')                               , 3);
                put(set('F', 'H', 'V', 'W', 'Y')                          , 4);
                put(set('K')                                              , 5);
                put(set('J', 'X')                                         , 8);
                put(set('Q', 'Z')                                         , 10);
            }
        };
    

    private static <T> Set<T> set(T... items){
        return new HashSet<>(asList(items));
    }

    public Scrabble(String scrabbleInput){
        this.scrabbleInput = scrabbleInput;
    }

    public int getScore(){
        if (scrabbleInput == null){
            return 0;
        }

        return scrabbleInput.chars().mapToObj(i -> (char)i).filter(Character::isAlphabetic).map(Character::toUpperCase).mapToInt(Scrabble::score).sum();
    }

    private static Integer score(Character c){
        return letterValues.entrySet().stream().filter(entry -> entry.getKey().contains(c)).map(entry -> entry.getValue()).findFirst().orElse(0);
    }

}
