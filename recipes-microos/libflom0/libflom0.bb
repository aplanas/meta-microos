SUMMARY = "Distributed lock manager library"
DESCRIPTION = "FLoM is a distributed lock manager that can be used to \
synchronize shell commands, scripts and custom developed software. \
 \
This package contains the shared library."
LICENSE = "GPL-2.0-only"

PV = "1.6.1"

RPM_NAME = "libflom0-1.6.1-1.1.aarch64.rpm"
RPM_HASH = "eef324d0471cf0478077c867583d5e4f48d9170886655b825eb8a0a727e9214c56c9c450e7824c72e86c836fa5198eb66c6802b34ab20c2aa138f9db44bbf2ff"

RPROVIDES:${PN} += "libflom.so.0()(64bit) libflom0 libflom0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
