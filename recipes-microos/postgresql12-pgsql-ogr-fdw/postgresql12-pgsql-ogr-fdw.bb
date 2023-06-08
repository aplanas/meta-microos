SUMMARY = "PostgreSQL OGR Foreign Data Wrapper"
DESCRIPTION = "OGR is the vector half of the GDAL spatial data access library. \
It allows access to a large number of GIS data formats using a simple C API for data reading and writing. \
Since OGR exposes a simple table structure and PostgreSQL foreign data wrappers allow access to table structures, the fit seems pretty perfect."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "postgresql12-pgsql-ogr-fdw-1.1.0-4.1.aarch64.rpm"
RPM_HASH = "a8f85e6545eef847b25342ba91c92e54d3adc600b974456d9aca484cf4f46158db0813c7cfdadd059a25b10fb38b324c8e7d28cedbc23175d50bc2ce0476067c"

RPROVIDES:${PN} += "postgresql12-pgsql-ogr-fdw postgresql12-pgsql-ogr-fdw(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdal.so.32()(64bit) postgresql12-server"

inherit rpm
