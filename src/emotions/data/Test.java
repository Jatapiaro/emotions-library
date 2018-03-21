/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emotions.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import http.requests.PostRequest;
import java.net.URISyntaxException;
import java.util.List;

/**
 *
 * @author jacobotapia
 */
public class Test {
    
    public static void main( String[] args ) throws URISyntaxException {
        PostRequest p = new PostRequest(
            "https://westcentralus.api.cognitive.microsoft.com/face/v1.0/detect?returnFaceAttributes=emotion"
        );
        p.addHeader("Content-Type", "application/octet-stream");
        p.addHeader("Ocp-Apim-Subscription-Key", "69da9e6ea9d24a0d862de15ecfa9524e");
        p.sendImageRequest("/Users/jacobotapia/Desktop/14933186321029.jpg");
        int x = 1000000;
        while(x != 0) {
            x--;
        }
        EmotionsData ed = new EmotionsData(p.getResponseResult());
        System.out.println(ed);
        List<EmotionValue> l = ed.getMeanInOrder();
    }
    
}
