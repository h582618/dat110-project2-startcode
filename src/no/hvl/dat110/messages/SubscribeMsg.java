package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	// message sent from client to subscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text

    String topic;
    String user;

    public SubscribeMsg(String user, String topic) {
        this.user = user;
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
    // TODO:
    // Implement object variables - a topic is required

    // Constructor, get/set-methods, and toString method
    // as described in the project text
    @Override
    public String toString() {
        return "SubscribeMsg{" +
                "topic='" + topic + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
