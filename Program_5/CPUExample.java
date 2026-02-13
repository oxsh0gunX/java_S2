import java.util.Scanner;

class CPUExample {
    private double price;

    public CPUExample(double price) {
        this.price = price;
    }

    class Processor {
        private int cores;
        private String manufacturer;

        public Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        public void display() {
            System.out.println("Processor Info:");
            System.out.println("Cores: " + cores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    static class RAM {
        private int memory;
        private String manufacturer;

        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public void display() {
            System.out.println("RAM Info:");
            System.out.println("Memory: " + memory + " GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    public void displayPrice() {
        System.out.println("CPU Price: $" + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cpuPrice = sc.nextDouble();
        int cores = sc.nextInt();
        sc.nextLine();
        String processorManufacturer = sc.nextLine();
        int ramMemory = sc.nextInt();
        sc.nextLine();
        String ramManufacturer = sc.nextLine();

        CPUExample cpu = new CPUExample(cpuPrice);
        CPUExample.Processor processor = cpu.new Processor(cores, processorManufacturer);
        CPUExample.RAM ram = new CPUExample.RAM(ramMemory, ramManufacturer);

        cpu.displayPrice();
        processor.display();
        ram.display();

        sc.close();
    }
}
