package Structures;

class Public {
    int a;
    int b;
    int result;

    Public(int first, int second) {
        this.a = first;
        this.b = second;
        this.result = a * b;
    }

    int get_public() {
        return this.result;
    }
}

class Main {

    public static void main(String[] args) {
        Hide s = new Hide(1, 2);

        System.out.println(s.get_hiden());
    }
}