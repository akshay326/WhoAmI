package com.whoami.Models;

import java.util.List;

/**
 * Created by akshay on 1/1/18.
 *
 * Change the model structure to a student
 */

public class Student {
    private String personId;
    private List<String> persistedFaceIds;
    private String name;
    private String userData;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public List<String> getPersistedFaceIds() {
        return persistedFaceIds;
    }

    public void setPersistedFaceIds(List<String> persistedFaceIds) {
        this.persistedFaceIds = persistedFaceIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }
}
