package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Operation;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-03T20:16:23")
@StaticMetamodel(Worker.class)
public class Worker_ { 

    public static volatile SingularAttribute<Worker, String> password;
    public static volatile CollectionAttribute<Worker, Operation> operationCollection;
    public static volatile SingularAttribute<Worker, Integer> idWorker;
    public static volatile SingularAttribute<Worker, Integer> workExp;
    public static volatile SingularAttribute<Worker, String> position;
    public static volatile SingularAttribute<Worker, Integer> salary;
    public static volatile SingularAttribute<Worker, String> login;
    public static volatile SingularAttribute<Worker, String> fio;

}