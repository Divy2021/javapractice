package multiThreading;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;


public class HugeLinesofCode {



	    public static void main(String[] args) throws InterruptedException, ExecutionException {
	        // Number of lines to process
	        int totalLines = 1000000;
	        
	        // Number of threads to use (adjust based on your system's capabilities)
	        int numThreads = 10;
	        
	        // Create a thread pool with numThreads
	        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

	        // Define a task to process chunks of lines
	        int chunkSize = totalLines / numThreads;
	        
	        // List to hold Future objects to track progress
	        List<Future<Void>> futures = new ArrayList<>();
	        
	        for (int i = 0; i < numThreads; i++) {
	            int startLine = i * chunkSize;
	            int endLine = (i == numThreads - 1) ? totalLines : (i + 1) * chunkSize;
	            
	            // Submit a task to process a chunk of lines
	            futures.add(executorService.submit(new LineProcessorTask(startLine, endLine)));
	        }

	        // Wait for all tasks to complete
	        for (Future<Void> future : futures) {
	            future.get();
	        }

	        // Shutdown the executor service
	        executorService.shutdown();
	        
	        System.out.println("Processing complete!");
	    }

	    // Task that processes lines of code in a given range
	    static class LineProcessorTask implements Callable<Void> {
	        private int startLine;
	        private int endLine;

	        public LineProcessorTask(int startLine, int endLine) {
	            this.startLine = startLine;
	            this.endLine = endLine;
	        }

	        @Override
	        public Void call() throws Exception {
	            // Simulate processing each line
	            for (int i = startLine; i <= endLine; i++) {
	                // Simulating a task, like processing a line of code
	                processLine(i);
	            }
	            return null;
	        }

	        // Simulate line processing
	        private void processLine(int lineNumber) {
	            // Here we just simulate the task by printing or doing some work
	            if (lineNumber % 10000 == 0) {
	                System.out.println("Processing line: " + lineNumber);
	            }
	        }
	    }
	}

