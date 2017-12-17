package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class User extends Model {

    //Properties
    @Id
    private String email;

    @Constraints.Required
    private String role;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String password;



    // Default Constructor
    public User(){
    }

    // Constructor to initialise object
    public User( String email, String role, String name ,String password){
        this.email= email;
        this.role = role;
        this.name = name;
        this.password = password;
    }

    // Generic query helper for entity Product with id of type Long
    public static  Finder<String, User> find = new Finder<String, User>(User.class);

    // Find all  users in the database    
    public static List<User> findAll(){
        return User.find.all();
    }

    // Static method to authenticate based on username and pasword
    // Returns user object if found , otherwise NULL
    public static User authenticate(String email, String password){
        return find.query().where().eq("email", email).eq("password", password).findUnique();
    }

    // getters and setters

    public String getEmail (){
        return this.email  ;
    }
    public void setEmail (String email ){
        this.email = email ;
    }

    public String getRole (){
        return this.role  ;
    }
    public void setRole (String role ){
        this.role = role ;
    }

    public String getName (){
        return this.name  ;
    }
    public void setName (String name ){
        this.name = name ;
    }

    public String getPassword (){
        return this.password  ;
    }
    public void setPassword (String password ){
        this.password = password ;
    }
    
    // check if a user is logged in (by id - email address)
    public static User getUserById(String id){
        if (id == null){
            return null;
        } else {
            // Find user by id and return object
            return find.byId(id);
        }
    }
 
}