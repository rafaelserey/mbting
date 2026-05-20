package com.juhyang.mbting.user.dto;

import java.util.List;

public class MatchingProfileRequest {

    private List<String> myMeritArr;
    private List<String> myHobbyArr;
    private List<String> myCharacterArr;

    private List<String> yourMeritArr;
    private List<String> yourHobbyArr;
    private List<String> yourCharacterArr;

    private List<String> ageArr;

    public List<String> getMyMeritArr() {
        return myMeritArr;
    }

    public void setMyMeritArr(List<String> myMeritArr) {
        this.myMeritArr = myMeritArr;
    }

    public List<String> getMyHobbyArr() {
        return myHobbyArr;
    }

    public void setMyHobbyArr(List<String> myHobbyArr) {
        this.myHobbyArr = myHobbyArr;
    }

    public List<String> getMyCharacterArr() {
        return myCharacterArr;
    }

    public void setMyCharacterArr(List<String> myCharacterArr) {
        this.myCharacterArr = myCharacterArr;
    }

    public List<String> getYourMeritArr() {
        return yourMeritArr;
    }

    public void setYourMeritArr(List<String> yourMeritArr) {
        this.yourMeritArr = yourMeritArr;
    }

    public List<String> getYourHobbyArr() {
        return yourHobbyArr;
    }

    public void setYourHobbyArr(List<String> yourHobbyArr) {
        this.yourHobbyArr = yourHobbyArr;
    }

    public List<String> getYourCharacterArr() {
        return yourCharacterArr;
    }

    public void setYourCharacterArr(List<String> yourCharacterArr) {
        this.yourCharacterArr = yourCharacterArr;
    }

    public List<String> getAgeArr() {
        return ageArr;
    }

    public void setAgeArr(List<String> ageArr) {
        this.ageArr = ageArr;
    }
} 