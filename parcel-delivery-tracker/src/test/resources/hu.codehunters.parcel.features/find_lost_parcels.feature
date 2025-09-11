Feature: Finding parcels
    Scenario: Finding lost packages
      Given the Service is running
      And a Parcel with id: "id-123", status: "in-delivery", location: "Debrecen"
      And It is registered in the DeliveryService

      When the Parcel is lost

      Then Parcel id: "id-123" must be returned from the DeliveryService as a lost package