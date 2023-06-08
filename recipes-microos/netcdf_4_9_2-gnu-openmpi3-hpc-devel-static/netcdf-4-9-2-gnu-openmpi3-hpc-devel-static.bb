SUMMARY = "Static development files for netcdf_4_9_2-gnu-openmpi3-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi3 version of the static libraries for NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi3-hpc-devel-static-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "86997cb06cae7e9b824fce1aa0e736a84de225c301ea849d6adb1e63a47660fabde28fa0663bf9d7d93e33bd1a0939f338bd76b7835d39dc606c484e8f17f0d5"

RPROVIDES:${PN} += "netcdf_4_9_2-gnu-openmpi3-hpc-devel-static netcdf_4_9_2-gnu-openmpi3-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "libcurl-devel netcdf_4_9_2-gnu-openmpi3-hpc-devel zlib-devel"

inherit rpm
