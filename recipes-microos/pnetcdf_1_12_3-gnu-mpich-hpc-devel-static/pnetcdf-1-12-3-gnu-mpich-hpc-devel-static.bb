SUMMARY = "Static development files for pnetcdf_1_12_3-gnu-mpich-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the mpich versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-mpich-hpc-devel-static-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "c385165cf4e0f5efae9e6e8070e070196c8bbf65d4ccc44533b5dedd2505796dc1894655c842644ae9fc4b56da742152d231a3b1a9ffc6420d46fdefbd1dc9e3"

RPROVIDES:${PN} += "pnetcdf_1_12_3-gnu-mpich-hpc-devel-static pnetcdf_1_12_3-gnu-mpich-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "pnetcdf_1_12_3-gnu-mpich-hpc-devel"

inherit rpm
