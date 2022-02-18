/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.io.Serializable;

/**
 *
 * @author Yuneider
 */
public class ScoreController implements Serializable{
    
    private int[] score;
    
    public ScoreController(){
        initScore(10);
    }
    
    private void initScore(int size){
        score = new int[size];
        for(int i=0;i<size;i++){
            score[i]=0;
        }
    }
    
    public void insertScore(int score){
        for(int i=0;i<this.score.length;i++){
            if(score > this.score[i]){
                if(i==9)
                    this.score[i]=i;
                else{
                    int aux = this.score[i];
                    this.score[i] = score;
                    for(int j=i+1;j<this.score.length;j++){
                        int x = this.score[j];
                        this.score[j] = aux;
                        aux = x;
                    }
                }    
            }
        }
    }
    
    private void orderScore(){
    
    }
    
    public void showSocore(){
        for(int i=0;i<score.length;i++){
            System.out.println(score[i]);
        }
    }
    
}
