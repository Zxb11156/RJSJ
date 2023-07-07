package 作业.作业3_2;

//状态

interface TCPState {
    void open(TCPConnection connection);
    void close(TCPConnection connection);
    void acknowledge(TCPConnection connection);
    void send(String data, TCPConnection connection);
    void receive(String data, TCPConnection connection);
}

class TCPConnection {
    private TCPState state;

    public TCPConnection() {
        this.state = new TCPClosedState();
    }

    public void setState(TCPState state) {
        this.state = state;
    }

    public void open() {
        state.open(this);
    }

    public void close() {
        state.close(this);
    }

    public void acknowledge() {
        state.acknowledge(this);
    }

    public void send(String data) {
        state.send(data, this);
    }

    public void receive(String data) {
        state.receive(data, this);
    }
}

class TCPClosedState implements TCPState {
    public void open(TCPConnection connection) {
        System.out.println("Open connection.");
        connection.setState(new TCPConnectionEstablishedState());
    }

    public void close(TCPConnection connection) {
        System.out.println("Cannot close, connection is already closed.");
    }

    public void acknowledge(TCPConnection connection) {
        System.out.println("Cannot acknowledge, connection is not open.");
    }

    public void send(String data, TCPConnection connection) {
        System.out.println("Cannot send data, connection is not open.");
    }

    public void receive(String data, TCPConnection connection) {
        System.out.println("Cannot receive data, connection is not open.");
    }
}

class TCPListenState implements TCPState {
    public void open(TCPConnection connection) {
        System.out.println("Connection already open.");
    }

    public void close(TCPConnection connection) {
        System.out.println("Close connection.");
        connection.setState(new TCPClosedState());
    }

    public void acknowledge(TCPConnection connection) {
        System.out.println("Cannot acknowledge, connection is not established.");
    }

    public void send(String data, TCPConnection connection) {
        System.out.println("Cannot send data, connection is not established.");
    }

    public void receive(String data, TCPConnection connection) {
        System.out.println("Receive data.");
        connection.setState(new TCPSynReceivedState());
    }
}

class TCPSynReceivedState implements TCPState {
    public void open(TCPConnection connection) {
        System.out.println("Connection already open.");
    }

    public void close(TCPConnection connection) {
        System.out.println("Cannot close, connection is in SYN_RECEIVED state.");
    }

    public void acknowledge(TCPConnection connection) {
        System.out.println("Send acknowledgement.");
        connection.setState(new TCPConnectionEstablishedState());
    }

    public void send(String data, TCPConnection connection) {
        System.out.println("Cannot send data, connection is not established.");
    }

    public void receive(String data, TCPConnection connection) {
        System.out.println("Cannot receive data, connection is not established.");
    }
}

class TCPConnectionEstablishedState implements TCPState {
    public void open(TCPConnection connection) {
        System.out.println("Connection already open.");
    }

    public void close(TCPConnection connection) {
        System.out.println("Send FIN.");
        connection.setState(new TCPConnectionFinWait1State());
    }

    public void acknowledge(TCPConnection connection) {
        System.out.println("Send acknowledgement.");
    }

    public void send(String data, TCPConnection connection) {
        System.out.println("Send data.");
    }

    public void receive(String data, TCPConnection connection) {
        System.out.println("Receive data.");
    }
}

class TCPConnectionFinWait1State implements TCPState {
    public void open(TCPConnection connection) {
        System.out.println("Connection already open.");
    }

    public void close(TCPConnection connection) {
        System.out.println("Cannot close, connection is in FIN_WAIT_1 state.");
    }

    public void acknowledge(TCPConnection connection) {
        System.out.println("Send acknowledgement.");
        connection.setState(new TCPConnectionFinWait2State());
    }

    public void send(String data, TCPConnection connection) {
        System.out.println("Cannot send, connection is in FIN_WAIT_1 state.");
    }

    public void receive(String data, TCPConnection connection) {
        System.out.println("Receive data.");
    }
}

class TCPConnectionFinWait2State implements TCPState {
    public void open(TCPConnection connection) {
        System.out.println("Connection already open.");
    }

    public void close(TCPConnection connection) {
        System.out.println("Send closing acknowledgment.");
        connection.setState(new TCPConnectionLastAckState());
    }

    public void acknowledge(TCPConnection connection) {
        System.out.println("Send acknowledgement.");
    }

    public void send(String data, TCPConnection connection) {
        System.out.println("Send data.");
    }

    public void receive(String data, TCPConnection connection) {
        System.out.println("Cannot receive, connection is closed.");
    }
}

class TCPConnectionLastAckState implements TCPState {
    public void open(TCPConnection connection) {
        System.out.println("Connection already open.");
    }

    public void close(TCPConnection connection) {
        System.out.println("Cannot close, connection is in LAST_ACK state.");
    }

    public void acknowledge(TCPConnection connection) {
        System.out.println("Connection closed.");
        connection.setState(new TCPClosedState());
    }

    public void send(String data, TCPConnection connection) {
        System.out.println("Cannot send, connection is closed.");
    }

    public void receive(String data, TCPConnection connection) {
        System.out.println("Cannot receive, connection is closed.");
    }
}

public class Main {
    public static void main(String[] args) {
        TCPConnection connection = new TCPConnection();
        connection.open();
        connection.receive("SYN");
        connection.acknowledge();
        connection.send("Data packet");
        connection.close();
        connection.send("Data packet");
        connection.receive("Data packet");
        connection.close();
    }
}