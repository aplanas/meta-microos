SUMMARY = "Additional internal libraries for the MariaDB C Connector"
DESCRIPTION = "MariaDB Connector is used to connect applications developed in \
C or C++ to MariaDB and MySQL databases. \
 \
This package holds the runtime components with private API."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.5"

RPM_NAME = "libmariadbprivate-3.3.5-1.1.aarch64.rpm"
RPM_HASH = "ef85305ea78294d9e25b5482dbb72e442022eedc4e24c735887c09eaf99c0d3d3f3a7beba2761cb2330c6ecb926f6abd9603f67123eba47c5c2342f28d960e28"

RPROVIDES:${PN} += "libmariadbprivate libmariadbprivate(aarch-64) libmariadbprivate.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libz.so.1()(64bit)"

inherit rpm
