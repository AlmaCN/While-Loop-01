package it.develhope.exercise;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        /**
         * Ho creato il while loop infinito che stampa "I am in loop".
         */
        int i = 1;
        while(i > 0){
            System.out.println("I am in loop");
            i++;

            /**
             * Ho creato una variabile per imaggazinnare il secondo che mi servira per il loop infinito.
             */
            int timeToSleep = 1;

            /**
             * Ho creato un oggetto time di tipo TimeUnit a cui ho aggiunto i secondi.
             */
            TimeUnit time = TimeUnit.SECONDS;

            /**
             * Ho creato il try catch in cui ho usato il metodo sleep di TimeUnit su time a cui ho dato il valore
             * di timeToSleep, e nel catch o semplicemente messo un system out con un "END".
             */
            try{
                time.sleep(timeToSleep);
            } catch (InterruptedException e) {
                System.out.println("END");
            }
        }


    }
}
