package Zad_8;

public class ParcelValidator implements Validator {

    @Override
    public boolean validate(Parcel parcel) {
        //Validator powinien weryfikować czy suma wymiarów (x, y, z) nie przekracza 300
        int sum = parcel.getxLength() + parcel.getyLength() + parcel.getzLength();

        //czy każdy z rozmiarów nie jest mniejszy niż 30
        int xLenghtCheck = parcel.getxLength();
        int yLenghtCheck = parcel.getyLength();
        int zLenghtCheck = parcel.getzLength();

        //czy waga nie przekracza 30.0 dla isExpress=false lub 15.0 dla isExpress=true.
        float weightCheck = parcel.getWeight();

        if(sum <= 300){
            System.out.println("Size test --> passed");
            if(xLenghtCheck > 30 || yLenghtCheck > 30 || zLenghtCheck >30)
                System.out.println("Lenght test --> passed");
            if(weightCheck < 30.0){
                System.out.println("isExpress test --> failed");
            } else {
                if (weightCheck < 15.0){
                    System.out.println("isExpress tes --> passed");
                }
            }

        }
        return true;
    }
}
