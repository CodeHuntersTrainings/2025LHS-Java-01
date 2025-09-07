package tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.List;

public class DeliveryService {

    private final List<Parcel> parcels;

    public DeliveryService() {
        this.parcels = new ArrayList<>();
    }

    public void addParcel(Parcel parcel) {
        if (parcel != null) {
            parcels.add(parcel);
        }
    }

    public List<Parcel> findLostParcels() {
        List<Parcel> lostParcels = new ArrayList<>();
        for (Parcel parcel : parcels) {
            if ("lost".equalsIgnoreCase(parcel.getStatus())) {
                lostParcels.add(parcel);
            }
        }
        return lostParcels;
    }

    public List<Parcel> findParcelsInCity(String city) {
        List<Parcel> result = new ArrayList<>();
        for (Parcel parcel : parcels) {
            if (city.equalsIgnoreCase(parcel.getLocation())) {
                result.add(parcel);
            }
        }
        return result;
    }

    public List<Parcel> getAllParcels() {
        return new ArrayList<>(parcels); // Return copy to prevent external modification
    }
}
