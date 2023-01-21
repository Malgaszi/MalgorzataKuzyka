package Task8;
//Zaimplementuj interfejs Validator, który będzie zawierać w swojej deklaracji metodę boolean validate(Parcel input).
// Stwórz klasę Parcel z parametrami:
//• int xLength
//• int yLength
//• int zLength
//• float weight
//• boolean isExpress
//Validator powinien weryfikować czy suma wymiarów (x, y, z) nie przekracza 300, czy każdy z rozmiarów nie jest mniejszy niż 30, czy waga nie przekracza
// 30.0 dla isExpress=false lub 15.0 dla isExpress=true. W przypadku błędów, powinien o nich poinformować użytkownika.
public class Parcel {

    private int xLenght; // prywatna zeby juz nei zmieniać
    private int yLenght;
    private int zLenght;
    private float weight;
    private boolean express;// alt+ins - stworzy public class

    public int getxLenght() {
        return xLenght;
    }

    public int getyLenght() {
        return yLenght;
    }

    public int getzLenght() {
        return zLenght;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isExpress() {
        return express;
    }

    public Parcel(int xLenght, int  yLenght, int zLenght, float weight, boolean express) {
        this.xLenght = xLenght;
        this.yLenght = yLenght;
        this.zLenght = zLenght;
        this.weight = weight;
        this.express = express;

    }

    @Override
    public String toString() {
        return "Parcel{" +
                "xLenght=" + xLenght +
                ", yLenght=" + yLenght +
                ", zLenght=" + zLenght +
                ", weight=" + weight +
                ", express=" + express +
                '}';
    }
}
