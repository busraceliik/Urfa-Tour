package com.example.busra.urfam;

public class Information {

    private int mAboutId;

    private int mAddressId;

    private int mCallNumber;

    private int mImageId;

    public Information(int aboutId, int addressId, int callNumber, int imageId) {
        mAboutId = aboutId;
        mAddressId = addressId;
        mCallNumber = callNumber;
        mImageId = imageId;
    }

    public int getAboutId() {
        return mAboutId;
    }

    public int getAddressId() {
        return mAddressId;
    }

    public int getCallNumber() {
        return mCallNumber;
    }

    public int getImageId() {
        return mImageId;
    }
}
