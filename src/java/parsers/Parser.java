package parsers;

import model.Operation;
import java.util.Map;

public interface Parser {
   
    public Operation parser(Map<String,String> operation);  
    
}
