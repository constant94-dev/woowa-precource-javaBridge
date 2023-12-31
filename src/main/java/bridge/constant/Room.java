package bridge.constant;

public enum Room {
    ROOM_UP("U"),
    ROOM_DOWN("D"),
    ROOM_EXIST("O"),
    ROOM_EMPTY("X");

    private String message;

    Room(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
