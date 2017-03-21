package parsers;

import model.Query;
import java.util.Map;

public class QueryParser implements Parser{
    
   @Override
   public Query parser(Map<String,String> operation){
       return new Query(
               Integer.parseInt(operation.get("x1")),
               Integer.parseInt(operation.get("y1")),
               Integer.parseInt(operation.get("z1")),
               Integer.parseInt(operation.get("x2")),
               Integer.parseInt(operation.get("y2")),
               Integer.parseInt(operation.get("z2"))
       );
   }          
}
