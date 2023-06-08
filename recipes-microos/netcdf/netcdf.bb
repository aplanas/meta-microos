SUMMARY = "Command-line programs for the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains utility functions for working with NetCDF files."
LICENSE = "NetCDF"

PV = "4.9.2"

RPM_NAME = "netcdf-4.9.2-1.1.aarch64.rpm"
RPM_HASH = "5ff4bae217fc58a8e10ad0bd5ff5c8ec4cf808985513900d6dc83c22c237d2596a3cd4dcf27df19177aea0eb3f9e854e63b23be15656f3ad791b47d345b28144"

RPROVIDES:${PN} += "netcdf netcdf(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libhdf5.so.200()(64bit) libnetcdf.so.19()(64bit) libnetcdf19"

inherit rpm
