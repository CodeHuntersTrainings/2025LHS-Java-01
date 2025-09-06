package hu.codehunters;

public class BugTracker {
    public static void main(String[] args) {
        String inputPath = System.getProperty("bug.input");
        String outputPath = System.getProperty("bug.output");

        if (inputPath == null || inputPath.isEmpty()) {
            System.err.println("Please specify -Dbug.input=...");
            return;
        }

        if (outputPath == null || outputPath.isEmpty()) {
            System.err.println("Please specify -Dbug.output=...");
            return;
        }

        if (args.length > 0 && "list".equalsIgnoreCase(args[0])) {
            HistoryService historyService = new HistoryService(outputPath);
            historyService.listBugs();

        } else {
            DataProcessor processor = new DataProcessor(inputPath, outputPath);
            processor.readBugs();
        }
    }
}
