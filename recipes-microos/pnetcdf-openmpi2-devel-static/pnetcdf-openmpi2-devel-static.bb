SUMMARY = "Static development files for pnetcdf-openmpi2"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the openmpi versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-openmpi2-devel-static-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "410b9bf75b081c96456385b0651d59286c17b67006d8bbf309a871d14339a8841a11b3406e4fc71b7700f6785d5c7bd1e20aa2404beaf336575b81144ad7e6dd"

RPROVIDES:${PN} += "parallel-netcdf-openmpi2-devel-static pnetcdf-openmpi2-devel-static pnetcdf-openmpi2-devel-static(aarch-64)"
RDEPENDS:${PN} += "pnetcdf-openmpi2-devel"

inherit rpm
