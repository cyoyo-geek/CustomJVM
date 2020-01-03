package instructions;

public class Test {
    int chooseNear(int i) {
        switch (i) {
            case 0: return 0;
            case 1: return 1;
            case 2: return 2;
            default: return -1;
        }
    }

    int chooseFar(int i) {
        switch (i) {
            case -100: return -1;
            case 0: return 0;
            case 100: return 1;
            default: return -1;
        }
    }

    public static void main(String[] args) {

    }
}
