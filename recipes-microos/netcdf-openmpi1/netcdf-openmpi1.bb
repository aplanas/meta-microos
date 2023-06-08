SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi1 version of utility functions for working with NetCDF files."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi1-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "4fda34e06c265233ee7db314949155d7f470bc6fd181980102395d0f0349d146cf3bad1ffa8c4bba555f9be9ea1eb32519f2a223c224db2e174827427460c9ad"

RPROVIDES:${PN} += "netcdf-openmpi1 netcdf-openmpi1(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libhdf5.so.200()(64bit) libnetcdf.so.19()(64bit) libnetcdf19-openmpi1"

inherit rpm
