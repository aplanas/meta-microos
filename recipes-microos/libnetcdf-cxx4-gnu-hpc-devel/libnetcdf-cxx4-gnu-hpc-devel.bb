SUMMARY = "Dependency package for libnetcdf-cxx4_4_3_1-gnu-hpc-devel"
DESCRIPTION = "netcdf-cxx4: C++ library for the Unidata network Common Data Form version 4 \
The package libnetcdf-cxx4-gnu-hpc-devel provides the dependency to get binary package libnetcdf-cxx4_4_3_1-gnu-hpc-devel. \
When this package gets updated it installs the latest version of netcdf-cxx4_4_3_1-gnu-hpc."
LICENSE = "NetCDF"

PV = "4.3.1"

RPM_NAME = "libnetcdf-cxx4-gnu-hpc-devel-4.3.1-6.5.aarch64.rpm"
RPM_HASH = "90d1d743f0abe33001734882f574089f25469ae61d67a21ddaae8682467207ccec58cb73850e3a0616cf6c86736071da1ca8ab9d2c6bcd6f47490fd263bad8e6"

RPROVIDES:${PN} += "libnetcdf-cxx4-gnu-hpc-devel libnetcdf-cxx4-gnu-hpc-devel(aarch-64) netcdf-cxx4-gnu-hpc-tools"
RDEPENDS:${PN} += "libnetcdf-cxx4_4_3_1-gnu-hpc-devel"

inherit rpm
