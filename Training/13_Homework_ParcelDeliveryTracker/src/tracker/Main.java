package tracker;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Parcel p1 = new Parcel("P001", "in transit", "New York");
        Parcel p2 = new Parcel("P002", "lost", "Chicago");
        Parcel p3 = new Parcel("P003", "delivered", "New York");
        Parcel p4 = new Parcel("P004", "lost", "Houston");

        DeliveryService service = new DeliveryService();
        service.addParcel(p1);
        service.addParcel(p2);
        service.addParcel(p3);
        service.addParcel(p4);

        System.out.println("🔍 Lost Parcels:");
        List<Parcel> lostParcels = service.findLostParcels();
        for (Parcel parcel : lostParcels) {
            parcel.track();
        }

        System.out.println("\n📍 Parcels in New York:");
        List<Parcel> nyParcels = service.findParcelsInCity("New York");
        for (Parcel parcel : nyParcels) {
            parcel.track();
        }
    }
}

