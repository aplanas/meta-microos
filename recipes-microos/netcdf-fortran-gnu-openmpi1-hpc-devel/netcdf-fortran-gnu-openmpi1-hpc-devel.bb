SUMMARY = "Dependency package for netcdf-fortran_4_5_3-gnu-openmpi1-hpc-devel"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package netcdf-fortran-gnu-openmpi1-hpc-devel provides the dependency to get binary package netcdf-fortran_4_5_3-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-openmpi1-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran-gnu-openmpi1-hpc-devel-4.5.3-4.5.noarch.rpm"
RPM_HASH = "59ca221d1ddbc6283a0f258eb7117e10c7b6d4b2f8c0bf2a79ad8de4567ff2a569c8439b58b2fc37f28a9475c56624b690882ad2775196275201b2d932573738"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-fortran-gnu-openmpi1-hpc netcdf-fortran-gnu-openmpi1-hpc-devel"
RDEPENDS:${PN} += "netcdf-fortran_4_5_3-gnu-openmpi1-hpc-devel"

inherit rpm
