package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

	// message sent from client to create topic on the broker

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
    String topic;
    String user;

    public DeleteTopicMsg(String user, String topic) {
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
        return "DeleteTopicMsg{" +
                "topic='" + topic + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}

