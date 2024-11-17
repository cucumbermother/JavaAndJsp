package test3;

public class Board {
    private String writer;
    private String content;
    private int password;

    public Board (String writer,int password, String content) {
        this.content = content;
        this.password = password;
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "NewBoard{" +
                "writer='" + writer + '\'' +
                ", content='" + content + '\'' +
                ", password=" + password +
                '}';
    }
}
