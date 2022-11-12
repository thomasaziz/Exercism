import java.util.*;
import java.util.stream.*;

public class Flattener<T>{
    List<T> inputList;
    
    public Flattener(){    
    }

    public static List<Object> flatten(List<Object> inputList){
           return inputList.stream()
               .flatMap(e -> e instanceof List ?
                       Flattener.flatten((List<Object>) e).stream() :
                       Stream.of(e))
               .filter(Objects::nonNull)
               .collect(Collectors.toList());
    }
    

    
}


