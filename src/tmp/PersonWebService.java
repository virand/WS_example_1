package tmp;

/**
 * Created by artemsolonin on 12.05.2017.
 */

/*
Класс-реализация веб-сериса. Данный сервис предоставляет одну операцию - getPersons
@WebService используется для того, чтобы маркировать класс, коорый должен предоставлять функциональность через веб-сервис
@WebMethod - маркер метода, который будет являться операцией веб-сервиса

 */

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;


/**
 *
 */
@WebService(serviceName = "PersonService")
public class PersonWebService {

          @WebMethod(operationName = "getPersons")
        public List<Person> getPersons(){
              PostgreSQLDAO dao = new PostgreSQLDAO();
              List<Person> persons = dao.getPersons();
              return persons;
          }
}
