package com.example.rentalapartmentapp.Model;

public enum Bedrooms {
    NONE, STUDIO, ONE, TWO, THREE, MORE_THAN_THREE;

    public static Bedrooms getBedroom(String bedroomsType) {
        switch (bedroomsType) {
            case "NONE":
                return Bedrooms.NONE;
            case "STUDIO":
                return Bedrooms.STUDIO;
            case "ONE":
                return Bedrooms.ONE;
            case "TWO":
                return Bedrooms.TWO;
            case "THREE":
                return Bedrooms.THREE;
            case "MORE_THAN_THREE":
                return Bedrooms.MORE_THAN_THREE;
            default:
                return Bedrooms.NONE;
        }
    }
}
