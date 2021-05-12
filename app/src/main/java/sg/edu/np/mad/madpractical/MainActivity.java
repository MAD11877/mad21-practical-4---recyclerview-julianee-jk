package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int id = getIntent().getIntExtra("Position", 0);
        User userTarget = ListActivity.userList.get(id);

        Button followButton = findViewById(R.id.btnFollow);

        TextView loremText = findViewById(R.id.loremText);
        loremText.setText(userTarget.description);
        loremText.setText(userTarget.description);

        TextView helloText = findViewById(R.id.helloText);
        helloText.setText(userTarget.name);

//        if (receivingEnd.getIntExtra("randomNo", 0) > 0) {
//            helloText.setText("MAD " + receivingEnd.getIntExtra("randomNo", 0));
//        }
        if (userTarget.isFollowed()) {
            followButton.setText("Unfollow");
        }
        else {
            followButton.setText("Follow");
        }

        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int duration = Toast.LENGTH_SHORT;
                if (userTarget.isFollowed()) {
                    followButton.setText("Follow");
                    Toast.makeText(MainActivity.this, "Unfollowed", duration).show();
                    userTarget.setFollowed(false);
                }
                else {
                    followButton.setText("Unfollow");
                    Toast.makeText(MainActivity.this, "Followed", duration).show();
                    userTarget.setFollowed(true);
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}