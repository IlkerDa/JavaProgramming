package day05_Concetenation;
/*
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
 */
public class ShippingAddress {
    public static void main(String[] args) {

        /* String name = "James";
        String buildingNumber = "112B";
         */
        String name= "James King",
                buildingName= "92347",
                streetName = "Jones Branch Dr",
                city = "McLean",
                state= "VA",
                zipCode= "2291-A";
        String address = name+ "\n"+ buildingName + " "+ streetName+ "\n"+ city+","+state+" "+ zipCode;


        //System.out.println(name+ "\n"+ buildingName + " "+ streetName+ "\n"+ city+","+state+" "+ zipCode);
        System.out.println(address);






    }
}
