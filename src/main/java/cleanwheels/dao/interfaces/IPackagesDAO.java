package cleanwheels.dao.interfaces;


import cleanwheels.model.Packages;
import cleanwheels.model.User;

import java.util.List;

/**
 * Created by sarvaraj.singh on 28-09-2017.
 */
public interface IPackagesDAO {

    public List<Packages> findPackageByCity(String city);
    public Packages findPackageByCityAndCategory(String category, String city);
    public List<Packages> getAllPackages();
}
