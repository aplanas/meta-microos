SUMMARY = "Additional internal libraries for the MariaDB C Connector"
DESCRIPTION = "MariaDB Connector is used to connect applications developed in \
C or C++ to MariaDB and MySQL databases. \
 \
This package holds the runtime components with private API."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.4"

RPM_NAME = "libmariadbprivate-3.3.4-1.3.aarch64.rpm"
RPM_HASH = "4da0b58a7c0b0fbf06a08d8509eb12990e20ecb44f600e51d9e6712d484443f24b248ffca852cb601250371c699f30b6a1beff01fc486d3db1b9fac0750877f3"

RPROVIDES:${PN} += "libmariadbprivate libmariadbprivate(aarch-64) libmariadbprivate.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libz.so.1()(64bit)"

inherit rpm
