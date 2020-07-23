package example;

public class ProcessController {

    public String processControl(int frequency, String result) {
        if (frequency > 6 || !"4A0B".equals(result)) {
            return "Fail";
        }
        return "Success";
    }

}
