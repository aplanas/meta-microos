SUMMARY = "Dependency package for netcdf_4_9_2-gnu-mpich-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-mpich-hpc provides the dependency to get binary package netcdf_4_9_2-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-mpich-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-mpich-hpc-4.9.2-1.1.noarch.rpm"
RPM_HASH = "9d97fb9d78626d635a1ee0871d0687761c929d447b89d5748086b899d085b872270fdaee68c2bccd6706554f2c86a61961cb4cd53dae6f52c62dccf52279df84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-mpich-hpc"
RDEPENDS:${PN} += "netcdf_4_9_2-gnu-mpich-hpc"

inherit rpm
