package BehaivoralDP.MediatorDP;

public class Professor implements Actor{

    public String name;

    public Mediator mediator;

    public Professor(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name+ " mesaji aldi, soruyu cevapliyor : " +message);

    }

    @Override
    public void sendMessage(String topic, String message) {

        mediator.dispatch(topic,message);
    }
}
