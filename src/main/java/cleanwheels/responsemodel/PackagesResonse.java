package cleanwheels.responsemodel;

import cleanwheels.model.Packages;

import java.util.List;

/**
 * Created by Sarvaraj.Singh on 26-09-2017.
 */
public class PackagesResonse {
    List<Packages> all_packages;

    Packages monthly_package;

    public Packages getMonthly_package() {
        return monthly_package;
    }

    public void setMonthly_package(Packages monthly_package) {
        this.monthly_package = monthly_package;
    }

    public List<Packages> getPackages() {
        return all_packages;
    }

    public void setPackages(List<Packages> packages) {
        this.all_packages = packages;
    }
}
