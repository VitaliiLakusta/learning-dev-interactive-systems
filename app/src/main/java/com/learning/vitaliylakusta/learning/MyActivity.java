package com.learning.vitaliylakusta.learning;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MyActivity extends ActionBarActivity {

    Button btnGenerateStory;
    EditText nameText, likeText, dislikeText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        nameText = (EditText)findViewById(R.id.editName);
        likeText= (EditText)findViewById(R.id.editLike);
        dislikeText = (EditText)findViewById(R.id.editDislike);

        btnGenerateStory = (Button)findViewById(R.id.btnGenerateStory);
        btnGenerateStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyActivity.this, StoryActivity.class);
                intent.putExtra("name", nameText.getText().toString());
                intent.putExtra("like", likeText.getText().toString());
                intent.putExtra("dislike", dislikeText.getText().toString());
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
