package com.example.criminalintent;

        import android.app.Activity;

        import androidx.fragment.app.Fragment;

        import java.util.Date;
        import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitre;
    private Date mDate;
    private boolean mResolu;

    public Crime() {
        this.mId = UUID.randomUUID();
        this.mDate=new Date();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitre() {
        return mTitre;
    }

    public void setmTitre(String mTitre) {
        this.mTitre = mTitre;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismResolu() {
        return mResolu;
    }

    public void setmResolu(boolean mResolu) {
        this.mResolu = mResolu;
    }

    public String formatDate(){
        java.text.DateFormat dateFormat=java.text.DateFormat.getDateInstance(java.text.DateFormat.FULL);
        return dateFormat.format(this.mDate);
    }
}
