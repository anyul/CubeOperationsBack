package model;

public class Update extends Operation{
    
    private int x;
    private int y;
    private int z;
    private int w;

    public Update() {
    }

    public Update(int x, int y, int z, int w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }
    
    @Override
    public String getOperation() {
        return "update";
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }
    
    @Override
    public void run(int[][][] cube) {
        cube[this.x][this.y][this.z] = this.w;
    }
}
