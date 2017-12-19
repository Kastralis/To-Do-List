package edu.purdue.chen2214.todolist;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CategoryActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "CategoryActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        //TODO: 1. Initialize all views using findViewById()
        //TODO: 2. Register OnClickListener for the two buttons

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            //TODO: 3. When cancel button is clicked, go back to MainActivity
                /*
                TODO: 4. When add is clicked, you need to check the following conditions
                      (1) If category is empty, popup a dialog says 'Category cannot be empty'
                      (2) If category already exists, popup a dialog says 'Category exists'
                      (3) If a valid category is input, add it to MainActivity.newCategories and go back to MainActivity using onBackPressed()
                */

        }
    }
}