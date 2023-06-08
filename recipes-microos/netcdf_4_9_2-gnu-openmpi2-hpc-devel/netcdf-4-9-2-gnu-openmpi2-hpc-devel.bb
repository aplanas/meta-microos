SUMMARY = "Development files for netcdf_4_9_2-gnu-openmpi2-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi2 version of all files needed to create projects that use NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi2-hpc-devel-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "6b809271671e22cbe9fa2b53df52a272d72a0e7e2b49a078be1f83cf394d844ba4aa5789f1f2e98597ae97ed3ae8ef6f1391a6091be90fca9d8da6f47ffd6bc2"

RPROVIDES:${PN} += "netcdf_4_9_2-gnu-openmpi2-hpc-devel netcdf_4_9_2-gnu-openmpi2-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gnu-compilers-hpc-devel hdf5-gnu-openmpi2-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcurl-devel libcurl.so.4()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libnetcdf_4_9_2-gnu-openmpi2-hpc libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) openmpi2-gnu-hpc-devel pkgconfig zlib-devel"

inherit rpm
