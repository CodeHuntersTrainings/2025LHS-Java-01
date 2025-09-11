package hu.codehunters.parcel;

import java.util.ArrayList;
import java.util.List;

public class DeliveryService {

    private final List<Parcel> parcels = new ArrayList<>();

    public void add(Parcel parcel) {
        parcels.add(parcel);
    }

    public List<Parcel> findLostParcels() {
        List<Parcel> result = new ArrayList<>();

        for (Parcel parcel : parcels) {
            if ("lost".equals(parcel.getStatus())) {
                result.add(parcel);
            }
        }

        return parcels;
    }

    public List<Parcel> findParcelsByLocation(String location) {
        List<Parcel> result = new ArrayList<>();

        if (location == null) {
            return result;
        }

        for (Parcel parcel : parcels) {
            if (location.equals(parcel.getLocation())) {
                result.add(parcel);
            }
        }

        return result;
    }
}
