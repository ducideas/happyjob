package com.example.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(JPUser.class)
public abstract class JPUser_ {

	public static volatile SingularAttribute<JPUser, String> password;
	public static volatile SingularAttribute<JPUser, String> role;
	public static volatile SingularAttribute<JPUser, Long> id;
	public static volatile SingularAttribute<JPUser, Boolean> enabled;
	public static volatile SingularAttribute<JPUser, String> username;

}

