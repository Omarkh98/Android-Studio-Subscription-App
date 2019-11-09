package com.example.subscriptionapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    private static final String TAG = "Recycler Activity";
    public String Name = "";
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<Integer> mImageUrls = new ArrayList<>();
    private ArrayList<String> mDescription = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        Log.d(TAG, "onCreate: started.");

        Intent intent = getIntent();
        TextView WelcomeText = findViewById(R.id.Welcome);
        Name = intent.getStringExtra("Name");
        WelcomeText.setText(" Welcome "+ Name);

        ImageMaps();
    }

    private void ImageMaps() {

        mImageUrls.add(R.drawable.one);
        mNames.add("The Shawshank Redemption");
        mDescription.add("Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.");

        mImageUrls.add(R.drawable.two);
        mNames.add("The Godfather");
        mDescription.add("The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.");

        mImageUrls.add(R.drawable.three);
        mNames.add("The Dark Knight");
        mDescription.add("In Poland during World War II, Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.");

        mImageUrls.add(R.drawable.four);
        mNames.add("Schindler's List");
        mDescription.add("The masterful concoction features a delicious core of mandarin oranges");


        mImageUrls.add(R.drawable.five);
        mNames.add("Fight Club");
        mDescription.add("An insomniac office worker, looking for a way to change his life, crosses paths with a devil-may-care soap maker, forming an underground fight club that evolves into something much, much more");

        mImageUrls.add(R.drawable.six);
        mNames.add("Inception");
        mDescription.add("A thief who steals corporate secrets through use of the dream-sharing technology is given the inverse task of planting an idea into the mind of a CEO.");

        mImageUrls.add(R.drawable.seven);
        mNames.add("The Matrix");
        mDescription.add("A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers.");

        mImageUrls.add(R.drawable.eight);
        mNames.add("The Silence of the Lambs");
        mDescription.add("A young F.B.I. cadet must confide in an incarcerated and manipulative killer to receive his help on catching another serial killer who skins his victims.");

        mImageUrls.add(R.drawable.nine);
        mNames.add("Life Is Beautiful");
        mDescription.add("When an open-minded Jewish librarian and his son become victims of the Holocaust, he uses a perfect mixture of will, humor and imagination to protect his son from the dangers around their camp.");

        mImageUrls.add(R.drawable.ten);
        mNames.add("Intersteller");
        mDescription.add("A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.");

        RecyclerView();
    }

    private void RecyclerView() {
        RecyclerView RV = findViewById(R.id.Recycler);
        RecyclerViewAdapter Adapter = new RecyclerViewAdapter(this, mNames, mImageUrls,mDescription);
        RV.setAdapter(Adapter);
        RV.setLayoutManager(new LinearLayoutManager(this));
    }
}
