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
public class SingleFaceData {
    
    String faceId;
    FaceAttributes faceAttributes;
    
    public SingleFaceData() {
    
    }
    
    @Override
    public String toString() {
        return this.faceId+" => "+this.faceAttributes+"\n";
    }
    
}
