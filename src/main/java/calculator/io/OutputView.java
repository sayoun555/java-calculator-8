package calculator.io;

public class OutputView {
    private final String OUTPUT_MESSAGE = "결과 : ";

    public void outputResult(long result){
        System.out.println(OUTPUT_MESSAGE + result);
    }
}