package rgu.ac.uk.cm3110app20047522;

public class SheepModel {
    //Creating variables that hold all the data one of the items in the Recycler View
    String sheepTagNumber;
    String sheepBreed;
    String sheepGender;

    //constructor for each of the variables
    public SheepModel(String sheepTagNumber, String sheepBreed, String sheepGender) {
        this.sheepTagNumber = sheepTagNumber;
        this.sheepBreed = sheepBreed;
        this.sheepGender = sheepGender;
    }
    //get methods
    public String getSheepTagNumber() {
        return sheepTagNumber;
    }

    public String getSheepBreed() {
        return sheepBreed;
    }

    public String getSheepGender() {
        return sheepGender;
    }

}
