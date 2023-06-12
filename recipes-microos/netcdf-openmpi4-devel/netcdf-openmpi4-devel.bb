SUMMARY = "Development files for netcdf-openmpi4"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi4 version of all files needed to create projects that use NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-openmpi4-devel-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "db17c8387f36aa98b82862d4a6cb1425e09de515af536acafeed81c00fcc360f2a483cc66bb64a8d6a126a6f5763b01b06edd44793f6aa688321f8c16cda21bd"

RPROVIDES:${PN} += "netcdf-openmpi4-devel \
netcdf-openmpi4-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
hdf5-openmpi4-devel \
libcurl-devel \
libnetcdf19-openmpi4 \
netcdf-devel-data \
openmpi4-devel \
pkgconfig \
zlib-devel"

inherit rpm
