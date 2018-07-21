package com.example.android.tourapp;

//import static android.icu.text.Normalizer.NO;

/**
 * Created by rosaperez on 6/1/18.
 */

public class Word {

    // English translation for the word
    private String mDefaultTranslation;

    // Miwok translation for the word
    private String mMiwokTranslation;

    // Image resource ID for the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // Constant value that represents no image was provided for the word
    private static final int NO_IMAGE_PROVIDED = -1;

    // Audio resource ID for the word
    private int mAudioResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in a language that the user is already familiar with
     * @param imageResourceId
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourseId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourseId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}




