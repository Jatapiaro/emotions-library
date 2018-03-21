/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emotions.data;

/**
 *
 * @author jacobotapia
 */
public class EmotionValue implements Comparable{
    
    public String key;
    public float value;
    
    public EmotionValue( String key, float value ) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {
        EmotionValue other = (EmotionValue)o;
        return new Float(value).compareTo(new Float(other.value));
    }
    
    @Override
    public String toString() {
        return this.key + " => " +this.value;
    }
    
}
