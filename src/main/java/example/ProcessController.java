package example;

public class ProcessController {

    public String processControl(int frequency, String result) {
        if (frequency > 6) {
            return "Fail";
        }
        if ("4A0B".equals(result)) {
            return "Success";
        }
        return result;
    }

}
