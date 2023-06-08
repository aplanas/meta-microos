SUMMARY = "Dependency package for netcdf-fortran_4_5_3-gnu-hpc-devel"
DESCRIPTION = "netcdf-fortran: Command-line programs for the NetCDF scientific data format \
The package netcdf-fortran-gnu-hpc-devel provides the dependency to get binary package netcdf-fortran_4_5_3-gnu-hpc-devel. \
When this package gets updated it installs the latest version of netcdf-fortran_4_5_3-gnu-hpc."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran-gnu-hpc-devel-4.5.3-4.5.noarch.rpm"
RPM_HASH = "8acf211b4f5989a1726afd8e776bb9fe5232761432575cbdc507bc788779c9f8af6fb1f304636d9124a1b659992cb1c8beddcfedd64e03999a214379a304bb99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-fortran-gnu-hpc netcdf-fortran-gnu-hpc-devel"
RDEPENDS:${PN} += "netcdf-fortran_4_5_3-gnu-hpc-devel"

inherit rpm
