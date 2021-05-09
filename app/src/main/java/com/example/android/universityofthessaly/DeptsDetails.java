package com.example.android.universityofthessaly;

public class DeptsDetails {

    private final int dImage;
    private final int dName;

    public DeptsDetails(int Image, int Name){
        dImage = Image;
        dName = Name;
    }

    public int getImage(){
        return dImage;
    }

    public int getName(){
        return dName;
    }

}
