/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emotions.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author jacobotapia
 */
class Emotion {
    
    public float anger,contempt, disgust, fear,
            happiness, neutral, sadness, surprise;
    private HashMap<String, Float> valuesAsHashMap;
    
    
    public void getValuesAsHashMap() {
        this.valuesAsHashMap = new HashMap<String, Float>();
        this.valuesAsHashMap.put("anger", this.anger);
        this.valuesAsHashMap.put("contempt", this.contempt);
        this.valuesAsHashMap.put("disgust", this.disgust);
        this.valuesAsHashMap.put("fear", this.fear);
        this.valuesAsHashMap.put("happiness", this.happiness);
        this.valuesAsHashMap.put("neutral", this.neutral);
        this.valuesAsHashMap.put("sadness", this.sadness);
        this.valuesAsHashMap.put("sadness", this.sadness);
    }
    
    public List<EmotionValue> getValuesInOrder() {
        List<EmotionValue> l = new ArrayList<EmotionValue>();
        l.add(new EmotionValue("anger", this.anger));
        l.add(new EmotionValue("contempt", this.contempt));
        l.add(new EmotionValue("disgust", this.disgust));
        l.add(new EmotionValue("fear", this.fear));
        l.add(new EmotionValue("happiness", this.happiness));
        l.add(new EmotionValue("neutral", this.neutral));
        l.add(new EmotionValue("sadness", this.sadness));
        l.add(new EmotionValue("sadness", this.sadness));
        Collections.sort(l);
        Collections.reverse(l);
        System.out.println(l);
        return l;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append("Anger: "+this.anger+", ");
        sb.append("Contempt: "+this.contempt+", ");
        sb.append("Disgust: "+this.disgust+", ");
        sb.append("Fear: "+this.fear+", ");
        sb.append("Happiness: "+this.happiness+", ");
        sb.append("Neutral: "+this.neutral+", ");
        sb.append("Sadness: "+this.sadness+", ");
        sb.append("Suprise: "+this.surprise+"]");
        return sb.toString();
    }
    
}
