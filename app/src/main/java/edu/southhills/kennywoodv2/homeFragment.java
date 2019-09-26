package edu.southhills.kennywoodv2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;

import androidx.fragment.app.Fragment;

public class homeFragment extends Fragment {

    public homeFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_home, container, false);
        Button homeButton = v.findViewById(R.id.myHomeButton);
        homeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), MainActivity.class);
                if(getContext().toString().contains("RateActivity")) {


                    RatingBar rater = getActivity().findViewById(R.id.ratingBar);
                    intent.putExtra("rating", rater.getRating());
                }
                startActivity(intent);
            }
        });
        return v;
    }

}
