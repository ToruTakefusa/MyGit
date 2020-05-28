package mygit;

public class Header {
    String type;
    int length;

    public Header(Object object, String content) {
        this.type = new Type(object).toString();
        this.length = getLength(content);
    }

    private int getLength(String content) {
        return content.getBytes().length;
    }

    @Override
    public String toString() {
        return type + " " + this.length + "¥0";
    }
}
