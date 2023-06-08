SUMMARY = "Development files for netcdf-fortran_4_5_3-gnu-openmpi1-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains all files needed to create projects that use \
the openmpi version of NetCDF."
LICENSE = "NetCDF"

PV = "4.5.3"

RPM_NAME = "netcdf-fortran_4_5_3-gnu-openmpi1-hpc-devel-4.5.3-4.5.aarch64.rpm"
RPM_HASH = "35c54ca7ffcc5cf71d2469d1b5a032edf4d24a8062e97feb315ab1b8d52b983f2d6df75d935fcd2ac771bb949de0879b3282da292dc3b2fa08220dd72e483a41"

RPROVIDES:${PN} += "netcdf-fortran_4_5_3-gnu-openmpi1-hpc netcdf-fortran_4_5_3-gnu-openmpi1-hpc-devel netcdf-fortran_4_5_3-gnu-openmpi1-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gnu-compilers-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcurl-devel libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_10)(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libnetcdf-fortran_4_5_3-gnu-openmpi1-hpc netcdf-gnu-openmpi1-hpc-devel openmpi1-gnu-hpc-devel pkgconfig zlib-devel"

inherit rpm
