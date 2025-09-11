package hu.codehunters.parcel.steps;

import hu.codehunters.parcel.DeliveryService;
import hu.codehunters.parcel.Parcel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class DeliveryServiceSteps {

    private DeliveryService deliveryService;

    public DeliveryService getDeliveryService() {
        return deliveryService;
    }

    @Given("the Service is running")
    public void the_service_is_running() {
        deliveryService = new DeliveryService();
    }

    @Then("Parcel id: {string} must be returned from the DeliveryService as a lost package")
    public void parcel_id_must_be_returned_from_the_delivery_service_as_a_lost_package(String id) {
        List<Parcel> lostParcels = deliveryService.findLostParcels();

        boolean idFound = false;
        for (Parcel parcel : lostParcels) {
            if (parcel.getId().equals(id)) {
                idFound = true;
            }
        }

        Assertions.assertTrue(idFound);
    }

}
