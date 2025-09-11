package hu.codehunters.parcel;

import java.util.Objects;

public class Parcel {

    private String id;
    private String status;
    private String location;

    public Parcel() {

    }

    public Parcel(String id, String status, String location) {
        this.id = id;
        this.status = status;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
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
