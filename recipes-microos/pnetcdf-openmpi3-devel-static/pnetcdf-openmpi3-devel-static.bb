SUMMARY = "Static development files for pnetcdf-openmpi3"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the openmpi versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-openmpi3-devel-static-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "0dbc40393b078b5abf052af477bc2c51e0fae4291bf3a76bd6dcc2547193ae473ce006237884415c65098dc32bc58f8eea842caecf425615f8e7627084fa3450"

RPROVIDES:${PN} += "parallel-netcdf-openmpi3-devel-static pnetcdf-openmpi3-devel-static pnetcdf-openmpi3-devel-static(aarch-64)"
RDEPENDS:${PN} += "pnetcdf-openmpi3-devel"

inherit rpm
