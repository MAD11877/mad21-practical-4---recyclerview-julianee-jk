package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {
    private final static String TAG = "List Activity";
    static ArrayList<User> userList = new ArrayList<User>(); // Create user list

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Add user objects
        for (int i=0; i < 20; i++) {
            userList.add(new User("Name" + randomNum(), i, "Description " + randomNum(), getRandomBool()));
        }

        RecyclerView recyclerView = findViewById(R.id.rv);
        UserAdapter mAdapter = new UserAdapter(userList, this);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }

    private int randomNum() {
        return new Random().nextInt();
    }

    private boolean getRandomBool() {
        return new Random().nextBoolean();
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