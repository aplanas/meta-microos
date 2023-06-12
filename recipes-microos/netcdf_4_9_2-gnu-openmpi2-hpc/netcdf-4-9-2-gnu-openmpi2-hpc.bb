SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi2 version of utility functions for working with NetCDF files \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi2-hpc-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "91ebc2c9d2cc67789afea3698f6162af50b1d69c7a2a213050b9a7e12429aad58a6bde21ef35791a2dcb7d62ead878688f60a1c882cd8b2ec1b3a7c48309c298"

RPROVIDES:${PN} += "netcdf_4_9_2-gnu-openmpi2-hpc \
netcdf_4_9_2-gnu-openmpi2-hpc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libnetcdf_4_9_2-gnu-openmpi2-hpc"

inherit rpm
