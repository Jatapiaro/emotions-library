/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emotions.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;

/**
 *
 * @author jacobotapia
 */
public class EmotionsData {
    
    private GsonBuilder builder;
    private Gson gson;
    private SingleFaceData[] facesData;
    private Emotion meanOfEmotions;
    
    
    public EmotionsData( String jsonResponse ) {
        this.meanOfEmotions = new Emotion();
        this.builder = new GsonBuilder();
        this.gson = builder.create();
        this.facesData = gson.fromJson(jsonResponse, SingleFaceData[].class); 
        this.calculateMeanOfEmotions();
    }
    
    private void calculateMeanOfEmotions() {
        
        int numberOfFaces = facesData.length;
        
        for( SingleFaceData sfd : facesData ) {
            meanOfEmotions.anger += sfd.faceAttributes.emotion.anger;
            meanOfEmotions.contempt += sfd.faceAttributes.emotion.contempt;
            meanOfEmotions.disgust += sfd.faceAttributes.emotion.disgust;
            meanOfEmotions.fear += sfd.faceAttributes.emotion.fear;
            meanOfEmotions.happiness += sfd.faceAttributes.emotion.happiness;
            meanOfEmotions.neutral += sfd.faceAttributes.emotion.neutral;
            meanOfEmotions.sadness += sfd.faceAttributes.emotion.sadness;
            meanOfEmotions.surprise += sfd.faceAttributes.emotion.surprise;
        }
        
        meanOfEmotions.anger /= numberOfFaces;
        meanOfEmotions.contempt /= numberOfFaces;
        meanOfEmotions.disgust /= numberOfFaces;
        meanOfEmotions.fear /= numberOfFaces;
        meanOfEmotions.happiness /= numberOfFaces;
        meanOfEmotions.neutral /= numberOfFaces;
        meanOfEmotions.sadness /= numberOfFaces;
        meanOfEmotions.surprise /= numberOfFaces;        
    }
    
    public List<EmotionValue> getMeanInOrder() {
        return this.meanOfEmotions.getValuesInOrder();
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for( SingleFaceData sfd : facesData ) {
            sb.append(sfd);
        }
        return sb.toString();
    }
    
}
