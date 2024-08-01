package BehaivoralDP.MediatorDP;

import java.util.HashMap;
import java.util.Map;

public class MessageMediator implements Mediator{

    //tum actorleri uzman olduklari konu ile birlikte burada tutalim

    Map<String,Actor> registeredActors =new HashMap<>();

    //map e actorleri konulari ile kaydedelim
    public void register(String topic, Actor actor){

        registeredActors.put(topic,actor);
    }



    @Override
    public void dispatch(String topic, String message) {

        //topic hakkinda uzman olan katilimciyi bulalim
        Actor actor=registeredActors.get(topic);

        if(actor == null){
            System.out.println("Bu konu hakkinda uzman bir katilimcimiz bulunamamktadir.");

        }else{
            actor.receiveMessage(message);
        }

    }
}
