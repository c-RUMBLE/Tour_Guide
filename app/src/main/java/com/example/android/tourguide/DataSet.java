package com.example.android.tourguide;

public class DataSet {

    private final int mImageIDSet;

    private final String mNameSet;

    private final String mLocationSet;

    private String mContactSet = NO_CONTACT_AVAILABLE;

    public static final String NO_CONTACT_AVAILABLE = "-1";

    private final String mDescSet;

    public DataSet(int imageIDSet, String nameSet, String locationSet, String contactSet, String descSet)
    {
        mImageIDSet = imageIDSet;
        mNameSet = nameSet;
        mLocationSet = locationSet;
        mContactSet = contactSet;
        mDescSet = descSet;
    }

    public DataSet(int imageIDSet, String nameSet, String locationSet, String descSet)
    {
        mImageIDSet = imageIDSet;
        mNameSet = nameSet;
        mLocationSet = locationSet;
        mDescSet = descSet;
    }

    public int getmImageIDSet() {
        return mImageIDSet;
    }

    public String getmNameSet() {
        return mNameSet;
    }

    public String getmLocationSet() {
        return mLocationSet;
    }

    public String getmContactSet() {
        return mContactSet;
    }

    public String getmDescSet() {
        return mDescSet;
    }

    public boolean hasContact() {
        return !(mContactSet.equals(NO_CONTACT_AVAILABLE));
    }
}
