SUMMARY = "Static development files for netcdf_4_9_2-gnu-openmpi1-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi1 version of the static libraries for NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi1-hpc-devel-static-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "296f2b8324426fdd2d84386fdc6b0ecb681343523de5148468dec02fcf52c036575761dd8603959943b26e7c2b4b8ab1f102e348e29023e1d235acdfa8cb9ae0"

RPROVIDES:${PN} += "netcdf_4_9_2-gnu-openmpi1-hpc-devel-static netcdf_4_9_2-gnu-openmpi1-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "libcurl-devel netcdf_4_9_2-gnu-openmpi1-hpc-devel zlib-devel"

inherit rpm
