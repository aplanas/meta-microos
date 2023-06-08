SUMMARY = "Static development files for netcdf-openmpi4"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi4 version of the static libraries for NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi4-devel-static-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "a432fecadb163536b5019e2c5070dc3aee829d5898b7c62a6ce5a24adca218d58c1f3488e707cf2665ab4dd8e3304b6640dc2f59c57525fc8ff4ff70ced9f5a5"

RPROVIDES:${PN} += "netcdf-openmpi4-devel-static netcdf-openmpi4-devel-static(aarch-64)"
RDEPENDS:${PN} += "hdf5-openmpi4-devel libcurl-devel zlib-devel"

inherit rpm
