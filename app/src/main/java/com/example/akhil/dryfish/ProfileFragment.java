package com.example.akhil.dryfish;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ProfileFragment extends Fragment {

    TextView myacc;
    TextView pay;
    TextView help;
    TextView logout;
    Activity context;


    public ProfileFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        context = getActivity();
        return inflater.inflate(R.layout.fragment_profile, container, false);

    }
    public void onStart(){
        super.onStart();
        myacc =(TextView) context.findViewById(R.id.myacc);
        pay =(TextView) context.findViewById(R.id.pay);
        help =(TextView) context.findViewById(R.id.help);
        logout =(TextView) context.findViewById(R.id.logout);

        myacc.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(context, myaccount.class);
                startActivity(intent);
            }

        });
        pay.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(context, Payment.class);
                startActivity(intent);
            }

        });

        help.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(context, Help.class);
                startActivity(intent);
            }

        });
        logout.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(context, MainActivity.class);
                startActivity(intent);
            }

        });





    }


}



