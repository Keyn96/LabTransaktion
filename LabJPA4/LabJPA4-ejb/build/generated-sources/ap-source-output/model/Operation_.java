package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Material;
import model.Worker;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-03T20:16:23")
@StaticMetamodel(Operation.class)
public class Operation_ { 

    public static volatile CollectionAttribute<Operation, Material> materialCollection;
    public static volatile SingularAttribute<Operation, Integer> cost;
    public static volatile SingularAttribute<Operation, Integer> idOperation;
    public static volatile SingularAttribute<Operation, Worker> idWorker;
    public static volatile SingularAttribute<Operation, Integer> numberInvoice;
    public static volatile SingularAttribute<Operation, String> type;

}