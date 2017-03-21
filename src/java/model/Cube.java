package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cube {

    private int size;
    private int numberOperations;
    private int[][][] cube = null;

    public Cube() {
    }

    public Cube(int size, int numberOperations) {
        this.size = size;
        this.numberOperations = numberOperations;

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

    public int[][][] getCube() {
        return cube;
    }

    public void setCube(int[][][] cube) {
        this.cube = cube;
    }

    public void inicializeCube() {
        this.cube = new int[this.size + 1][this.size + 1][this.size + 1];
    }

}

