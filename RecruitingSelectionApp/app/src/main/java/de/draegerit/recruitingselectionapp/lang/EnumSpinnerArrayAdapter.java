package de.draegerit.recruitingselectionapp.lang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import de.draegerit.recruitingselectionapp.R;

public class EnumSpinnerArrayAdapter extends ArrayAdapter<ELanguage> {

    public EnumSpinnerArrayAdapter(Context context, ELanguage[] values) {
        super(context, -1, values);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = getCustomView(parent);
        setEnumValue(position, view);
        return view;
    }
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View view = getCustomView(parent);
        setEnumValue(position, view);
        return view;
    }
    private View getCustomView(ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.lang_spinner_item, parent, false);
        return view;
    }
    private void setEnumValue(int position, View view) {
        ELanguage value = getItem(position);
        TextView lblTextView = view.findViewById(R.id.langTextView);
        lblTextView.setText(getContext().getString(value.getTextResId()));

        ImageView langImageView = view.findViewById(R.id.langFlagImage);
        langImageView.setImageDrawable(getContext().getDrawable(value.getFlagId()));
    }
}
