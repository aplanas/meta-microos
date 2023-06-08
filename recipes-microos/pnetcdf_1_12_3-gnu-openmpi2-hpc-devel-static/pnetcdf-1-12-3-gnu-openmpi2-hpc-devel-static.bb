SUMMARY = "Static development files for pnetcdf_1_12_3-gnu-openmpi2-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the openmpi versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-openmpi2-hpc-devel-static-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "f68ca8fb2da5d973896231a7a9ba4f6ea0de2a46555376f066e308ee49b49cf8de65babecea21bbc22b7e6cc6623a5211b7710454e84676ce0925457606873ec"

RPROVIDES:${PN} += "pnetcdf_1_12_3-gnu-openmpi2-hpc-devel-static pnetcdf_1_12_3-gnu-openmpi2-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "pnetcdf_1_12_3-gnu-openmpi2-hpc-devel"

inherit rpm
