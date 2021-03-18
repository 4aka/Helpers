package Structures;

class Private {
    private final int result;

    Private(int first, int second) {
        result = first * second;
    }

    int get_private() {
        return result;
    }
}

class Main2 {

    public static void main(String[] args) {
        Private s = new Private(1, 2);

        System.out.println(s.get_private());
    }
}