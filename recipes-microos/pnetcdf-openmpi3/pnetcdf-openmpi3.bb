SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
Parallel netCDF (PnetCDF) is a library providing high-performance I/O while \
still maintaining file-format compatibility with NetCDF by Unidata. \
 \
This package contains the openmpi version of utility functions for \
working with NetCDF files."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-openmpi3-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "ffdba26567cf05887923f95500f6d3d663e7545ad95be61c358c42392bab59f7fe614bde9b15656b9cadbf72fe0d8bc9ae7ad3c8d0a0d5f2d34f5e53ea73c9c0"

RPROVIDES:${PN} += "parallel-netcdf-openmpi3 pnetcdf-openmpi3 pnetcdf-openmpi3(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libmpi.so.40()(64bit) libpnetcdf.so.4()(64bit) libpnetcdf4-openmpi3 openmpi3"

inherit rpm
