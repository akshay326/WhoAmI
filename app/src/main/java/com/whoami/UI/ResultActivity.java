package com.whoami.UI;

import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.whoami.Adapters.ProfileListAdapter;
import com.whoami.R;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

import static com.whoami.Utils.Constants.USER_DATA;
import static com.whoami.helpers.ImageHelper.file_read_uri;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        CircleImageView profileImage = findViewById(R.id.profile_image);

        // Get the image
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), file_read_uri);
            profileImage.setImageBitmap(Bitmap.createScaledBitmap(bitmap,bitmap.getWidth()/2,bitmap.getHeight()/2,false));

        }catch (Exception e){e.printStackTrace();}

        setUserData(getIntent().getStringExtra(USER_DATA));
    }

    void setUserData(String userData){
        RecyclerView details = findViewById(R.id.DetailsListViewProfile);
        details.setLayoutManager(new LinearLayoutManager(this));
        details.setNestedScrollingEnabled(false); // To show full size

        List<String> keys = new ArrayList<>();
        List<String> values = new ArrayList<>();

        int i = userData.indexOf("uid=\"") + 3 ;

        while (i<userData.length() && i>0){
            int j = userData.lastIndexOf(" ",i) + 1;
            int k = userData.indexOf("\"",i+2); // one for =, one for "

            keys.add(userData.substring(j,i));
            values.add(userData.substring(i+2,k));

            i = userData.indexOf("=\"",k+2);
        }

        ProfileListAdapter adapter = new ProfileListAdapter(ResultActivity.this,keys,values);
        details.setAdapter(adapter);
    }
}
