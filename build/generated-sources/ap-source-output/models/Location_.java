package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Movie;
import models.User;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-08T09:52:39")
@StaticMetamodel(Location.class)
public class Location_ { 

    public static volatile SingularAttribute<Location, String> date;
    public static volatile SingularAttribute<Location, User> idUser;
    public static volatile SingularAttribute<Location, Movie> idMovie;
    public static volatile SingularAttribute<Location, Integer> id;

}