/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videotoaudio_1;

/**
 *
 * @author Neal
 */
import java.io.File;
import it.sauronsoftware.jave.*;

public class VideoToAudio_1 {
	public static void ConvertToAudio(File video, String audioLoc){
		
		System.err.println("Start Converting...");
		File Audio = new File(audioLoc);
		AudioAttributes audio = new AudioAttributes();
		audio.setCodec(null);
		audio.setBitRate(new Integer(128000));
		audio.setChannels(new Integer(2));
		audio.setSamplingRate(new Integer(44100));
		
		EncodingAttributes attr = new EncodingAttributes();
		attr.setFormat("mp3");
		attr.setAudioAttributes(audio);
		
		Encoder encode = new Encoder();
		try{
			encode.encode(video, Audio, attr);
			System.err.println("Convert finished");
		}catch(Exception e){
			System.err.println(e.toString());
		}
	}

}


