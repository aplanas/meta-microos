SUMMARY = "Static development files for netcdf"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the static libraries for NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-devel-static-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "3d77f0de14e02204f8d4bfbbd86dcb492d1c8aceb50642298ecd58b20db313b920f1c0323972ff338685ec1219ad6cb9e0f4a11a9ff879e126897bb39181402b"

RPROVIDES:${PN} += "netcdf-devel-static netcdf-devel-static(aarch-64)"
RDEPENDS:${PN} += "hdf5-devel libcurl-devel zlib-devel"

inherit rpm
