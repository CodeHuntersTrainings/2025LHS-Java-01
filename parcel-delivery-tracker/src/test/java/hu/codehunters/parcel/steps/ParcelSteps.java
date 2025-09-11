package hu.codehunters.parcel.steps;

import hu.codehunters.parcel.DeliveryService;
import hu.codehunters.parcel.Parcel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ParcelSteps {

    private Parcel parcel;
    private DeliveryServiceSteps deliveryServiceSteps;

    public ParcelSteps(DeliveryServiceSteps deliveryServiceSteps) {
        this.deliveryServiceSteps = deliveryServiceSteps;
    }

    @Given("a Parcel with id: {string}, status: {string}, location: {string}")
    public void a_parcel_with_id_status_location(String id, String status, String location) {
       parcel = new Parcel(id, status, location);
    }

    @Given("It is registered in the DeliveryService")
    public void it_is_registered_in_the_delivery_service() {
        deliveryServiceSteps.getDeliveryService().add(parcel);
    }

    @When("the Parcel is lost")
    public void parcel_id_is_lost() {
        parcel.setStatus("lost");
    }
}
