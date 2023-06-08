SUMMARY = "A client library for the LibreGraphAPI library"
DESCRIPTION = "Libregraphapi is a MS Graph API influenced API for cloud collaboration."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "libLibreGraphAPI1-1.0.1-1.3.aarch64.rpm"
RPM_HASH = "262f1a765145944558dc29a57ef8607ba6119ca75c40627188c53a9b8c824ed8f9f3cf7bf4dc999cb6ed254ccb8b1b0c8773fb5ae60bd2e8b917e3c848ef684f"

RPROVIDES:${PN} += "libLibreGraphAPI.so.1()(64bit) libLibreGraphAPI1 libLibreGraphAPI1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
