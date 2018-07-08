package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Location;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-08T09:52:39")
@StaticMetamodel(Movie.class)
public class Movie_ { 

    public static volatile SingularAttribute<Movie, Integer> year;
    public static volatile SingularAttribute<Movie, String> name;
    public static volatile SingularAttribute<Movie, String> genre;
    public static volatile SingularAttribute<Movie, Integer> id;
    public static volatile CollectionAttribute<Movie, Location> locationCollection;

}