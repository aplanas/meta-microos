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

RPM_NAME = "pnetcdf_1_12_3-gnu-openmpi3-hpc-1.12.3-1.2.aarch64.rpm"
RPM_HASH = "5f7a1c6c89d7705ddde1b01f1b3987b624b78bbb10f08272324e3fc7684956baf6a155e470485c2ea1bb833e28e09b18bc20615a5171dbfe037a83a6347b0f44"

RPROVIDES:${PN} += "pnetcdf_1_12_3-gnu-openmpi3-hpc pnetcdf_1_12_3-gnu-openmpi3-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpnetcdf_1_12_3-gnu-openmpi3-hpc"

inherit rpm
