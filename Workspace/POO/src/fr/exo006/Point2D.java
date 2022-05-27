package fr.exo006;

public class Point2D {
    private int x;
    private int y;



    /**
     *
     * @param x = int
     * @param y = int
     */
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
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

    public void afficher(){
        System.out.println("[" +x+","+y+"]");
    }

    public void translater(int dX,int dY){
      int g = getX() + dX;
      int j = getY() + dY;
        System.out.println("[" + g + "," + j+"]");
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
