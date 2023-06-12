SUMMARY = "A lightweight C library for storing RDF data in memory"
DESCRIPTION = "A lightweight C library for storing RDF data in memory. \
http://drobilla.net/software/sord/"
LICENSE = "ISC"

PV = "0.16.14"

RPM_NAME = "libsord-0-0-0.16.14-1.3.aarch64.rpm"
RPM_HASH = "2639ce3ce010bd70f1d0599f26bdf3223b1d85fc21dd8689336a773de31e940eade2702a62c691ff04940a07639c0e16b544bd46e021418c1561eeaa1388fb28"

RPROVIDES:${PN} += "libsord-0-0 \
libsord-0-0(aarch-64) \
libsord-0.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libserd-0.so.0()(64bit)"

inherit rpm
