package pro.nanosystems.databindingsample002;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import pro.nanosystems.databindingsample002.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final String TEXT_VALUE="textv";
    // todo (3): Declare ActivityMainBinding m;
  ActivityMainBinding m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: IN");
        super.onCreate(savedInstanceState);
 m = DataBindingUtil.setContentView(this,
         R.layout.activity_main);
        //setContentView(R.layout.activity_main);
        m.addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m.result.append(m.nameEd.getText().toString()+"\n");
            }
        });
        Log.d(TAG, "onCreate: OUT");
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: IN");
        super.onStart();
        Log.d(TAG, "onStart: OUT");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: IN");
        super.onStop();
        Log.d(TAG, "onStop: OUT");
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: IN");
        super.onDestroy();
        Log.d(TAG, "onDestroy: OUT");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString(TEXT_VALUE,m.result.getText().toString());
        Log.d(TAG, "onSaveInstanceState: IN");
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: OUT");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d(TAG, "onRestoreInstanceState: IN");

        m.result.setText(savedInstanceState.getString(TEXT_VALUE).toString());
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState: OUT");
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: IN");
        super.onRestart();
        Log.d(TAG, "onRestart: OUT");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: IN");
        super.onPause();
        Log.d(TAG, "onPause: OUT");
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: IN");
        super.onResume();
        Log.d(TAG, "onResume: OUT");
    }
}
