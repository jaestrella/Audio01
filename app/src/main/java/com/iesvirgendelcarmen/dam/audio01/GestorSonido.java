package com.iesvirgendelcarmen.dam.audio01;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

/**
 * Created by matinal on 26/01/2018.
 */

public class GestorSonido {

    SoundPool sndPool;
    Context pContext;

    public GestorSonido(Context appContext){
       sndPool=new SoundPool(16, AudioManager.STREAM_MUSIC,100);
       pContext=appContext;
    }

    public void unLoadAll(){
        sndPool.release();
    }

    public int Carga(int sound_id){
        return sndPool.load(pContext,sound_id,1);
    }

    public void Suena(int sound_id){
        sndPool.play(sound_id,1,1,1,0,1);
    }
}
