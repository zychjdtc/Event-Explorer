package com.laioffer.eventreporter;


import android.graphics.Color;
import android.os.Bundle;
//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.laioffer.laiofferproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CommentFragment extends Fragment {


    public CommentFragment() {
        // Required empty public constructor
    }

    GridView gridView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_comment, container, false);
        gridView = (GridView) view.findViewById(R.id.comment_grid);
        gridView.setAdapter(new EventAdapter(getActivity()));
        return view;
    }

    public void onItemSelected(int position){
        for (int i = 0; i < gridView.getChildCount(); i++){
            if (position == i) {
                gridView.getChildAt(i).setBackgroundColor(Color.BLUE);
            } else {
                gridView.getChildAt(i).setBackgroundColor(Color.parseColor("#EEEEEE"));
            }
        }
    }
}
