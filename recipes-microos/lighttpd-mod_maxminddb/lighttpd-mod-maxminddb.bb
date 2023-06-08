SUMMARY = "MaxMind GeoIP2 database support for Lighttp"
DESCRIPTION = "This module supports fast ip/location lookups using MaxMind \
GeoIP2 databases."
LICENSE = "BSD-3-Clause"

PV = "1.4.69"

RPM_NAME = "lighttpd-mod_maxminddb-1.4.69-1.3.aarch64.rpm"
RPM_HASH = "95e453578071a7162f857a83c573d1898e1ea0d7ec6841d15584e55bdacebbaff092894f1e3792c9faead1ae7cc3a3645c2ec3e96075df2b98731953263ff8bc"

RPROVIDES:${PN} += "lighttpd-mod_maxminddb lighttpd-mod_maxminddb(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libmaxminddb.so.0()(64bit) lighttpd"

inherit rpm
