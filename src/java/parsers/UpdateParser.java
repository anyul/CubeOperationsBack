package parsers;

import model.Operation;
import model.Update;
import java.util.Map;

public class UpdateParser implements Parser {

    @Override
    public Operation parser(Map<String, String> operation) {
        return new Update(
                Integer.parseInt(operation.get("x")),
                Integer.parseInt(operation.get("y")),
                Integer.parseInt(operation.get("z")),
                Integer.parseInt(operation.get("w"))
        );
    }
}
