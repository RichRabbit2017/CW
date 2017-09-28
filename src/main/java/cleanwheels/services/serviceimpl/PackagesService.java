package cleanwheels.services.serviceimpl;

import cleanwheels.dao.interfaces.IPackagesDAO;
import cleanwheels.dao.interfaces.IUserDAO;
import cleanwheels.model.Packages;
import cleanwheels.services.interfaces.IPackagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sarvaraj.singh on 28-09-2017.
 */
@Service
public class PackagesService implements IPackagesService {
    @Autowired
    private IPackagesDAO packagesDAO;
    @Override
    public List<Packages> findPackageByCity(String city) {
         return packagesDAO.findPackageByCity(city);
    }

    @Override
    public Packages findPackageByCityAndCategory(String category, String city) {
        return packagesDAO.findPackageByCityAndCategory(category,city);
    }

    @Override
    public List<Packages> getAllPackages() {
        return packagesDAO.getAllPackages();
    }
}
