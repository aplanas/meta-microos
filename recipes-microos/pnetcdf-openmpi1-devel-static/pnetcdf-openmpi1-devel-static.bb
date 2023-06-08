SUMMARY = "Static development files for pnetcdf-openmpi1"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the openmpi versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-openmpi1-devel-static-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "a1bebcf91e504c51f8730bb35b268392e6196a4177be777e234a9c0067438ee52b577a8d7c0927d0fe86bd42f89bef8f5e59fe15c647b034d52a831ffb61c73f"

RPROVIDES:${PN} += "parallel-netcdf-openmpi1-devel-static pnetcdf-openmpi1-devel-static pnetcdf-openmpi1-devel-static(aarch-64)"
RDEPENDS:${PN} += "pnetcdf-openmpi1-devel"

inherit rpm
