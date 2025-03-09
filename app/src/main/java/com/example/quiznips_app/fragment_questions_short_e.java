package com.example.quiznips_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_questions_short_e#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_questions_short_e extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_questions_short_e() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_questions_short_e.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_questions_short_e newInstance(String param1, String param2) {
        fragment_questions_short_e fragment = new fragment_questions_short_e();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public static TextView txt_ques_no,txt_question;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_questions_short_e, container, false);

        txt_ques_no=v.findViewById(R.id.textView6);
        txt_question=v.findViewById(R.id.textView4);

        easy_questions_lets_play activity = (easy_questions_lets_play)getActivity();
        String myDataFromActivity[] = activity.getMyData();

        String ques_no=myDataFromActivity[1];
        String question=myDataFromActivity[0];

        txt_ques_no.setText(ques_no);
        txt_question.setText(question);
        return v;


    }
}