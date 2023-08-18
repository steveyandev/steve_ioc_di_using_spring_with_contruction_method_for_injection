package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{
    //couplage faible
    // on met =null car fire =new  reviens a utiliser une classe donc couplage fort
    //private IDao dao=null;

    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }

    //setDao permet d'injecter dans la variable dao un object
    // d'une classe qui implemente l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
