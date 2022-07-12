package com.praveen.samples.jacoco.multimodule;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class Module1ClassIntegrationTest {

  @Test
  public void runKarateTests() {
    Results results = Runner
            .path("classpath:com/praveen/samples/jacoco/multimodule")
            .parallel(1);

    Assertions.assertEquals(0, results.getFeaturesFailed());
    // Karate.run("HelloTest.feature").relativeTo(getClass());
  }
}
