SUMMARY = "Dependency package for netcdf_4_9_2-gnu-hpc"
DESCRIPTION = "netcdf: Command-line programs for the NetCDF scientific data format \
The package netcdf-gnu-hpc provides the dependency to get binary package netcdf_4_9_2-gnu-hpc. \
When this package gets updated it installs the latest version of netcdf_4_9_2-gnu-hpc."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-gnu-hpc-4.9.2-1.1.noarch.rpm"
RPM_HASH = "da2df499b6664f70a9e9e53d1ae1392e3c9c537227f7ebdd68ff8a68fd5f6e3983149d39621e2ff4afd5649a738483602bd4a431d5b1a07a3d43932d31963422"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcdf-gnu-hpc"
RDEPENDS:${PN} += "netcdf_4_9_2-gnu-hpc"

inherit rpm
