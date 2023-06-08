SUMMARY = "Dependency package for netcdf-fortran_4_5_3-gnu-openmpi4-hpc-devel"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package netcdf-fortran-gnu-openmpi4-hpc-devel provides the dependency to get binary package netcdf-fortran_4_5_3-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-openmpi4-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran-gnu-openmpi4-hpc-devel-4.5.3-4.4.noarch.rpm"
RPM_HASH = "93207ba138703b68418a63e3eb647330bfc3abc244acb0ba0e25deeca401d2e4179e2df45d6020bcbe7c14bd62b673d977713c100f5b85ea06c37e23d8e3e853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-fortran-gnu-openmpi4-hpc netcdf-fortran-gnu-openmpi4-hpc-devel"
RDEPENDS:${PN} += "netcdf-fortran_4_5_3-gnu-openmpi4-hpc-devel"

inherit rpm
