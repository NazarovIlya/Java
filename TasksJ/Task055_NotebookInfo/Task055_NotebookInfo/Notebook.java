package Task055_NotebookInfo;

public class Notebook {
    private int id;
    private String manufacturer;
    private String model;
    private String colour;
    private double diagonal;
    private String cpuType;
    private String diskType;
    private double cpuFrequency;
    private int RAM;
    private int diskValue;
    private String osType;

    // Конструкторы
    public Notebook(int countNotebooks, String manufacturer, String model, String colour,
            double diagonal, String cpuType, String diskType,
            double cpuFrequency, int RAM, int diskValue, String osType) {
        this.id = ++countNotebooks;
        this.manufacturer = manufacturer;
        this.model = model;
        this.colour = colour;
        this.diagonal = diagonal;
        this.cpuType = cpuType;
        this.diskType = diskType;
        this.cpuFrequency = cpuFrequency;
        this.RAM = RAM;
        this.diskValue = diskValue;
        this.osType = osType;
    }

    public Notebook() {
    }

    // геттеры/сеттеры (на всякий случай все)
    public int getID() {
        return this.id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getManufactorer() {
        return this.manufacturer;
    }

    public void setMaufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getDiagonal() {
        return this.diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getCPUType() {
        return cpuType;
    }

    public void setCPUType(String cpuType) {
        this.cpuType = cpuType;
    }

    public String getDiskType() {
        return this.diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public double getCPUFrequency() {
        return this.cpuFrequency;
    }

    public void setCPUFreqency(double cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    public int getRAM() {
        return this.RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getDiskValue() {
        return this.diskValue;
    }

    public void setDiskValue(int diskValue) {
        this.diskValue = diskValue;
    }

    public String getOSType() {
        return this.osType;
    }

    public void setOSType(String osType) {
        this.osType = osType;
    }

    public String getInfo() {
        return this.toString();
    }

    @Override
    public String toString() {
        return String.format(
                "ID: %d,\nManufactorer: %s\nModel: %s\nColour: %s\nDiagonal: %.1f\nCPU type: %s\nDisk type: %s\nCPU frequency: %.1f\nRAM value: %d\nHard disk value: %d\nOS: %s",
                id,
                manufacturer, model, colour, diagonal, cpuType, diskType, cpuFrequency, RAM, diskValue, osType);
    }
}