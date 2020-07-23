package example;

public class ProcessController {

    public boolean processControl(int frequency, String result) {
        return frequency <= 6 && "4A0B".equals(result);
    }

}
