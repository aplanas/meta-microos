SUMMARY = "Static development files for pnetcdf_1_12_3-gnu-mvapich2-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the mvapich2 versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-mvapich2-hpc-devel-static-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "b86f5f2bc8efc8cabac0c5f8e850762a141460e70162805ac18bcb557336cbfd5e3bf154aa24368dff16bb6deb35bc58ca3efc75b659bddb18aaf0767c1628ef"

RPROVIDES:${PN} += "pnetcdf_1_12_3-gnu-mvapich2-hpc-devel-static \
pnetcdf_1_12_3-gnu-mvapich2-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "pnetcdf_1_12_3-gnu-mvapich2-hpc-devel"

inherit rpm
