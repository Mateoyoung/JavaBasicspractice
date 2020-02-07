public class Rectangle {
    private double length;
    private double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double getArea() {
        double area = this.length * this.width;
        return area;
    }

    private double getDiagonal() {
        double diagonalish = (this.width * this.width) + (this.length * this.length);
        double diagonal = Math.sqrt(diagonalish);
        return diagonal;
    }

    private String isSuare() {
        if (this.length == this.width) {
            return "This is a square because it has a width of" + this.width + "and a length of" + this.length;
        }
        return "This isn't a square because it has a width of" + this.width + "and a length of" + this.length;
    }

    public String toString2() {
        return
                isSuare() + " It has an area of " + getArea() + "," + "and a Diagonal with a length of" + getDiagonal();

    }



}