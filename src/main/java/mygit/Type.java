package mygit;

public class Type {

    private enum types {
        blob,
        tree;

        @Override
        public String toString() {
            return this.name();
        }
    }

    types type;

    /**
     * Todo: use generics
     * @param object
     */
    public Type(Object object) {
        if (object instanceof  Blob) {
            this.type = types.blob;
        } else {
            throw new IllegalArgumentException("obj is not legal argument. The object's type is " +
                    object.getClass().getSimpleName());
        }
    }

    @Override
    public String toString() {
        return type.toString();
    }
}
