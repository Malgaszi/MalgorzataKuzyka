package Task8;
//Zaimplementuj interfejs Validator, który będzie zawierać w swojej deklaracji metodę boolean validate(Parcel input).
// Stwórz klasę Parcel z parametrami:
//Validator powinien weryfikować czy suma wymiarów (x, y, z) nie przekracza 300,
// 30.0 dla isExpress=false lub 15.0 dla isExpress=true. W przypadku błędów, powinien o nich poinformować użytkownika.

public class Validator {
    public void  isDimensionViable(Parcel parcel) { // przyjmujemy ze nasza paczka musi przejść przez okienko w poczcie dlatego boolen
        if (parcel.getxLenght() + parcel.getyLenght() + parcel.getzLenght() <= 300) {
            System.out.println("Paczka:" + parcel + " jest ok co do wymiarów");
        } else {
            System.out.println("Paczka" + parcel + "Wymiary niepoprawne");
        }
    }
        public void isWeightAllRight(Parcel parcel){
        if (parcel.getWeight() <=30 && !parcel.isExpress()){
            System.out.println("Paczka:" + parcel + "jest odpowiedniej wagi i nie jest expresowa");
        } else if (parcel.getWeight()<=15 && parcel.isExpress()) {
            System.out.println("Paczka" + parcel + "jest ekspresowa");
        }
        else {
            System.out.println("Błedna waga paczki, przygotuj ja na nowo");

        }
        }
        public void validate(Parcel parcel){
        isDimensionViable(parcel);
        isWeightAllRight(parcel);
        }
}

