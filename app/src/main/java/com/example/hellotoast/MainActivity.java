package com.example.hellotoast;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
     Toast toast = Toast.makeText(this, R.string.toast_message,
             LENGTH_SHORT);
        toast.show();

    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }


    }

    public void initialState(View view) {
        mCount = 0;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    public void countDown(View view) {
        if (mCount > 0) {
            mCount--;
            if (mShowCount != null) {
                mShowCount.setText(Integer.toString(mCount));
            }
        }
        else {
            Toast toast = Toast.makeText(this, "Cannot decrease when is 0",
                    LENGTH_SHORT);
            toast.show();
        }


    }
}