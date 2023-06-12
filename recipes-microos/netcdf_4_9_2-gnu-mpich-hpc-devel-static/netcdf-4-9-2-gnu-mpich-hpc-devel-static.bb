SUMMARY = "Static development files for netcdf_4_9_2-gnu-mpich-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the mpich version of the static libraries for NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-mpich-hpc-devel-static-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "edff2ca568eeffa5dbd5aabf8fc5754f93b89f0126b3d046e67e892d053c76ec720fe9db926f2d9fefc31c9b5b37e8df9473a0bbfe12a3a0cf16e2c14936e783"

RPROVIDES:${PN} += "netcdf_4_9_2-gnu-mpich-hpc-devel-static \
netcdf_4_9_2-gnu-mpich-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "libcurl-devel \
netcdf_4_9_2-gnu-mpich-hpc-devel \
zlib-devel"

inherit rpm
