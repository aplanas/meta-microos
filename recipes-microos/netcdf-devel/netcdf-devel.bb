SUMMARY = "Development files for netcdf"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains all files needed to create projects that use NetCDF."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-devel-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "e300d80f3d7c25adc73f89cefa6f9fd8685dab31d528b1c55ebc8558052df56ec371331d01e4e54b82729b0e1d2ecc00efc49ff19a3083cc2004be547e4a7ead"

RPROVIDES:${PN} += "netcdf-devel netcdf-devel(aarch-64) pkgconfig(netcdf)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config hdf5-devel libcurl-devel libnetcdf19 netcdf-devel-data pkgconfig zlib-devel"

inherit rpm
