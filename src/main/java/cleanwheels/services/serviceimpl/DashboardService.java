package cleanwheels.services.serviceimpl;

import cleanwheels.dao.interfaces.IPackagesDAO;
import cleanwheels.model.Dashboard;
import cleanwheels.services.interfaces.IDashboardService;
import cleanwheels.services.interfaces.IPackagesService;
import cleanwheels.services.interfaces.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Sarvaraj.Singh on 05-10-2017.
 */
@Service
public class DashboardService implements IDashboardService {
    @Autowired
    private IPackagesDAO packagesDAO;

    @Autowired
    private IPackagesService packagesService;

    @Autowired
    private IVehicleService vehicleService;

    @Override
    public Boolean getDashboardContent(Dashboard dashboard) {
        return null;
    }
}
