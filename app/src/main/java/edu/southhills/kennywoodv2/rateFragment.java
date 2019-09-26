package edu.southhills.kennywoodv2;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class rateFragment extends Fragment {

    private Float rateData;

    public rateFragment(Float rateInput) {
        this.rateData = rateInput;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewRating =  inflater.inflate(R.layout.fragment_rate, container, false);
        TextView textViewRate = viewRating.findViewById(R.id.textViewRate);
        textViewRate.setText("Thank yinz for rating us a " + this.rateData + "!!");
        //view.findViewById();
        return viewRating;

    }
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
