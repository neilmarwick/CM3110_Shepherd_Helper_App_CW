package rgu.ac.uk.cm3110app20047522;

public class SheepModel {
    //Creating variables that hold all the data one of the items in the Recycler View
    String sheepTagNumber;
    String sheepBreed;
    String sheepGender;
   /*int image;*/

    //constructor for each of the variables
    public SheepModel(String sheepTagNumber, String sheepBreed, String sheepGender/*, int image*/) {
        this.sheepTagNumber = sheepTagNumber;
        this.sheepBreed = sheepBreed;
        this.sheepGender = sheepGender;
        /*this.image = image;*/
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
/*
    public int getImage() {
        return image;
    } */
}
