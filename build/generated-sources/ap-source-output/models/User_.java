package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Location;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-08T09:52:39")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> name;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile CollectionAttribute<User, Location> locationCollection;
    public static volatile SingularAttribute<User, String> email;

}