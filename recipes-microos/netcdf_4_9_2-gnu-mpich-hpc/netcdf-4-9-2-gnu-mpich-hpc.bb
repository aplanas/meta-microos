SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the mpich version of utility functions for working with NetCDF files \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-mpich-hpc-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "8f68be3d1e47116f81b91a103f864057e573adececc6d8d8f5accdf3807f3bd8494b5c44b4467993c3ff2d36eb7e30ca6590dbc8eccdedc553645a7194399c57"

RPROVIDES:${PN} += "netcdf_4_9_2-gnu-mpich-hpc \
netcdf_4_9_2-gnu-mpich-hpc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libnetcdf_4_9_2-gnu-mpich-hpc"

inherit rpm
