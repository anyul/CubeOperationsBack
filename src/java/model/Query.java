package model;

public class Query extends Operation{
    
    private int x1;
    private int y1;
    private int z1;
    private int x2;
    private int y2;
    private int z2;

    public Query(int x1, int y1, int z1, int x2, int y2, int z2) {
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
    }
    
    public Query() {
    }

    @Override
    public String getOperation() {
        return "query";
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getZ1() {
        return z1;
    }

    public void setZ1(int z1) {
        this.z1 = z1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getZ2() {
        return z2;
    }

    public void setZ2(int z2) {
        this.z2 = z2;
    }
    
    @Override
    public void run(int[][][] cube) {
        int sum = 0;
        
        for (int x = this.x1; x <= this.x2; x++) {
            for (int y = this.y1; y <= this.y2; y++) {
                for (int z = this.z1; z <= this.z2; z++) {
                    sum += cube[x][y][z];
                }
            }
        }
        this.result = sum+"";
    }
}
