package BuilderPattern;
public class User
{
    protected final String firstName;
    protected final String lastName;
    protected final String email;
    protected final String address;
    protected final String phone;
    protected final Integer age;

    private User(BuilderPattern builder)
    {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
    }

    protected final static class BuilderPattern
    {
        private String firstName;
        private String lastName;
        private String email;
        private String address;
        private String phone;
        private Integer age;

        public BuilderPattern firstName(String firstname)
        {
            this.firstName = firstname;
            return this;
        }
        public BuilderPattern lastName(String lastname)
        {
            this.lastName = lastname;
            return this;
        }
        public BuilderPattern email(String email)
        {
            this.email = email;
            return this;
        }
        public BuilderPattern address(String address)
        {
            this.address = address;
            return this;
        }
        public BuilderPattern phone(String phone)
        {
            this.phone = phone;
            return this;
        }
        public BuilderPattern age(Integer age)
        {
            this.age = age;
            return this;
        }
        public User build()
        {
            return new User(this);
        }
    }
}
