package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

// Product entity manage by the ORM
@Entity
public class Category extends Model {

    //Properties
    // Annotate id as the primary key
    @Id
    private Long id;

    @Constraints.Required
    private String name;

    @OneToMany
    private List<Product> products;


    // Default Constructor
    public Category(){
    }

    // Generic query helper for entity Category with id of type Long
    public static Finder<Long, Category> find = new Finder<Long, Category>(Category.class); // final ?? 
        
    // Return an array list of all Categories objects
    public static  List<Category> findAll(){   // final ?? should be ??
        return Category.find.query().where().orderBy("name asc").findList();
    }

    // Constructor to initialise object
    public Category(Long id, String name, List<Product> products){
        this.id= id;
        this.name = name;
        this.products = products;
         
    }

    // Generate options for an HTML select control
    public static Map<String,String> options(){
        LinkedHashMap<String,String> options = new LinkedHashMap<>();

        //get all categories from the DB and add to the options Hash map
        for(Category c: Category.findAll()){
            options.put(c.getId().toString(), c.getName());
        }
        return options;
    }


    // setters

    public void setId(Long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setProduct(List<Product> products){
        this.products = products;
    }

    // getter 
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public List<Product> getProducts(){
        return products;
    }





/*
    // Generic query helper for entity Product with id of type Long
    public static final Finder<Long, Customer> find = new Finder<>(Customer.class);

    // Return an array list of all product objects
    public static final List<Customer> findAll(){
        return Customer.find.all();
    }
    // Accessory methods
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getFName(){
        return fName;
    }
    public void setFName(String fName){
        this.fName = fName;
    }


    public String getLName(){
        return this.lName;
    }
    
    public void setLName(String lName){
        this.lName = lName;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
*/
}