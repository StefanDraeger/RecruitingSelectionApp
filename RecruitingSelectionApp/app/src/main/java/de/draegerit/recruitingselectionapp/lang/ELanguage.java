package de.draegerit.recruitingselectionapp.lang;

import de.draegerit.recruitingselectionapp.R;

public enum ELanguage {
    DEUTSCH(R.drawable.flag_german, R.string.deutsch), ENGLISCH(R.drawable.flag_uk, R.string.englisch);

    private int flagId;
    private int textResId;

    ELanguage(int flagId, int textResId){
        this.flagId = flagId;
        this.textResId = textResId;
    }


    public int getFlagId() {
        return flagId;
    }

    public void setFlagId(int flagId) {
        this.flagId = flagId;
    }

    public int getTextResId() {
        return textResId;
    }

    public void setTextResId(int textResId) {
        this.textResId = textResId;
    }
}
