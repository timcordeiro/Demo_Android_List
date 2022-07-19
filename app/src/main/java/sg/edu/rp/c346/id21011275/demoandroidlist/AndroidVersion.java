package sg.edu.rp.c346.id21011275.demoandroidlist;

public class AndroidVersion {
    private String name;
    private String version;

    public AndroidVersion(String name, String Version){
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "AndroidVersion{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
