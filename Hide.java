package Structures;

class Hide {
    int a;
    int b;
    int result;

    Hide(int a, int b) {
        this.a = a;
        this.b = b;
        this.result = a * b;
    }

    int get_hiden() {
        return this.result;
    }
}

class MainHide {

    public static void main(String[] args) {
        Hide s = new Hide(1, 2);

        System.out.println(s.get_hiden());
    }
}