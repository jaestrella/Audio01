package com.iesvirgendelcarmen.dam.audio01;

import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

public class Audio01 extends AppCompatActivity {
    SeekBar volumen,balance,frecuencia,sb;
    GestorSonido snd;
    int laser,explosion,disparo,gato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio01);

        snd=new GestorSonido(getApplicationContext());
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);

        laser=snd.Carga(R.raw.laser);
        explosion=snd.Carga(R.raw.explosion);
        disparo=snd.Carga(R.raw.disparo);
        gato=snd.Carga(R.raw.gato);

        volumen=(SeekBar)findViewById(R.id.volumen);
        balance=(SeekBar)findViewById(R.id.balance);
        frecuencia=(SeekBar)findViewById(R.id.frecuencia);

        SeekBar.OnSeekBarChangeListener barChange;
        barChange=new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                switch (seekBar.getId()){
                    case R.id.volumen:
                        break;
                    case R.id.balance:
                        break;
                    case R.id.frecuencia:
                        break;
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        };
        sb=(SeekBar)findViewById(R.id.volumen);
        sb=(SeekBar)findViewById(R.id.balance);
        sb=(SeekBar)findViewById(R.id.frecuencia);
        sb.setOnSeekBarChangeListener(barChange);
    }

    public void pulsado(View v) {
        int id=v.getId();
        switch (id){
            case R.id.laser:
                snd.Suena(laser);
                break;
            case R.id.bomba:
                snd.Suena(explosion);
                break;
            case R.id.disparo:
                snd.Suena(disparo);
                break;
            case R.id.maullido:
                snd.Suena(gato);
                break;
        }
    }
}
