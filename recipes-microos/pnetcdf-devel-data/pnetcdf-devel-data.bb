SUMMARY = "Development data files for pnetcdf-openmpi1"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains generic files needed to create projects that use \
any version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-devel-data-1.12.3-1.3.noarch.rpm"
RPM_HASH = "234192aff7f74d37b582fed479f7e30bed43d4a16c9c913a4a61b55887f0bf39986942d6a88e85893bee9edc1df5d7967db996b56bbd37426a026d8993436a02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "parallel-netcdf-openmpi1-devel-data \
pnetcdf-devel-data \
rpm_macro(_pnetcdf_sonum) \
rpm_macro(_pnetcdf_version)"
RDEPENDS:${PN} += ""

inherit rpm
