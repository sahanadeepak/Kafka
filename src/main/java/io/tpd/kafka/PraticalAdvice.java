package io.tpd.kafka;



import com.fasterxml.jackson.annotation.JsonProperty;

record PracticalAdvice(@JsonProperty("message") String message,
                       @JsonProperty("identifier") int identifier) {
}

// Suppress the 'unused' warning for this test class
@SuppressWarnings("unused")
class PracticalAdviceTest {
    public static void main(String[] args) {
        PracticalAdvice advice = new PracticalAdvice("Test message", 1);
        System.out.println(advice);
    }
}