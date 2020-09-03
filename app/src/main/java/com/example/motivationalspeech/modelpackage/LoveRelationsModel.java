package com.example.motivationalspeech.modelpackage;

import java.util.ArrayList;

public class LoveRelationsModel {
    private String LoveRelations_speech;
    private String LoveRelationsSpeaker;

    public LoveRelationsModel(String LoveRelationSpeech, String LoveRelationsSpeaker) {
        this.LoveRelations_speech = LoveRelationSpeech;
        this.LoveRelationsSpeaker = LoveRelationsSpeaker;
    }

    public String getLoveRelationsSpeech() {
        return LoveRelations_speech;
    }


    public void setReality_speech(String reality_speech) {
        this.LoveRelations_speech = reality_speech;
    }

    public String getLoveRelationsSpeaker() {

        return LoveRelationsSpeaker;
    }

    public void setLoveRelationsSpeaker(String loveRelationsSpeaker) {
        this.LoveRelationsSpeaker = loveRelationsSpeaker;
    }

    public static ArrayList<LoveRelationsModel>generate_all_loveRelations_model(){
        ArrayList<LoveRelationsModel>relationsModels = new ArrayList<>();

       relationsModels.add(new LoveRelationsModel("Strong relationship starts between two people, who can sacrifice anything for each other","Unknown"));
        relationsModels.add(new LoveRelationsModel("Strong relationship starts between two people, who can sacrifice anything for each other","Unknown"));
        relationsModels.add(new LoveRelationsModel("Strong relationship starts between two people, who can sacrifice anything for each other","Unknown"));
        relationsModels.add(new LoveRelationsModel("Strong relationship starts between two people, who can sacrifice anything for each other","Unknown"));
        relationsModels.add(new LoveRelationsModel("Strong relationship starts between two people, who can sacrifice anything for each other","Unknown"));
        relationsModels.add(new LoveRelationsModel("Strong relationship starts between two people, who can sacrifice anything for each other","Unknown"));
        relationsModels.add(new LoveRelationsModel("Strong relationship starts between two people, who can sacrifice anything for each other","Unknown"));
        relationsModels.add(new LoveRelationsModel("Strong relationship starts between two people, who can sacrifice anything for each other","Unknown"));
        relationsModels.add(new LoveRelationsModel("Strong relationship starts between two people, who can sacrifice anything for each other","Unknown"));
        relationsModels.add(new LoveRelationsModel("Strong relationship starts between two people, who can sacrifice anything for each other","Unknown"));
        relationsModels.add(new LoveRelationsModel("Strong relationship starts between two people, who can sacrifice anything for each other","Unknown"));
        relationsModels.add(new LoveRelationsModel("Strong relationship starts between two people, who can sacrifice anything for each other","Unknown"));
        relationsModels.add(new LoveRelationsModel("Strong relationship starts between two people, who can sacrifice anything for each other","Unknown"));
        relationsModels.add(new LoveRelationsModel("Strong relationship starts between two people, who can sacrifice anything for each other","Unknown"));
        relationsModels.add(new LoveRelationsModel("Strong relationship starts between two people, who can sacrifice anything for each other","Unknown"));
        relationsModels.add(new LoveRelationsModel("Strong relationship starts between two people, who can sacrifice anything for each other","Unknown"));
        relationsModels.add(new LoveRelationsModel("Strong relationship starts between two people, who can sacrifice anything for each other","Unknown"));
        relationsModels.add(new LoveRelationsModel("Strong relationship starts between two people, who can sacrifice anything for each other","Unknown"));
        return relationsModels;
    }
}
