package com.example.siyaluma;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ThirdFragment extends Fragment {

    public TextView answer1,answer2,answer3,answer4,ques1,ques2,ques3,ques4;
    public LinearLayout question1lay,question_2_lay,question_3_lay,question_4_lay,bkg_Lay_1,bkg_Lay_2,bkg_Lay_3,bkg_Lay_4;
    public ImageView drop_up,drop_up_2,drop_up_3,drop_up_4;

    private Context mContext;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ThirdFragment() {
        // Required empty public constructor
    }
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext=context;
    }

    // TODO: Rename and change types and number of parameters
    public static ThirdFragment newInstance(String param1, String param2) {
        ThirdFragment fragment = new ThirdFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

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

        View v =inflater.inflate(R.layout.fragment_third, container, false);

        answer1 = v.findViewById(R.id.f3_ans1);
        ques1 = v.findViewById(R.id.f3_qs1);
        question1lay = v.findViewById(R.id.f3_layout1);
        drop_up = v.findViewById(R.id.f3_drop_up_icon);
        bkg_Lay_1 = v.findViewById(R.id.f3_background_Lay_1);

        answer2 = v.findViewById(R.id.f3_ans2);
        ques2 = v.findViewById(R.id.f3_qs2);
        question_2_lay = v.findViewById(R.id.f3_layout2);
        drop_up_2 = v.findViewById(R.id.f3_drop_up_icon2);
        bkg_Lay_2 = v.findViewById(R.id.f3_background_Lay_2);

        answer3 = v.findViewById(R.id.f3_ans3);
        ques3 = v.findViewById(R.id.f3_qs3);
        question_3_lay = v.findViewById(R.id.f3_layout3);
        drop_up_3 = v.findViewById(R.id.f3_drop_up_icon3);
        bkg_Lay_3 = v.findViewById(R.id.f3_background_Lay_3);

        answer4 = v.findViewById(R.id.f3_ans4);
        ques4 = v.findViewById(R.id.f3_qs4);
        question_4_lay = v.findViewById(R.id.f3_layout4);
        drop_up_4 = v.findViewById(R.id.f3_drop_up_icon4);
        bkg_Lay_4 = v.findViewById(R.id.f3_background_Lay_4);

        question1lay.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        question_2_lay.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        question1lay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (answer1.getVisibility() == View.GONE) {

                    drop_up.setImageResource(R.drawable.ic_up);

                    question1lay.setBackgroundResource(R.drawable.layout_css);
                    bkg_Lay_1.setBackgroundResource(R.drawable.layout_css);

                    ques1.setTextColor(ContextCompat.getColor(mContext, R.color.faq_qs_color_change));


                    bkg_Lay_2.setBackgroundResource(R.drawable.layout_back_css);
                    bkg_Lay_3.setBackgroundResource(R.drawable.layout_back_css);
                    bkg_Lay_4.setBackgroundResource(R.drawable.layout_back_css);
                    question_2_lay.setBackgroundResource(R.drawable.layout_back_css);
                    question_3_lay.setBackgroundResource(R.drawable.layout_back_css);
                    question_4_lay.setBackgroundResource(R.drawable.layout_back_css);
                    ques2.setTextColor(ContextCompat.getColor(mContext, R.color.faq_qs_color));
                    ques3.setTextColor(ContextCompat.getColor(mContext, R.color.faq_qs_color));
                    ques4.setTextColor(ContextCompat.getColor(mContext, R.color.faq_qs_color));

                    TransitionManager.beginDelayedTransition(question1lay, new AutoTransition());
                    answer1.setVisibility(View.VISIBLE);

                    if(answer2.getVisibility() == View.VISIBLE || answer3.getVisibility() == View.VISIBLE || answer4.getVisibility() == View.VISIBLE){
                        drop_up_2.setImageResource(R.drawable.ic_drop);
                        answer2.setVisibility(View.GONE);
                        drop_up_3.setImageResource(R.drawable.ic_drop);
                        answer3.setVisibility(View.GONE);
                        drop_up_4.setImageResource(R.drawable.ic_drop);
                        answer4.setVisibility(View.GONE);
                    }


                } else {
                    drop_up.setImageResource(R.drawable.ic_drop);
                    bkg_Lay_1.setBackgroundResource(R.drawable.layout_back_css);
                    question1lay.setBackgroundResource(R.drawable.layout_back_css);
                    ques1.setTextColor(ContextCompat.getColor(mContext, R.color.faq_qs_color));

                    TransitionManager.beginDelayedTransition(question1lay, new AutoTransition());
                    answer1.setVisibility(View.GONE);
                }
            }
        });

        question_2_lay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer2.getVisibility() == View.GONE){

                    drop_up_2.setImageResource(R.drawable.ic_up);

                    bkg_Lay_2.setBackgroundResource(R.drawable.layout_css);
                    question_2_lay.setBackgroundResource(R.drawable.layout_css);

                    ques2.setTextColor(ContextCompat.getColor(mContext, R.color.faq_qs_color_change));


                    bkg_Lay_1.setBackgroundResource(R.drawable.layout_back_css);
                    bkg_Lay_3.setBackgroundResource(R.drawable.layout_back_css);
                    bkg_Lay_4.setBackgroundResource(R.drawable.layout_back_css);
                    question1lay.setBackgroundResource(R.drawable.layout_back_css);
                    question_3_lay.setBackgroundResource(R.drawable.layout_back_css);
                    question_4_lay.setBackgroundResource(R.drawable.layout_back_css);
                    ques1.setTextColor(ContextCompat.getColor(mContext, R.color.faq_qs_color));
                    ques3.setTextColor(ContextCompat.getColor(mContext, R.color.faq_qs_color));
                    ques4.setTextColor(ContextCompat.getColor(mContext, R.color.faq_qs_color));



                    TransitionManager.beginDelayedTransition(question_2_lay, new AutoTransition());
                    answer2.setVisibility(View.VISIBLE);
                    if(answer1.getVisibility() == View.VISIBLE || answer3.getVisibility() == View.VISIBLE || answer4.getVisibility() == View.VISIBLE){
                        drop_up.setImageResource(R.drawable.ic_drop);
                        answer1.setVisibility(View.GONE);
                        drop_up_3.setImageResource(R.drawable.ic_drop);
                        answer3.setVisibility(View.GONE);
                        drop_up_4.setImageResource(R.drawable.ic_drop);
                        answer4.setVisibility(View.GONE);
                    }

                }else{
                    drop_up_2.setImageResource(R.drawable.ic_drop);
                    bkg_Lay_2.setBackgroundResource(R.drawable.layout_back_css);
                    question_2_lay.setBackgroundResource(R.drawable.layout_back_css);

                    ques2.setTextColor(ContextCompat.getColor(mContext, R.color.faq_qs_color));

                    TransitionManager.beginDelayedTransition(question_2_lay, new AutoTransition());
                    answer2.setVisibility(View.GONE);
                }
            }
        });

        question_3_lay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer3.getVisibility() == View.GONE){

                    drop_up_3.setImageResource(R.drawable.ic_up);

                    bkg_Lay_3.setBackgroundResource(R.drawable.layout_css);
                    question_3_lay.setBackgroundResource(R.drawable.layout_css);
                    ques3.setTextColor(ContextCompat.getColor(mContext, R.color.faq_qs_color_change));

                    bkg_Lay_1.setBackgroundResource(R.drawable.layout_back_css);
                    bkg_Lay_2.setBackgroundResource(R.drawable.layout_back_css);
                    bkg_Lay_4.setBackgroundResource(R.drawable.layout_back_css);
                    question1lay.setBackgroundResource(R.drawable.layout_back_css);
                    question_2_lay.setBackgroundResource(R.drawable.layout_back_css);
                    question_4_lay.setBackgroundResource(R.drawable.layout_back_css);
                    ques1.setTextColor(ContextCompat.getColor(mContext, R.color.faq_qs_color));
                    ques2.setTextColor(ContextCompat.getColor(mContext, R.color.faq_qs_color));
                    ques4.setTextColor(ContextCompat.getColor(mContext, R.color.faq_qs_color));

                    TransitionManager.beginDelayedTransition(question_3_lay, new AutoTransition());
                    answer3.setVisibility(View.VISIBLE);
                    if(answer1.getVisibility() == View.VISIBLE || answer2.getVisibility() == View.VISIBLE || answer4.getVisibility() == View.VISIBLE){
                        drop_up.setImageResource(R.drawable.ic_drop);
                        answer1.setVisibility(View.GONE);
                        drop_up_2.setImageResource(R.drawable.ic_drop);
                        answer2.setVisibility(View.GONE);
                        drop_up_4.setImageResource(R.drawable.ic_drop);
                        answer4.setVisibility(View.GONE);
                    }

                }else{
                    drop_up_3.setImageResource(R.drawable.ic_drop);
                    bkg_Lay_3.setBackgroundResource(R.drawable.layout_back_css);
                    question_3_lay.setBackgroundResource(R.drawable.layout_back_css);
                    ques3.setTextColor(ContextCompat.getColor(mContext, R.color.faq_qs_color));
                    TransitionManager.beginDelayedTransition(question_3_lay, new AutoTransition());
                    answer3.setVisibility(View.GONE);
                }
            }
        });


        question_4_lay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer4.getVisibility() == View.GONE){

                    drop_up_4.setImageResource(R.drawable.ic_up);

                    bkg_Lay_4.setBackgroundResource(R.drawable.layout_css);
                    question_4_lay.setBackgroundResource(R.drawable.layout_css);
                    ques4.setTextColor(ContextCompat.getColor(mContext, R.color.faq_qs_color_change));

                    bkg_Lay_1.setBackgroundResource(R.drawable.layout_back_css);
                    bkg_Lay_2.setBackgroundResource(R.drawable.layout_back_css);
                    bkg_Lay_3.setBackgroundResource(R.drawable.layout_back_css);
                    question1lay.setBackgroundResource(R.drawable.layout_back_css);
                    question_2_lay.setBackgroundResource(R.drawable.layout_back_css);
                    question_3_lay.setBackgroundResource(R.drawable.layout_back_css);
                    ques1.setTextColor(ContextCompat.getColor(mContext, R.color.faq_qs_color));
                    ques2.setTextColor(ContextCompat.getColor(mContext, R.color.faq_qs_color));
                    ques3.setTextColor(ContextCompat.getColor(mContext, R.color.faq_qs_color));


                    TransitionManager.beginDelayedTransition(question_4_lay, new AutoTransition());
                    answer4.setVisibility(View.VISIBLE);
                    if(answer1.getVisibility() == View.VISIBLE || answer2.getVisibility() == View.VISIBLE || answer3.getVisibility() == View.VISIBLE){
                        drop_up.setImageResource(R.drawable.ic_drop);
                        answer1.setVisibility(View.GONE);
                        drop_up_2.setImageResource(R.drawable.ic_drop);
                        answer2.setVisibility(View.GONE);
                        drop_up_3.setImageResource(R.drawable.ic_drop);
                        answer3.setVisibility(View.GONE);
                    }

                }else{
                    drop_up_4.setImageResource(R.drawable.ic_drop);
                    bkg_Lay_4.setBackgroundResource(R.drawable.layout_back_css);
                    question_4_lay.setBackgroundResource(R.drawable.layout_back_css);
                    ques4.setTextColor(ContextCompat.getColor(mContext, R.color.faq_qs_color));
                    TransitionManager.beginDelayedTransition(question_4_lay, new AutoTransition());
                    answer4.setVisibility(View.GONE);
                }
            }
        });


        return v;
    }
}