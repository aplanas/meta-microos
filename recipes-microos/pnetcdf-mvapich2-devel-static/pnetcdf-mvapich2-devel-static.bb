SUMMARY = "Static development files for pnetcdf-mvapich2"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the mvapich2 versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-mvapich2-devel-static-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "f61e158a0432f7c2c86a418a629d3ada364aec3e4738e10845ba9151bd949b15a2a3b472d0d535bba04790e05bef429d652794099b5c53ebaf52985726d42519"

RPROVIDES:${PN} += "parallel-netcdf-mvapich2-devel-static pnetcdf-mvapich2-devel-static pnetcdf-mvapich2-devel-static(aarch-64)"
RDEPENDS:${PN} += "pnetcdf-mvapich2-devel"

inherit rpm
