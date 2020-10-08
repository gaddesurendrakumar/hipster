package com.mycompany.store.domain;

import com.mycompany.store.domain.enumeration.InvoiceStatus;
import com.mycompany.store.domain.enumeration.PaymentMethod;
import java.math.BigDecimal;
import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Invoice.class)
public abstract class Invoice_ {

	public static volatile SingularAttribute<Invoice, Instant> date;
	public static volatile SingularAttribute<Invoice, PaymentMethod> paymentMethod;
	public static volatile SingularAttribute<Invoice, String> details;
	public static volatile SingularAttribute<Invoice, Long> id;
	public static volatile SingularAttribute<Invoice, Instant> paymentDate;
	public static volatile SingularAttribute<Invoice, BigDecimal> paymentAmount;
	public static volatile SetAttribute<Invoice, Shipment> shipments;
	public static volatile SingularAttribute<Invoice, InvoiceStatus> status;
	public static volatile SingularAttribute<Invoice, ProductOrder> order;

	public static final String DATE = "date";
	public static final String PAYMENT_METHOD = "paymentMethod";
	public static final String DETAILS = "details";
	public static final String ID = "id";
	public static final String PAYMENT_DATE = "paymentDate";
	public static final String PAYMENT_AMOUNT = "paymentAmount";
	public static final String SHIPMENTS = "shipments";
	public static final String STATUS = "status";
	public static final String ORDER = "order";

}

