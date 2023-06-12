SUMMARY = "Static development files for netcdf_4_9_2-gnu-openmpi4-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi4 version of the static libraries for NetCDF \
built for the gnu compiler."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf_4_9_2-gnu-openmpi4-hpc-devel-static-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "353a2bf1b0488f4d55a4de32c615666a49ef557615ce9edd79481cb3642097766465dee425a2b318450b709b71b68d6e5021081a3f2f4696aba808a38b0cea1b"

RPROVIDES:${PN} += "netcdf_4_9_2-gnu-openmpi4-hpc-devel-static \
netcdf_4_9_2-gnu-openmpi4-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "libcurl-devel \
netcdf_4_9_2-gnu-openmpi4-hpc-devel \
zlib-devel"

inherit rpm
