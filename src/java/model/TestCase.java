package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestCase {

    List<Map<String, String>> operations;
    private int size;
    private int numberOperations;
    private List<String> responseOperations;

    public TestCase() {
    }
    
    public void run() throws IOException {
        Cube cube = new Cube(this.size, this.getNumberOperations());
        cube.inicializeCube();
        List<Operation> operationsList = get();
        responseOperations = new ArrayList();
        for (Operation operation : operationsList) {
            if(operation!=null){
                operation.run(cube.getCube());
                this.responseOperations.add(operation.result);
            }
        }
    }

    public List<Operation> get() throws IOException {
        OperationFactory operationFactory = new OperationFactory();
        List<Operation> operationsParser = new ArrayList<Operation>();

        for (Map<String, String> operation : operations) {
            operationsParser.add(operationFactory.identifyOperation(operation));
        }
        return operationsParser;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumberOperations() {
        return numberOperations;
    }

    public void setNumberOperations(int numberOperations) {
        this.numberOperations = numberOperations;
    }

    public List<Map<String, String>> getOperations() {
        return operations;
    }

    public void setOperations(List<Map<String, String>> operations) {
        this.operations = operations;
    }

    public List<String> getResponseOperations() {
        return responseOperations;
    }

    public void setResponseOperations(List<String> responseOperations) {
        this.responseOperations = responseOperations;
    }
}
