SUMMARY = "Shared Object for applications that use civetweb embedded"
DESCRIPTION = "This package contains the shared library required by applications that \
are using civetweb's embeddable API to provide web services."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libcivetweb1_15_0-1.16-1.1.aarch64.rpm"
RPM_HASH = "8817567191c461f004bbd59407eb1fdc7ba874fde410497e199247f84f2d821542ca7776b8e0511043cd0ee6040c2e338c11db66651a891d72ad7fa1bfa0d1e1"

RPROVIDES:${PN} += "libcivetweb.so.1.15.0()(64bit) libcivetweb1_15_0 libcivetweb1_15_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
