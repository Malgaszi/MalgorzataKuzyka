package Task8;

public class Main {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(10, 100, 10,40.5f, true);
        Parcel parcel1 = new Parcel(10, 100, 10,12, false);
        Parcel parcel2 = new Parcel(10, 100, 10,30.8f, true);
        Parcel parcel3 = new Parcel(100, 100,101, 17, false);

        Validator validator = new Validator();

        validator.validate(parcel);
        System.out.println();
        validator.validate(parcel1);
        System.out.println();
        validator.validate(parcel2);
        System.out.println();
        validator.validate(parcel3);

    }
}
