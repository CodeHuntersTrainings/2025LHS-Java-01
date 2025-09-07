package tracker;

import java.util.Objects;

public class Parcel {

    private final String id;
    private String status;
    private String location;

    public Parcel(String id, String status, String location) {
        this.id = id;
        this.status = status;
        this.location = location;
    }

    public void updateStatus(String newStatus) {
        if (newStatus != null && !newStatus.trim().isEmpty()) {
            this.status = newStatus;
        }
    }

    public void updateLocation(String newLocation) {
        if (newLocation != null && !newLocation.trim().isEmpty()) {
            this.location = newLocation;
        }
    }

    public void track() {
        System.out.println("Parcel at " + location + " with status: " + status);
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Parcel parcel = (Parcel) o;
        return Objects.equals(id, parcel.id) && Objects.equals(status, parcel.status) && Objects.equals(location, parcel.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, location);
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}