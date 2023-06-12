SUMMARY = "Development files for pnetcdf-openmpi4"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains all files needed to create projects that use \
the openmpi version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-openmpi4-devel-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "503f170c6ca14b313c28021b423ffaac9be5efcc5c5fd825a33308f65a1a7c221a30933de62cb76d8d61171c7c505e2d9f39782359e7c29803395bd8dc6af124"

RPROVIDES:${PN} += "parallel-netcdf-openmpi4-devel \
pkgconfig(pnetcdf) \
pnetcdf-openmpi4-devel \
pnetcdf-openmpi4-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpnetcdf4-openmpi4 \
openmpi4-devel \
pnetcdf-devel-data"

inherit rpm
