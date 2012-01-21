/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Imal;

import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author PC
 */
public class playSond {

    public static String path_reso = "C:/WINDOWS";
    
    
    void Alarm(){


    try {
          // open the sound file as a Java input stream
    String gongFile = path_reso+"/JasperReports/button117.wav";
    InputStream in = new FileInputStream(gongFile);

    // create an audiostream from the inputstream
    AudioStream audioStream = new AudioStream(in);

    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream);

      } catch (Exception e) {

          System.out.println(e);
      }

  }

   public static  void ButtonClick(){


    try {
          // open the sound file as a Java input stream
    String gongFile = path_reso+"/JasperReports/click.wav";
    InputStream in = new FileInputStream(gongFile);

    // create an audiostream from the inputstream
    AudioStream audioStream = new AudioStream(in);

    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream);

      } catch (Exception e) {

          System.out.println(e);
      }

  }

}
