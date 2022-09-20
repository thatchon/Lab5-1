package com.example.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class SentenceConsumer {

    protected Sentence sentences;

    public SentenceConsumer() {

        this.sentences = new Sentence();

    }

    @RabbitListener(queues = "BadWordQueue")
    public void addBadSentence(String s){
        this.sentences.badSentences.add(s);
        for (int i = 0; i < this.sentences.badSentences.size(); i++){ //พิมพ์ทุกสมาชิก
            System.out.println("In addBadSentence Method : " + "[" + this.sentences.badSentences.get(i) + "]");
        }
    }

    @RabbitListener(queues = "GoodWordQueue")
    public void addGoodSentence(String s){this.sentences.goodSentences.add(s);
        for (int i = 0; i < this.sentences.goodSentences.size(); i++){
            System.out.println("In addGoodSentence Method : " + "[" + this.sentences.goodSentences.get(i) + "]");
        }
    }

}