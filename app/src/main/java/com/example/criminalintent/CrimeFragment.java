package com.example.criminalintent;

        import android.os.Bundle;

        import androidx.fragment.app.Fragment;

        import android.text.Editable;
        import android.text.TextWatcher;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.CompoundButton;
        import android.widget.EditText;

public class CrimeFragment extends Fragment {

    private Crime mCrime;
    private EditText mChampTitre;
    private Button mDateButton;
    private CheckBox mResoluCheckBox;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime=new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_crime, container, false);

        mChampTitre=(EditText)v.findViewById(R.id.titre_crime);
        mChampTitre.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mCrime.setmTitre(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mDateButton=(Button)v.findViewById(R.id.date_crime);
        mDateButton.setText(mCrime.formatDate());
        mDateButton.setEnabled(false);

        mResoluCheckBox=(CheckBox)v.findViewById(R.id.crime_resolu);
        mResoluCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mCrime.setmResolu(isChecked);
            }
        });
        return v;
    }
}
