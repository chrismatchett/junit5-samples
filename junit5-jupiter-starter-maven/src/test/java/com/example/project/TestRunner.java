// package com.example.project;

// import org.junit.platform.launcher.Launcher;
// import org.junit.platform.launcher.LauncherDiscoveryRequest;
// import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
// import org.junit.platform.launcher.core.LauncherFactory;
// import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
// import org.junit.platform.launcher.listeners.TestExecutionSummary;
// import org.junit.platform.engine.discovery.DiscoverySelectors;

// public class TestRunner {
//    public static void main(String[] args) {
//       // Create a request to discover the test class
//       LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
//          .selectors(DiscoverySelectors.selectClass(MathApplicationTester.class))  // Select the test class
//          .build();

//       // Create the launcher and listener
//       Launcher launcher = LauncherFactory.create();
//       SummaryGeneratingListener listener = new SummaryGeneratingListener();

//       // Execute the tests
//       launcher.execute(request, listener);

//       // Get the summary of test execution
//       TestExecutionSummary summary = listener.getSummary();

//       // Print any failures
//       summary.getFailures().forEach(failure ->
//          System.out.println(failure.getTestIdentifier().getDisplayName() + ": " + failure.getException())
//       );

//       // Print whether the tests were successful or not
//       System.out.println("Test successful: " + (summary.getTotalFailureCount() == 0));
//    }
// }
