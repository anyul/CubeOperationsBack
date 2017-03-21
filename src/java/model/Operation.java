package model;

public abstract class Operation {
    
    private String operation;
    protected String result="";
    
    public abstract void run(int[][][] cube);
    
    public abstract String getOperation();
 
}
