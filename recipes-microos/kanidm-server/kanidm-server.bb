SUMMARY = "Kanidm server and related tools"
DESCRIPTION = "Server for kanidm providing the main authentication and identity service"
LICENSE = "MPL-2.0"

PV = "1.1.0~alpha11~git0.d3a2a6b"

RPM_NAME = "kanidm-server-1.1.0~alpha11~git0.d3a2a6b-3.1.aarch64.rpm"
RPM_HASH = "b12ff12d91c0628589dc8af3cbcf11cfaf2c37d8e326a02021b67f3c912bdfb7d99ff92530c144b797a866cfc2a6f2072df9dc2b0658d59cdb301956d840a89c"

RPROVIDES:${PN} += "config(kanidm-server) kanidm-server kanidm-server(aarch-64)"
RDEPENDS:${PN} += "/bin/sh kanidm-clients libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libz.so.1()(64bit)"

inherit rpm
