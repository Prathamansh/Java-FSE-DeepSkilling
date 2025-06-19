public class BuilderPatternTest {
    public static void main(String[] args) {
        // Basic computer
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();
        System.out.println("Basic Computer: " + basicComputer);
        // Gaming computer
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                                        .setGraphicsCard("NVIDIA RTX 4090")
                                        .setStorage("1TB SSD")
                                        .setOperatingSystem("Windows 11")
                                        .build();
        System.out.println("Gaming Computer: " + gamingComputer);
        // Workstation
        Computer workstation = new Computer.Builder("AMD Ryzen 9", "64GB")
                                      .setGraphicsCard("AMD Radeon Pro")
                                      .setStorage("2TB SSD")
                                      .setOperatingSystem("Linux Ubuntu")
                                      .build();
        System.out.println("Workstation: " + workstation);
    }
}
