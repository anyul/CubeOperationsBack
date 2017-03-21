package model;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import parsers.Parser;

public class OperationFactory {

    public Operation identifyOperation(Map<String, String> operation) {
        Operation op = null;
        try {
            String name = operation.get("operation");

            String className = String.valueOf(name.charAt(0)).toUpperCase() + name.substring(1);
            Parser parser = (Parser) Class.forName("parsers." + className + "Parser").newInstance();
            op = parser.parser(operation);

        } catch (Exception ex) {
            Logger.getLogger(OperationFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

        return op;
    }
    
}