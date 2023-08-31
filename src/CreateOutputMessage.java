public interface CreateOutputMessage {

    default String createOutputMessage(String valueFromInput, String matchedOption){
        return valueFromInput + " stands for " + matchedOption;
    }
}
