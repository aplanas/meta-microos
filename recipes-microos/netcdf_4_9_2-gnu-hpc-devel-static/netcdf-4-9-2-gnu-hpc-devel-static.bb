SUMMARY = "Static development files for netcdf_4_9_2-gnu-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the static libraries for NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-hpc-devel-static-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "96787d29b857dd54b7ee6ae949f7c802391adab4c6cee2ee8a9962e1f88c25d96ebf805f40fe7fb88f487b0878314ce8ed05d8f0fd2cd8fa12978fabff13638d"

RPROVIDES:${PN} += "netcdf_4_9_2-gnu-hpc-devel-static netcdf_4_9_2-gnu-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "libcurl-devel netcdf_4_9_2-gnu-hpc-devel zlib-devel"

inherit rpm
