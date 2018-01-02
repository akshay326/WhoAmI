package com.whoami.helpers;

import android.net.Uri;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.microsoft.projectoxford.face.contract.Face;

import java.lang.reflect.Type;

public class GsonHelper {
    private Gson gson;
    private Type face = new TypeToken<Face>(){}.getType();

    public GsonHelper(){
        gson = new Gson();
    }

    public Uri getUri(String uri){
        return Uri.parse(uri);
    }

    public Face getFace(String face){
        return gson.fromJson(face,this.face);
    }

    public String setUri(Uri uri){
        return uri.toString();
    }

    public String setFace(Face face){
        return gson.toJson(face,this.face);
    }
}
