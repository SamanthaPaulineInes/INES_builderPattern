package BuilderPattern;
public class EcommerceApp
{
    public static void main(String[] args)
    {
        System.out.print("\nWELCOME TO BUILDER PATTERN");
        System.out.print("\nINES, SAMANTHA PAULINE | 3 BSCS 2 | LAB 1: BUILDER PATTERN");
        System.out.print("\n==========================================================");

        User user = new User.BuilderPattern()
                .firstName("Samantha Pauline")
                .lastName("Ines")
                .phone("00000000000")
                .address("Quezon City, Metro Manila")
                .email("samantha.ines@neu.edu.ph")
                .age(22)
                .build();

        System.out.print("\nUSER DETAILS:");
        System.out.print("\nFirstname: " + user.firstName);
        System.out.print("\nLastname: " + user.lastName);
        System.out.print("\nAge: " + user.age);
        System.out.print("\nAddress: " + user.address);
        System.out.print("\nPhone #: " + user.phone);
        System.out.print("\nE-mail: " + user.email);
        System.out.print("\n\nTHANK YOU!\n");
    }
}
