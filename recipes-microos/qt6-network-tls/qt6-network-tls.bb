SUMMARY = "Backends used to handle secure connections"
DESCRIPTION = "TLS (and non-TLS) plugins used by the QSsl classes."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-network-tls-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "4c0a44c7085336a096e232a32a95896d55c50fc18a0238143fba9274b2b2a318a8080b54446ea38da33a9c6ac6efafa859447f90d374068da5c3bbb675f39602"

RPROVIDES:${PN} += "libqcertonlybackend.so()(64bit) libqcertonlybackend.so(Qt_6)(64bit) libqcertonlybackend.so(Qt_6.0)(64bit) libqcertonlybackend.so(Qt_6.1)(64bit) libqcertonlybackend.so(Qt_6.2)(64bit) libqcertonlybackend.so(Qt_6.3)(64bit) libqcertonlybackend.so(Qt_6.4)(64bit) libqcertonlybackend.so(Qt_6.5)(64bit) libqcertonlybackend.so(Qt_6.5.0_PRIVATE_API)(64bit) libqopensslbackend.so()(64bit) libqopensslbackend.so(Qt_6)(64bit) libqopensslbackend.so(Qt_6.0)(64bit) libqopensslbackend.so(Qt_6.1)(64bit) libqopensslbackend.so(Qt_6.2)(64bit) libqopensslbackend.so(Qt_6.3)(64bit) libqopensslbackend.so(Qt_6.4)(64bit) libqopensslbackend.so(Qt_6.5)(64bit) libqopensslbackend.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-network-tls qt6-network-tls(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6Network.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.32)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
