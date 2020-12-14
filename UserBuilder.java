public class UserBuilder {
    
    public static User createUser() {
       
        User create = new User();
        create.setUsername("Martin");
        create.setPassword("halohalo");

        return create.getUser();
    }
}