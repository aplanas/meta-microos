SUMMARY = "Static development files for pnetcdf_1_12_3-gnu-openmpi3-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the openmpi versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-openmpi3-hpc-devel-static-1.12.3-1.2.aarch64.rpm"
RPM_HASH = "17b863feacab96ce414046b97fc64619ec55903f398588e671aa0a61be1f32036354374afecfa431acc8bab552aa774ede2f8c5335ee71df44a619a8ecc448b7"

RPROVIDES:${PN} += "pnetcdf_1_12_3-gnu-openmpi3-hpc-devel-static \
pnetcdf_1_12_3-gnu-openmpi3-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "pnetcdf_1_12_3-gnu-openmpi3-hpc-devel"

inherit rpm
