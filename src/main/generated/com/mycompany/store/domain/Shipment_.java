package com.mycompany.store.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Shipment.class)
public abstract class Shipment_ {

	public static volatile SingularAttribute<Shipment, Instant> date;
	public static volatile SingularAttribute<Shipment, String> trackingCode;
	public static volatile SingularAttribute<Shipment, String> details;
	public static volatile SingularAttribute<Shipment, Long> id;
	public static volatile SingularAttribute<Shipment, Invoice> invoice;

	public static final String DATE = "date";
	public static final String TRACKING_CODE = "trackingCode";
	public static final String DETAILS = "details";
	public static final String ID = "id";
	public static final String INVOICE = "invoice";

}
