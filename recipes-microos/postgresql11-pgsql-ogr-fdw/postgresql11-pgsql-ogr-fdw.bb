SUMMARY = "PostgreSQL OGR Foreign Data Wrapper"
DESCRIPTION = "OGR is the vector half of the GDAL spatial data access library. \
It allows access to a large number of GIS data formats using a simple C API for data reading and writing. \
Since OGR exposes a simple table structure and PostgreSQL foreign data wrappers allow access to table structures, the fit seems pretty perfect."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "postgresql11-pgsql-ogr-fdw-1.1.0-4.1.aarch64.rpm"
RPM_HASH = "8216b7772b0f82df7287c769eea82de675010f7d9de5cbff8baf98ff5baf485aadfce0f6ce6a28ffcd713e4f1683d54c60b74cfa0243476e79345809dbf72a8a"

RPROVIDES:${PN} += "postgresql11-pgsql-ogr-fdw postgresql11-pgsql-ogr-fdw(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdal.so.32()(64bit) postgresql11-server"

inherit rpm
