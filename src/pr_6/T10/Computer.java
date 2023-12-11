package pr_6.T10;


public enum Computer {
    APPLE (50000, "Intel", 6, 3, 500, 2000, "2K"),
    ASUS (30000, "AMD", 8, 2, 458, 1000, "4K"),
    HONOR (25000, "AMD", 4, 1, 800, 4000, "8K");
    private final int cost;
    final Processor processor;
    final Memory memory;
    final Monitor monitor;
    Computer(int computerCost, String ProcMaker, int ProcCores, int MemGig, int MemSpeed, int MonCost, String MonFormat) {
        cost = computerCost;
        processor = new Processor(ProcMaker, ProcCores);
        memory = new Memory(MemGig, MemSpeed);
        monitor = new Monitor(MonCost, MonFormat);
    }

    public int getCost() {
        return cost;
    }

    public String Information() {
        return  Computer.this +" {" +
                "\ncost=" + cost +
                "\nprocessor Maker:" + processor.getMaker() +
                "\nprocessor Cores:" + processor.getCores() +
                "\nmemory Size: " + memory.getGigabyte() +
                "\nmemory Speed: " + memory.getSpeed() +
                "\nmonitor Cost: " + monitor.getCost() +
                "\nmonitor Format: " + monitor.getFormat() +
                "\n}";
    }
}
