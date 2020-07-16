package Zad_8;

public class Main {
    public static void main(String[] args) {
       Parcel parcel = new Parcel(50, 101, 102, 285, true);
       ParcelValidator parcelValidator = new ParcelValidator();
       boolean validationResult = parcelValidator.validate(parcel);
        System.out.println(validationResult);
    }
}
