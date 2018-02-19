package com.example.android.justorderv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String nameField,emailID,order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button orderSummary = (Button)findViewById(R.id.button_order_summary);
        orderSummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nameTxtView = (EditText)findViewById(R.id.name_text_field);
                EditText emailField = (EditText)findViewById(R.id.email_id);
                nameField = nameTxtView.getText().toString();
                emailID = emailField.getText().toString();
                order = nameField + emailID;
                TextView orderTextView = (TextView)findViewById(R.id.order_summary_textView);
                orderTextView.setText(order);
            }
        });
    }
}
